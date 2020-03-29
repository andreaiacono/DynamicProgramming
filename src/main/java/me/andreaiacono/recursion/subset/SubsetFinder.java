package me.andreaiacono.recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetFinder {

    public static void main(String[] args) {

        SubsetFinder subsetFinder = new SubsetFinder();
        List<Character> set = List.of('A', 'B', 'C', 'D');
        int size = 2;

        System.out.println(subsetFinder.subsets(0, new ArrayList<>(), set, size));
    }

    List<List<Character>> subsets(int currentIndex, List<Character> partialResult, List<Character> set, int size) {

        // base case, we reached the desired size
        if (partialResult.size() == size) {
            return List.of(new ArrayList<>(partialResult));
        }

        // recursive case

        // loops over the numbers of the set
        List<List<Character>> result = new ArrayList<>();
        for (int i = currentIndex; i < set.size(); i++) {

            // adds the i-th one to a partial subset
            partialResult.add(set.get(i));

            // computes all the possible subsets containing the i-th number
            // and adds them to the final result
            result.addAll(subsets(i + 1, partialResult, set, size));

            // and removes it from the partial subset
            partialResult.remove(Character.valueOf(set.get(i)));
        }

        // return the final result for this call
        return result;
    }
}
