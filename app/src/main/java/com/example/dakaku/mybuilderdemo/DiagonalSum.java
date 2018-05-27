package com.example.dakaku.mybuilderdemo;

public class DiagonalSum {
    public static void main(String[] args) {

        int[][] a = new int[][]{{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};

        int difference = showDiagonalSum(a);

        System.out.println(difference);

    }

    public static int showDiagonalSum(int a[][]) {

        int length = a.length;
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int j = 0; j < length; j++) {

            firstDiagonal = a[j][j] + firstDiagonal;

        }

        for (int k = 0, l = length-1; k < length; k++, l--) {

            secondDiagonal = a[k][l] + secondDiagonal;

        }
        int difference = 0;
        if (firstDiagonal > secondDiagonal) {
            difference = firstDiagonal - secondDiagonal;
        } else {
            difference = secondDiagonal - firstDiagonal;
        }
        return difference;

    }
}
