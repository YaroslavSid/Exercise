package matrix;

class Matrix {

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