package main.java.com.teben;
// Author: Artur Teben
// June 22, 2020
public class Main {

    public static void main(String[] args) {

        OperationsWithArray operationsWithArray = new OperationsWithArray();
        int[] firstArray = new int[20];


        int[] secondArray = {3, 2, 3, 1, 4, 2, 8, 3};

        String [][] stringArray = {
                {"Just ", "dream", "sport"},
                {"life", "Do ", "music"},
                {"relax", "codding", "It!"}
        };

        System.out.println("              Operatins with first array.           ");
        System.out.print("Initialization of array: ");
        firstArray = operationsWithArray.initArray(firstArray);

        System.out.println("Maximum element of array: " + operationsWithArray.getMaxElemArray(firstArray));
        System.out.println("Minimum element of array: " + operationsWithArray.getMinElemArray(firstArray));
        System.out.println("Sum of all elements of array: " + operationsWithArray.sumArray(firstArray));
        System.out.print("Sort array in descending order: ");
        operationsWithArray.incBubbleSort(firstArray);

        System.out.print("Sort array in ascending order: ");
        operationsWithArray.decBubbleSort(firstArray);

        System.out.print("Elevation to the square of the elements of the array: ");
        operationsWithArray.getSquareElemArray(firstArray);
        System.out.println("");

        System.out.println("              Operatins with second array.           ");
        System.out.print("Check items for duplication: ");
        operationsWithArray.swapToZero(secondArray);
        System.out.println("");

        System.out.println("              Operatins with matrix.           ");
        System.out.println("Main diagonal of matrix: " + operationsWithArray.getMainDiagonalString(stringArray));
    }
}
