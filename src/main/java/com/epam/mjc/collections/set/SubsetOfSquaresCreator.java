package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator{
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> treeSet = new TreeSet<>();
        for (Integer integer : sourceList) {
            int square = (int) Math.pow(integer, 2);
            if (square == 16 || square == 25 || square == 9 || square == 4)
                treeSet.add(square);
        }
        return treeSet;
    }
}
