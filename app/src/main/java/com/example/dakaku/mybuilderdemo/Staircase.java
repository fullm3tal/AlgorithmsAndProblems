package com.example.dakaku.mybuilderdemo;

public class Staircase {

    public static void main(String[] args) {
        staircase(8);

    }

    static void staircase(int n) {
        /*
         * Write your code here.
         */

        String x = "#";
        for (int i = 1, j = n-1; i <= n; i++, j--) {

            int count = i;
            int flag = j;

            while (flag > 0) {
                System.out.print(" ");
                flag--;
            }

            while (count > 0) {
                System.out.print(x);
                count--;
            }
            System.out.println();

        }

    }

}
