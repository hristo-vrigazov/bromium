package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.JsFunctionCallback;
import com.hribol.bromium.core.config.JsFunctionInvocation;
import com.hribol.bromium.dsl.bromium.ActionContext;
import com.hribol.bromium.dsl.bromium.ClassByText;
import com.hribol.bromium.dsl.bromium.CssSelector;
import com.hribol.bromium.dsl.bromium.Locator;
import com.hribol.bromium.dsl.bromium.RowIndex;
import com.hribol.bromium.dsl.bromium.RowLocator;
import com.hribol.bromium.dsl.bromium.RowSelector;
import com.hribol.bromium.dsl.bromium.TableActionContext;

import java.util.function.Function;

public class ASTRecorderJsContextConverter implements ASTNodeConverter<ActionContext, Function<JsFunctionInvocation, String>> {

    private final static String table = "table";
    private final static String row = "row";

    @Override
    public Function<JsFunctionInvocation, String> convert(ActionContext actionContext) {
        return actionContext == null ?
                invocation -> "var parameters = {};\n\t" +
                        "var parametersEnrichmentFunctions = [];\n\t"+
                        "var context = document;\n\t" + invocation.getInvocation() :
                invocation -> getActionContextMultiple(invocation, actionContext);
    }

    private String getActionContextMultiple(JsFunctionInvocation invocation, ActionContext actionContext) {
        return getActionContext(invocation, "context", actionContext).getInvocation();
    }

    private JsFunctionInvocation getActionContext(JsFunctionInvocation invocation, String context, ActionContext actionContext) {
        if (actionContext instanceof TableActionContext) {
            return getTableActionContext(invocation, context, (TableActionContext) actionContext);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + actionContext);
    }

    private JsFunctionInvocation getTableActionContext(JsFunctionInvocation invocation, String context, TableActionContext actionContext) {
        JsFunctionInvocation tableLocatorInvocation = getLocator(invocation, context, actionContext.getTableLocator());
        JsFunctionInvocation rowsLocatorInvocation = getLocator(invocation, table, actionContext.getRowsLocator());
        JsFunctionInvocation rowLocatorInvocation = getRowSelector(invocation, row, actionContext.getRowsLocator(), actionContext.getRowSelector());
        JsFunctionCallback rowsLocator = new JsFunctionCallback().argument(table).body(rowsLocatorInvocation);
        JsFunctionCallback rowLocator = new JsFunctionCallback().argument(row).body(rowLocatorInvocation);
        tableLocatorInvocation.callback(rowsLocator);
        rowsLocatorInvocation.callback(rowLocator);
        rowLocator.body(invocation);
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

    private JsFunctionInvocation getLocator(JsFunctionInvocation invocation, String context, Locator locator) {
        if (locator instanceof CssSelector) {
            return getCssSelector(context, (CssSelector) locator);
        } else if (locator instanceof ClassByText) {
            return getClassByText(context, (ClassByText) locator);
        } else if (locator instanceof ActionContext) {
            return getActionContext(invocation, context, (ActionContext) locator);
        }

        throw new IllegalArgumentException("Unrecognized rule: " + locator);
    }

    private JsFunctionInvocation getClassByText(String context, ClassByText locator) {
        return new JsFunctionInvocation(ClassByText.class.getSimpleName())
                .string(locator.getKlass().getContent())
                .string(locator.getText().getExposedParameter().getName())
                .variable(context);
    }

    private JsFunctionInvocation getCssSelector(String context, CssSelector locator) {
        return new JsFunctionInvocation(CssSelector.class.getSimpleName())
                .string(locator.getSelector().getContent())
                .variable(context);
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
                .variable(context);
    }

    private JsFunctionInvocation getEagerCssSelector(String context, CssSelector locator) {
        return new JsFunctionInvocation("Eager" + CssSelector.class.getSimpleName())
                .string(locator.getSelector().getContent())
                .variable(row)
                .variable(context);
    }

    private JsFunctionInvocation getRowLocator(JsFunctionInvocation jsFunctionInvocation, String context, RowLocator rowSelector) {
        return getLocator(jsFunctionInvocation, context, rowSelector.getRowLocator());
    }

    private JsFunctionInvocation getRowIndex(JsFunctionInvocation jsFunctionInvocation, String context, Locator locator, RowIndex rowIndex) {
        return new JsFunctionInvocation(RowIndex.class.getSimpleName())
                .string(rowIndex.getIndex().getExposedParameter().getName())
                .invocation(getEagerLocator(jsFunctionInvocation, context, locator))
                .variable(row);
    }



}
