package com.hribol.bromium.common.replay;

import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.filters.StateConditionsUpdater;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubstitutionRegistrationUpdater implements StateConditionsUpdater {

    private final static Logger logger = LoggerFactory.getLogger(SubstitutionRegistrationUpdater.class);

    @Override
    public void update(ReplayingState replayingState, String event) {
        logger.info("Registering substitution: {}", event);
        String[] split = event.split("=");
        String valueToBeReplaced = split[0];
        String replacement = split[1];
        replayingState.registerSubstitution(valueToBeReplaced, replacement);
    }

}
