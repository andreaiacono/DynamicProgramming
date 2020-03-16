package me.andreaiacono.recursion.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetFinder {

    public static void main(String[] args) {

        char[] set = new char[]{'A', 'B', 'C', 'D'};
        int size = 2;

        System.out.println(subsets(0, new ArrayList<>(), set, size));
    }

    private static List<List<Character>> subsets(int currentIndex, List<Character> partialResult, char[] set, int size) {

        // base case, we reached the desired size
        if (partialResult.size() == size) {
            return Arrays.asList(new ArrayList<>(partialResult));
        }

        // recursive case

        // loops over the numbers of the set
        List<List<Character>> result = new ArrayList<>();
        for (int i = currentIndex; i < set.length; i++) {

            // adds the i-th one to a partial subset
            partialResult.add(set[i]);

            // computes all the possible subsets containing the i-th number
            // and adds them to the final result
            result.addAll(subsets(i + 1, partialResult, set, size));

            // and removes it from the partial subset
            partialResult.remove(Character.valueOf(set[i]));
        }

        // return the final result for this call
        return result;
    }
}