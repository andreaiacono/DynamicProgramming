package me.andreaiacono.recursion.subset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class PowersetTest {

    Set<List<Character>> expectedResult = new HashSet<>() {{
        add(List.of());
        add(Arrays.asList('A'));
        add(Arrays.asList('B'));
        add(Arrays.asList('C'));
        add(Arrays.asList('D'));
        add(Arrays.asList('A', 'B'));
        add(Arrays.asList('A', 'C'));
        add(Arrays.asList('A', 'D'));
        add(Arrays.asList('B', 'C'));
        add(Arrays.asList('B', 'D'));
        add(Arrays.asList('C', 'D'));
        add(Arrays.asList('A', 'B', 'C'));
        add(Arrays.asList('A', 'B', 'D'));
        add(Arrays.asList('A', 'C', 'D'));
        add(Arrays.asList('B', 'C', 'D'));
        add(Arrays.asList('A', 'B', 'C', 'D'));
    }};

    @Test
    void computesPowerSetTest() {
        List<Character> set = Arrays.asList('A', 'B', 'C', 'D');
        var result = new Powerset().powerSet(0, new ArrayList<>(), set);
        Set<List<Character>> hset = result.stream().collect(Collectors.toSet());
        Assertions.assertEquals(expectedResult, hset);
    }

    @Test
    void computesPowerSetCompactTest() {
        List<Character> set = Arrays.asList('A', 'B', 'C', 'D');
        var result = new Powerset().powerSetCompact(0, new ArrayList<>(), set);
        Set<List<Character>> hset = result.stream().collect(Collectors.toSet());
        Assertions.assertEquals(expectedResult, hset);
    }
}