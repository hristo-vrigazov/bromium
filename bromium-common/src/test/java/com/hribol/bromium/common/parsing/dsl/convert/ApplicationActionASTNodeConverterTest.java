package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 16.11.17.
 */
public class ApplicationActionASTNodeConverterTest extends BaseDSLConfigurationConverterTest {

    private Model model = readExample();

    private ASTNodeConverter<WebDriverActionCondition, WebDriverActionConfiguration> conditionToActionConverter;
    private ASTNodeConverter<WebDriverAction, WebDriverActionConfiguration> actionToActionConverter;
    private ASTNodeConverter<SyntaxDefinition, SyntaxDefinitionConfiguration> syntaxDefinitionConverter;

    private WebDriverActionConfiguration nothingMock;

    private WebDriverActionConfiguration preconditionMock;
    private WebDriverActionConfiguration actionMock;
    private WebDriverActionConfiguration postconditionMock;
    private List<SyntaxDefinitionConfiguration> syntaxDefinitionsMock;


    @Test
    public void convertsFirstAction() {
        baseTest(0,
                "typeUsernameField",
                false,
                true);

    }

    @Test
    public void convertsSecondAction() {
        baseTest(1, "clickLoginButton", true, false);
    }

    @Test
    public void convertsThirdAction() {
        baseTest(2,
                "typePasswordField",
                false,
                false);
    }

    private ApplicationActionConfiguration baseTest(int index,
                                                    String actionName,
                                                    boolean expectsHttpRequest,
                                                    boolean hasPreconditionAndPostCondition) {
        ApplicationAction applicationAction = model.getActions().get(index);
        initializeMocks(applicationAction);

        if (hasPreconditionAndPostCondition) {
            wirePreconditionAndPostCondition(applicationAction);
        }

        ApplicationActionASTNodeConverter converter = new ApplicationActionASTNodeConverter(
                conditionToActionConverter,
                actionToActionConverter,
                syntaxDefinitionConverter);
        ApplicationActionConfiguration actionConfiguration = converter.convert(applicationAction);

        assertEquals(actionName, actionConfiguration.getName());
        assertEquals(expectsHttpRequest, actionConfiguration.expectsHttpRequest());
        assertEquals(actionMock, actionConfiguration.getWebDriverAction());
        assertEquals(syntaxDefinitionsMock, actionConfiguration.getSyntaxDefinitionConfigurationList());

        if (hasPreconditionAndPostCondition) {
            assertEquals(preconditionMock, actionConfiguration.getConditionBeforeExecution());
            assertEquals(postconditionMock, actionConfiguration.getConditionAfterExecution());
        }

        return actionConfiguration;
    }

    private void wirePreconditionAndPostCondition(ApplicationAction applicationAction) {
        when(conditionToActionConverter.convert(applicationAction.getPrecondition().getAction())).thenReturn(preconditionMock);
        when(conditionToActionConverter.convert(applicationAction.getPostcondition().getAction())).thenReturn(postconditionMock);
    }

    private void initializeMocks(ApplicationAction applicationAction) {
        conditionToActionConverter = mock(ASTNodeConverter.class);
        actionToActionConverter = mock(ASTNodeConverter.class);
        syntaxDefinitionConverter = mock(ASTNodeConverter.class);

        preconditionMock = mock(WebDriverActionConfiguration.class);
        actionMock = mock(WebDriverActionConfiguration.class);
        postconditionMock = mock(WebDriverActionConfiguration.class);

        syntaxDefinitionsMock = new ArrayList<>();

        when(actionToActionConverter.convert(applicationAction.getWebDriverAction())).thenReturn(actionMock);

        for (int i = 0; i < applicationAction.getSyntaxDefinitions().size(); i++) {
            SyntaxDefinitionConfiguration mockSyntaxDefinition = mock(SyntaxDefinitionConfiguration.class);
            syntaxDefinitionsMock.add(mockSyntaxDefinition);
            when(syntaxDefinitionConverter.convert(applicationAction.getSyntaxDefinitions().get(i)))
                    .thenReturn(syntaxDefinitionsMock.get(i));
        }
    }

}
