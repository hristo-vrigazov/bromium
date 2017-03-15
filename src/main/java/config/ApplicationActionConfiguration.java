package config;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ApplicationActionConfiguration {
    private String name;
    private ConditionForExecutionConfiguration conditionBeforeExecution;
    private ConditionForExecutionConfiguration conditionAfterExecution;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConditionForExecutionConfiguration getConditionBeforeExecution() {
        return conditionBeforeExecution;
    }

    public void setConditionBeforeExecution(ConditionForExecutionConfiguration conditionBeforeExecution) {
        this.conditionBeforeExecution = conditionBeforeExecution;
    }

    public ConditionForExecutionConfiguration getConditionAfterExecution() {
        return conditionAfterExecution;
    }

    public void setConditionAfterExecution(ConditionForExecutionConfiguration conditionAfterExecution) {
        this.conditionAfterExecution = conditionAfterExecution;
    }
}
