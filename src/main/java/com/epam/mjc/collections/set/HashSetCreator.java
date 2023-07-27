package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer current : sourceList) {
            if (current % 2 == 0) {
                int i = current;
                for (; i % 2 == 0; i /= 2) {
                    set.add(i);
                }
                set.add(i);
            } else {
                set.add(current);
                set.add(current * 2);
            }
        }

        return set;
    }
}
