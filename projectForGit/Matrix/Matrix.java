package Matrix;

public class Matrix {
    public static void main(String[] args) {
        MatrixOne matrixOne = new MatrixOne();
        int[][] A = {{1, 1}, {2, 8}};//1 1      14 1
        int[][] B = {{14, 1}, {2, 0}};//2 8     2  0
        matrixOne.setA(A,B);

    }
}

class MatrixOne {
    int  Matrix1;
    public void   setA(int[][] A , int[][] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                Matrix1 = A[i][j] + B[i][j];
                System.out.print(Matrix1 + " ");
            }
            System.out.println();
        }
    }
}