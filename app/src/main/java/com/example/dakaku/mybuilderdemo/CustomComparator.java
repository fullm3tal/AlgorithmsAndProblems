package com.example.dakaku.mybuilderdemo;

import java.util.Comparator;

public class CustomComparator implements Comparator<CountryCode> {
    @Override
    public int compare(CountryCode o1, CountryCode o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
