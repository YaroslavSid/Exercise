package matrix;

import java.util.Arrays;
import java.util.Random;

public class MatrixMain {
    public static void main(String[] args) {
        Matrix matrixOne = new Matrix();
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