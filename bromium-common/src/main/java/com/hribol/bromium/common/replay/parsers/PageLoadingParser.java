package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.PageLoading;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.PAGE;

/**
 * A parser for {@link PageLoading} events
 */
public class PageLoadingParser implements WebDriverActionParameterParser {

    private String baseURL;

    public PageLoadingParser(String baseURL) {
        this.baseURL = baseURL;
    }

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest, Function<WebDriver, SearchContext> contextProvider) {
        String url = this.baseURL + parameters.get(PAGE);
        String event = parameters.get(EVENT);
        return new PageLoading(url, event);
    }
}
