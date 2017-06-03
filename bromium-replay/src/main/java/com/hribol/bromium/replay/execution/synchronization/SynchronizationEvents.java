package com.hribol.bromium.replay.execution.synchronization;

/**
 * Created by hvrigazov on 03.06.17.
 */
public class SynchronizationEvents {

    public static SynchronizationEvent noHttpRequestsInQueue() {
        return () -> "hoho";
    }

}
