package com.example.dakaku.mybuilderdemo;

public class MinMaxValues {

    public static void main(String[] args) {

        miniMaxSum(new int[]{793810624, 895642170, 685903712, 623789054 ,468592370});

    }

    static void miniMaxSum(int[] arr) {

        int length = arr.length;

        for (int i = 1; i < length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = key;

        }

        long sumMinimum=0;
        long sumMaximum=0;

        for(int k=0;k<length-1;k++){
            sumMinimum=sumMinimum+arr[k];
        }

        for(int k=1;k<length;k++){
            sumMaximum=sumMaximum+arr[k];
        }

        System.out.println(sumMinimum+" "+sumMaximum);

    }

}
