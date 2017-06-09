package com.hribol.bromium.record.javascript.generation.functions.factory;

import com.hribol.bromium.record.javascript.generation.functions.ClickCssSelectorRecorderFunction;
import org.junit.Test;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class ClickCssSelectorRecorderFunctionTest {

    @Test
    public void buildsDeclarationFunction() {
        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction = new ClickCssSelectorRecorderFunction();

        System.out.println(clickCssSelectorRecorderFunction.getJavascriptCode());
    }
}
