package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.JsFunctionCallback;
import com.hribol.bromium.core.config.JsFunctionInvocation;
import com.hribol.bromium.dsl.bromium.ActionContext;
import com.hribol.bromium.dsl.bromium.ClassByText;
import com.hribol.bromium.dsl.bromium.CssSelector;
import com.hribol.bromium.dsl.bromium.CssSelectorByText;
import com.hribol.bromium.dsl.bromium.Locator;
import com.hribol.bromium.dsl.bromium.RowIndex;
import com.hribol.bromium.dsl.bromium.RowLocator;
import com.hribol.bromium.dsl.bromium.RowSelector;
import com.hribol.bromium.dsl.bromium.TableActionContext;

import java.util.function.Function;

public class ASTRecorderJsContextConverter implements ASTNodeConverter<ActionContext, Function<JsFunctionInvocation, String>> {

    private final static String TABLE = "table";
    private final static String ROW = "row";
    private final static String CONTEXT = "context";
    private final static String PARAMETER_ENRICHMENT_FUNCTIONS = "parametersEnrichmentFunctions";
    private final static String PARAMETERS = "parameters";

    @Override
    public Function<JsFunctionInvocation, String> convert(ActionContext actionContext) {
        return actionContext == null ?
                invocation -> "var parameters = {};\n\t" +
                        "var parametersEnrichmentFunctions = [];\n\t"+
                        "var context = document;\n\t" + invocation.getInvocation() :
                invocation -> "var parameters = {};\n\t" +
                        "var parametersEnrichmentFunctions = [];\n\t"+
                        "var context = document;\n\t" + getActionContextMultiple(invocation, actionContext);
    }

    private String getActionContextMultiple(JsFunctionInvocation invocation, ActionContext actionContext) {
        JsFunctionInvocation context = getActionContext(invocation, "context", actionContext);
        return context.getInvocation();
    }

    private JsFunctionInvocation getActionContext(JsFunctionInvocation invocation, String context, ActionContext actionContext) {
        if (actionContext instanceof TableActionContext) {
            return getTableActionContext(invocation, context, (TableActionContext) actionContext);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + actionContext);
    }

    private JsFunctionInvocation getTableActionContext(JsFunctionInvocation invocation, String context, TableActionContext actionContext) {
        JsFunctionInvocation rowLocatorInvocation = getRowSelector(invocation, ROW, actionContext.getRowsLocator(), actionContext.getRowSelector());
        JsFunctionInvocation rowsLocatorInvocation = getLocator(rowLocatorInvocation, TABLE, actionContext.getRowsLocator(), false);
        JsFunctionInvocation tableLocatorInvocation = getLocator(rowsLocatorInvocation, context, actionContext.getTableLocator(), false);
        JsFunctionCallback rowsLocator = new JsFunctionCallback().argument(TABLE).body(rowsLocatorInvocation);
        JsFunctionCallback rowLocator = new JsFunctionCallback().argument(ROW).body(rowLocatorInvocation);
        JsFunctionCallback finalCall = new JsFunctionCallback().argument(invocation.isLeaf() ? CONTEXT : TABLE).body(invocation);
        rowLocatorInvocation.callback(finalCall);
        rowsLocatorInvocation.callback(rowLocator);
        tableLocatorInvocation.callback(rowsLocator);
        return tableLocatorInvocation;
    }

    private JsFunctionInvocation getRowSelector(JsFunctionInvocation invocation, String context, Locator locator, RowSelector rowSelector) {
        if (rowSelector instanceof RowIndex) {
            return getRowIndex(invocation, context, locator, (RowIndex) rowSelector);
        } else if (rowSelector instanceof RowLocator) {
            return getRowLocator(invocation, context, (RowLocator) rowSelector);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + rowSelector);
    }

