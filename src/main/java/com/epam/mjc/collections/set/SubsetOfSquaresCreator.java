package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer current : sourceList) {
            int squared = current * current;
            if (lowerBound <= squared && squared <= upperBound) {
                set.add(squared);
            }
        }

        return set;
    }
}
