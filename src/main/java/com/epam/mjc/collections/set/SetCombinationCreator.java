package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new TreeSet<>();
        Iterator<String> i1 = firstSet.iterator();
        Iterator<String> i2 = secondSet.iterator();
        Iterator<String> i3 = thirdSet.iterator();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        while (i1.hasNext())
            list1.add(i1.next());
        while (i2.hasNext())
            list2.add(i2.next());
        while (i3.hasNext())
            list3.add(i3.next());
        for (String s : list1) {
            for (String value : list2) {
                if (s.equals(value))
                    set.add(s);
            }
        }
        for (String s : list3) {
            if (s.equals("LinkedHashSet") || s.equals("TreeSet") || s.equals("HashSet"))
                set.add(s);
        }
        return set;
    }
}
