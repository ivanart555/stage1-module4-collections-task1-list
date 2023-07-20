package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);

        if (Math.abs(first) == Math.abs(second)) return first - second;

        return Math.abs(5 * first ^ 2 + 3) - Math.abs(5 * second ^ 2 + 3);
    }
}
