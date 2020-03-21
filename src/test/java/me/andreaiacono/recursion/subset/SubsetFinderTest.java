package me.andreaiacono.recursion.subset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.*;

class SubsetFinderTest {

    @Test
    void computesCorrectValuesOfSizeTwoTest() {

        char[] set = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        int size = 2;
        var result = new SubsetFinder().subsets(0, new ArrayList<>(), set, size);

        List<List<Character>> expectedResult = new ArrayList<>() {{
            add(Arrays.asList('A', 'B'));
            add(Arrays.asList('A', 'C'));
            add(Arrays.asList('A', 'D'));
            add(Arrays.asList('A', 'E'));
            add(Arrays.asList('A', 'F'));
            add(Arrays.asList('B', 'C'));
            add(Arrays.asList('B', 'D'));
            add(Arrays.asList('B', 'E'));
            add(Arrays.asList('B', 'F'));
            add(Arrays.asList('C', 'D'));
            add(Arrays.asList('C', 'E'));
            add(Arrays.asList('C', 'F'));
            add(Arrays.asList('D', 'E'));
            add(Arrays.asList('D', 'F'));
            add(Arrays.asList('E', 'F'));
        }};

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void computesCorrectValuesOfSizeThreeTest() {

        char[] set = new char[]{'A', 'B', 'C', 'D', 'E'};
        int size = 3;
        var result = new SubsetFinder().subsets(0, new ArrayList<>(), set, size);

        List<List<Character>> expectedResult = new ArrayList<>() {{
            add(Arrays.asList('A', 'B', 'C'));
            add(Arrays.asList('A', 'B', 'D'));
            add(Arrays.asList('A', 'B', 'E'));
            add(Arrays.asList('A', 'C', 'D'));
            add(Arrays.asList('A', 'C', 'E'));
            add(Arrays.asList('A', 'D', 'E'));
            add(Arrays.asList('B', 'C', 'D'));
            add(Arrays.asList('B', 'C', 'E'));
            add(Arrays.asList('B', 'D', 'E'));
            add(Arrays.asList('C', 'D', 'E'));
        }};

        Assertions.assertEquals(expectedResult, result);
    }

}