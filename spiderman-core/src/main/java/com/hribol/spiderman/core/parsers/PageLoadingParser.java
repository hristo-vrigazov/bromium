package com.hribol.spiderman.core.parsers;

import com.hribol.spiderman.core.actions.PageLoading;
import com.hribol.spiderman.core.actions.WebDriverAction;

import java.util.Map;

import static com.hribol.spiderman.core.utils.Constants.EVENT;
import static com.hribol.spiderman.core.utils.Constants.URL;

/**
 * Created by hvrigazov on 13.05.17.
 */
public class PageLoadingParser implements WebDriverActionParameterParser {

    private String baseURL;

    public PageLoadingParser(String baseURL) {
        this.baseURL = baseURL;
    }

    @Override
    public WebDriverAction create(Map<String, String> parameters, boolean expectHttpRequest) {
        String url = this.baseURL + parameters.get(URL);
        String event = parameters.get(EVENT);
        return new PageLoading(url, event);
    }
}
