package com.bms.monitoring;

import java.util.List;
import java.util.Map;

public final class CurrentRange {

    public static Map<String, Integer> checkRangeReadings(List<Integer> currentRange) {
        Map<String, Integer> currentRangeResult = null;
        if(currentRange == null || currentRange.isEmpty()){
            currentRangeResult = null;
        }
        return currentRangeResult;
    }
}
