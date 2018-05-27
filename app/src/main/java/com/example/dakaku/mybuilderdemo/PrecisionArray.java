package com.example.dakaku.mybuilderdemo;

public class PrecisionArray {
    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        showPrecision(arr);
    }

    public static void showPrecision(int[] arr) {
        int countPositive = 0;
        int countNegative = 0;
        int countZeroes = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            } else if (arr[i] == 0) {
                countZeroes++;
            }
        }

        int arrayLength = arr.length;
        double totalPositiveNumbers = (double) countPositive / arrayLength;
        double totalNegativeNumbers = (double) countNegative / arrayLength;
        double totalZeroes = (double) countZeroes / arrayLength;

        System.out.println(totalPositiveNumbers);
        System.out.println(totalNegativeNumbers);
        System.out.println(totalZeroes);

    }

}
