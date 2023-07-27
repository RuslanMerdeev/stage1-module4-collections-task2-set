package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        intersection.removeAll(thirdSet);

        HashSet<String> set = new HashSet<>(thirdSet);
        set.removeAll(firstSet);
        set.removeAll(secondSet);

        set.addAll(intersection);

        return set;
    }
}
