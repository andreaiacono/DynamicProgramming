package me.andreaiacono.recursion.subset;

import java.util.*;

public class Powerset {

    public static void main(String[] args) {
        List<Character> set = Arrays.asList('A', 'B', 'C', 'D');
        var powerSet = new Powerset();
        System.out.println("powerset  : " + powerSet.powerSet(0, new ArrayList(), set));
        System.out.println("powerset compact: " + powerSet.powerSetCompact(0, new ArrayList<>(), set));
    }

    public Set<List<Character>> powerSet(int index, List<Character> partialResult, List<Character> set) {

        if (index == set.size()) {
            return new HashSet<>();
        }

        Set<List<Character>> result = new HashSet<>();
        for (int i = index; i < set.size(); i++) {
            partialResult.add(set.get(i));
            result.add(new ArrayList<>(partialResult));
            result.addAll(powerSet(i + 1, partialResult, set));
            partialResult.remove(set.get(i));
        }
        result.add(List.of());
        return result;
    }

    public List<List<Character>> powerSetCompact(int index, List<Character> partialResult, List<Character> set) {

        if (index == set.size()) {
            return List.of(partialResult);
        }

        return new ArrayList<>() { {
            addAll(powerSetCompact(index + 1, partialResult, set));
            addAll(powerSetCompact(index + 1, new ArrayList<>(partialResult) {{ add(set.get(index)); }}, set));
        } };
    }
}
