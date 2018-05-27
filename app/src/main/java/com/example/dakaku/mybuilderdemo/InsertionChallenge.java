package com.example.dakaku.mybuilderdemo;

public class InsertionChallenge {

    public static void main(String[] args) {

        int[] arr = {2,1,3,1,2};
        insertionSort(arr, 5);

    }

    public static void insertionSort(int[] arr, int n) {
        int x=0;

        for (int j = 1; j < n; j++) {

            int key =  arr[j];

            int i = j - 1;

            while (i >= 0 && arr[i] > key) {

                arr[i + 1] = arr[i];
                i = i - 1;
                x=x+1;
            }
            arr[i + 1] = key;
            }
            System.out.println("X = "+x);
        }

    }