    private JsFunctionInvocation getLocator(JsFunctionInvocation invocation, String context, Locator locator, boolean returnParent) {
        if (locator instanceof CssSelector) {
            return getCssSelector(context, (CssSelector) locator, returnParent);
        } else if (locator instanceof ClassByText) {
            return getClassByText(context, (ClassByText) locator, returnParent);
        } else if (locator instanceof ActionContext) {
            return getActionContext(invocation, context, (ActionContext) locator);
        } else if (locator instanceof CssSelectorByText) {
            return getCssSelectorByText(context, (CssSelectorByText) locator, returnParent);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + locator);
    }

    private JsFunctionInvocation getCssSelectorByText(String context, CssSelectorByText locator, boolean returnParent) {
        return new JsFunctionInvocation(CssSelectorByText.class.getSimpleName())
                .string(locator.getSelector().getContent())
                .string(locator.getText().getExposedParameter().getName())
                .literal(String.valueOf(returnParent))
                .variable(context)
                .variable(PARAMETER_ENRICHMENT_FUNCTIONS)
                .variable(PARAMETERS);
    }

    private JsFunctionInvocation getClassByText(String context, ClassByText locator, boolean returnParent) {
        return new JsFunctionInvocation(ClassByText.class.getSimpleName())
                .string(locator.getKlass().getContent())
                .string(locator.getText().getExposedParameter().getName())
                .literal(String.valueOf(returnParent))
                .variable(context)
                .variable(PARAMETER_ENRICHMENT_FUNCTIONS)
                .variable(PARAMETERS);
    }

    private JsFunctionInvocation getCssSelector(String context, CssSelector locator, boolean returnParent) {
        return new JsFunctionInvocation(CssSelector.class.getSimpleName())
                .string(locator.getSelector().getContent())
                .literal(String.valueOf(returnParent))
                .variable(context)
                .variable(PARAMETER_ENRICHMENT_FUNCTIONS)
                .variable(PARAMETERS);
    }

    private JsFunctionInvocation getEagerLocator(JsFunctionInvocation invocation, String context, Locator locator) {
        if (locator instanceof CssSelector) {
            return getEagerCssSelector(context, (CssSelector) locator);
        } else if (locator instanceof ClassByText) {
            return getEagerClassByText(context, (ClassByText) locator);
        } else if (locator instanceof ActionContext) {
            return getEagerActionContext(invocation, context, (ActionContext) locator);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + locator);
    }

    private JsFunctionInvocation getEagerActionContext(JsFunctionInvocation invocation, String context, ActionContext locator) {
        //TODO: implement - this is for recursive dependencies
        throw new UnsupportedOperationException();
    }

    private JsFunctionInvocation getEagerClassByText(String context, ClassByText locator) {
        return new JsFunctionInvocation("Eager" + ClassByText.class.getSimpleName())
                .string(locator.getKlass().getContent())
                .string(locator.getText().getExposedParameter().getName())
                .variable(context)
                .trailingSemicolon(false);
    }

    private JsFunctionInvocation getEagerCssSelector(String context, CssSelector locator) {
        return new JsFunctionInvocation("Eager" + CssSelector.class.getSimpleName())
                .string(locator.getSelector().getContent())
                .variable(TABLE)
                .trailingSemicolon(false);
    }

    private JsFunctionInvocation getRowLocator(JsFunctionInvocation jsFunctionInvocation, String context, RowLocator rowSelector) {
        return getLocator(jsFunctionInvocation, context, rowSelector.getRowLocator(), true);
    }

    private JsFunctionInvocation getRowIndex(JsFunctionInvocation jsFunctionInvocation, String context, Locator locator, RowIndex rowIndex) {
        return new JsFunctionInvocation(RowIndex.class.getSimpleName())
                .string(rowIndex.getIndex().getExposedParameter().getName())
                .invocation(getEagerLocator(jsFunctionInvocation, context, locator))
                .variable(ROW)
                .variable(PARAMETER_ENRICHMENT_FUNCTIONS)
                .variable(PARAMETERS);
    }



}
