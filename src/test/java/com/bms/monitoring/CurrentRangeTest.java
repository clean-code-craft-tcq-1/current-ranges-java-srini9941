package com.bms.monitoring;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CurrentRangeTest {

    @Test
    void testForNullInput() {
        Map<String, Integer> result = CurrentRange.checkRangeReadings(null);

        assertNull(result);
    }

    @Test
    void testForEmptyList() {
        List<Integer> numberList = new ArrayList<>();

        Map<String, Integer> result = CurrentRange.checkRangeReadings(numberList);

        assertNull(result);
    }

}