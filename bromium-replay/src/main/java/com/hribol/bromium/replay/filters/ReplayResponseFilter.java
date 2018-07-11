package com.hribol.bromium.replay.filters;

import com.hribol.bromium.core.utils.JavascriptInjectionPreparator;
import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayResponseFilter implements ResponseFilter {

    private final static Logger logger = LoggerFactory.getLogger(ReplayResponseFilter.class);

    private String injectionCode;
    private ReplayingState replayingState;
    private Predicate<HttpRequest> shouldInjectJavascriptPredicate;

    public ReplayResponseFilter(String injectionCode,
                                ReplayingState replayingState,
                                Predicate<HttpRequest> shouldInjectJavascriptPredicate) {
        this.injectionCode = injectionCode;
        this.replayingState = replayingState;
        this.shouldInjectJavascriptPredicate = shouldInjectJavascriptPredicate;
    }

    @Override
    public void filterResponse(HttpResponse httpResponse, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        logger.debug(replayingState.getSubstitutions().toString());

        Optional<String> substitutionsInjectionOptional = getSubstitutionEmittingCode();

        if (shouldInjectJavascriptPredicate.test(httpMessageInfo.getOriginalRequest())) {
            httpMessageContents.setTextContents(injectionCode + substitutionsInjectionOptional.orElse("")  + httpMessageContents.getTextContents());
        }

        replayingState.removeHttpRequestFromQueue(httpMessageInfo.getOriginalRequest());
        replayingState.signalizeIfNoHttpQueriesInQueue();
    }

    private Optional<String> getSubstitutionEmittingCode() {
        Optional<String> substitutionsInjectionOptional = Optional.empty();
        try {
            if (replayingState.getSubstitutions().isEmpty()) {
                return Optional.empty();
            }
            StringBuilder stringBuilder = new StringBuilder();

            for (Map.Entry<String, String> substitutionEntry: replayingState.getSubstitutions().entrySet()) {
                stringBuilder
                        .append("bromium.emitAllSubstitutions('" + substitutionEntry.getKey() + "', '" + substitutionEntry.getValue() + "');")
                        .append(System.lineSeparator());
            }

            substitutionsInjectionOptional = Optional.of(
                    new JavascriptInjectionPreparator(new StringReader(stringBuilder.toString())).getInjectionCode());
        } catch (IOException e) {
            logger.error("Error while building substitutions emitting code!", e);
        }
        return substitutionsInjectionOptional;
    }

}
