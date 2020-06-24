package main.java.com.teben;

import java.util.Random;

public class OperationsWithArray {

    // Initialization of array
    public int[] initArray (int[] list) {
        list = new int[20];
        Random rand = new Random();

        for (int i=0; i < list.length; i++) {
            list[i] = rand.nextInt(30);
            System.out.print(list[i] + " ");
        }
        System.out.println("");
        return list;
    }

    // Getting minimum element of array
    public int getMinElemArray (int[] list) {
        int minValue = list[0];

        for (int elem: list) {
            if (minValue > elem) {
                minValue = elem;
            }
        }
        return minValue;
    }

    // Getting maximum element of array
    public int getMaxElemArray (int[] list) {
        int maxValue = list[0];

        for (int elem: list) {

            if (maxValue < elem) {
                maxValue = elem;
            }
        }
        return maxValue;
    }

    // Bubble sorting in ascending order
    public int[] incBubbleSort (int[] list) {
        int i, j, temp;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int elem: list) {
            System.out.print(elem + " ");
        }
        System.out.println("");
        return list;
    }

    // Sort bubbles in descending order
    public int[] decBubbleSort (int[] list) {
        int i, j, temp;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] < list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int elem: list) {
            System.out.print(elem + " ");
        }
        System.out.println("");
        return list;
    }

    // The sum of all elements of the array
    public int sumArray (int[] list) {
        int sum = 0;
        for (int elem: list) {
            sum += elem;
        }
        return sum;
    }

    // Squaring all the elements of the array
    public int[] squareArray (int[] list) {
        for (int elem: list) {
            elem *= elem;
            System.out.print(elem + " ");
        }
        return list;
    }

    // Getting main diagonal of matrix
    public String getMainDiagonalString (String[][] list) {
        String mainDiag = "";
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i == j) {
                    mainDiag += list[i][j];
                }
            }
        }
        return mainDiag;
    }

    // Checking array elements  on duplication
    public int[] swapToZero (int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    list[i] = 0;
                }
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
        return list;
    }
}
