import java.util.Arrays;

public class FindSmallestTwoDim {
    public static void main(String[] args) {
        int[][] arr2D = {{1,9,0,1}, {8,5,1,6}, {4,1,6,7}, {1,1,2,3}};
        int[] indices = findSmallestNr2D(arr2D);
        printArray2D(arr2D);
        System.out.println("Los indices del nro menor son: " + Arrays.toString(indices));
        System.out.println("El nro menor es: " + arr2D[indices[0]][indices[1]]);
        System.out.println("La suma de la diagonal contraria es: " + sumaDiagonalContraria(arr2D));

    }

    public static int[] findSmallestNr2D(int[][] arr2D){
        int[] indices = {0,0};
        int minimo = arr2D[0][0];

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j]< minimo){
                    indices[0]=i;
                    indices[1]=j;
                    minimo = arr2D[i][j];
                }
            }
        }

        return indices;
    }

    public static void printArray2D(int arr2D[][]){
        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + "\t|\t");
            }
            System.out.println();
        }
    }

    public static int sumaDiagonalContraria(int[][] arr2D){
       int suma = 0;

       for (int i = 0; i < arr2D.length; i++) {
            suma += arr2D[i][arr2D[i].length-(i+1)];
       }

        return suma;
    }
}
