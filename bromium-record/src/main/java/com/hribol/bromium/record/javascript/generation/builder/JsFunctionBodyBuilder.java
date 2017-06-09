package com.hribol.bromium.record.javascript.generation.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsFunctionBodyBuilder {
    private JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder;
    private StringBuilder stringBuilder;

    public JsFunctionBodyBuilder(JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder) {
        this.jsFunctionDeclarerBuilder = jsFunctionDeclarerBuilder;
        this.stringBuilder = new StringBuilder();
    }

    public JsCollector endBody() {
        return jsFunctionDeclarerBuilder.write(stringBuilder.toString());
    }

    public JsArriveHandlerBuilder whenCssSelectorArrives(String cssSelector) {

        return new JsArriveHandlerBuilder(cssSelector, this);
    }

    public JsFunctionBodyBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }
}
