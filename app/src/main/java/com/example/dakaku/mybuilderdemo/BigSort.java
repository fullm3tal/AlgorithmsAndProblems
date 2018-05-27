package com.example.dakaku.mybuilderdemo;

import java.math.BigInteger;

public class BigSort {

    public static void main(String[] args) {
        String[] arr = {"31415926535897932384626433832795", "1", "3", "10", "3", "5"};

        insertionSort(arr);

        for (int k = 0; k < arr.length; k++) {

            System.out.println(arr[k]);
        }

    }


    public static String[] insertionSort(String[] unsorted) {

        BigInteger[] bigArray = new BigInteger[unsorted.length];

        for (int i = 0; i < unsorted.length; i++) {

            bigArray[i] = new BigInteger(unsorted[i]);

        }

        for (int i = 1; i < bigArray.length; i++) {

            BigInteger bigKey = bigArray[i];
            String duplicateKey = unsorted[i];
            int j = i - 1;

            while (j >= 0 && bigArray[j].compareTo(bigKey) > 0) {
                bigArray[j + 1] = bigArray[j];
                j = j - 1;
            }

            bigArray[j + 1] = bigKey;
        }
        for (int k = 0; k < bigArray.length; k++) {
            unsorted[k] = String.valueOf(bigArray[k]);
        }
        return unsorted;

    }

}
