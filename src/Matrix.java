import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int size = 4;
        double[][] matrix = generateIdentityMatrix(size);
        printMatrix(matrix);

    }

    public static double[][] generateIdentityMatrix(int size){
        double [][] matrixId = new double [size][size];
        int j=0;
        for (int i = 0; i < size; i++) {
            matrixId[i][i] = 1.0;

        }

        return matrixId;
    }

    public static void printMatrix (double[][] matrix ){


        for (int i = 0; i < matrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+ "\t |\t");
            }

        }
    }
}
