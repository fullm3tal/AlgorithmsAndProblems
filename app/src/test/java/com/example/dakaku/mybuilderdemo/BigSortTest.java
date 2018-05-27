package com.example.dakaku.mybuilderdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigSortTest {

    @Test
    public void insertionSort() {

            String []input={"31415926535897932384626433832795", "444","44", "1", "3", "10", "3", "5"};
    String []output;
    String []expected={"1", "3", "3","5","10","44","444","31415926535897932384626433832795"};


    output = BigSort.insertionSort(input);
    assertArrayEquals(expected,output);

    }
}