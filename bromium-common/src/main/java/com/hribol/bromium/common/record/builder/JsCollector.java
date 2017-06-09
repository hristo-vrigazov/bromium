package com.hribol.bromium.common.record.builder;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class JsCollector {

    private StringBuilder stringBuilder = new StringBuilder();

    public JsFunctionDeclarerBuilder declareFunction(String functionName) {
        return new JsFunctionDeclarerBuilder(functionName, this);
    }

    public JsCollector write(String string) {
        stringBuilder.append(string);
        return this;
    }

    public String build() {
        return stringBuilder.toString();
    }
}
