package com.hribol.spiderman.record;

import com.hribol.spiderman.core.utils.ConfigurationUtils;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordRequestFilter implements RequestFilter {
    private List<Map<String, String>> domainSpecificActionList;

    public RecordRequestFilter(List<Map<String, String>> domainSpecificActionList) {
        this.domainSpecificActionList = domainSpecificActionList;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (httpRequest.getUri().contains("http://working-selenium.com/submit-event")) {
            try {
                Map<String, String> map = ConfigurationUtils.splitQuery(new URL(httpRequest.getUri()));
                domainSpecificActionList.add(map);
                System.out.println(map);
            } catch (UnsupportedEncodingException | MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}