package Matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        MatrixOne matrixOne = new MatrixOne();
        Random random = new Random();


        int[][] firstMatrix = new int[3][3];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {

                firstMatrix[i][j] = random.nextInt(19);
            }
        }
        System.out.println("First matrix =  " + Arrays.deepToString(firstMatrix) + " ");
        System.out.println();
// --------------------------------------------------------------------------------------

        int[][] secondMatrix = new int[3][3];
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                secondMatrix[i][j] = random.nextInt(19);

            }
        }
        System.out.println("Second matrix =  " + Arrays.deepToString(secondMatrix) + " ");
        System.out.println();
        System.out.println("Sum all  matrix = " + Arrays.deepToString(matrixOne.sumMatrix(firstMatrix, secondMatrix)) + "\n");
    }
}

class MatrixOne {

    final int[][] matrix1 = new int[3][3];

    public int[][] sumMatrix(int[][] first, int[][] second) {
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                try {
                    matrix1[i][j] = first[i][j] + second[i][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        }
        return matrix1;
    }
}