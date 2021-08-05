package com.bms.monitoring;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CurrentRangeTest {

    @Test
    public void testForNullInput() {
        Map<String, Integer> result = CurrentRange.checkRangeReadings(null);

        assertNull(result);
    }

    @Test
    public void testForEmptyList() {
        List<Integer> numberList = new ArrayList<>();

        Map<String, Integer> result = CurrentRange.checkRangeReadings(numberList);

        assertNull(result);
    }

    @Test
    public void testForList() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(3);
        numberList.add(5);
        numberList.add(4);
        numberList.add(10);
        numberList.add(11);
        numberList.add(12);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("3-5", 4);
        expected.put("10-12", 3);

        Map<String, Integer> result = CurrentRange.checkRangeReadings(numberList);

        assertEquals(expected, result);
    }

}