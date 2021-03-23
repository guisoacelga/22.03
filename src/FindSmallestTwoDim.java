import java.util.Arrays;

public class FindSmallestTwoDim {
    public static void main(String[] args) {
        int[][] arr2D = {{1,9,0}, {8,5,7}};
        int[] indices = findSmallestNr2D(arr2D);
        System.out.println(Arrays.toString(indices));
        System.out.println(arr2D[indices[0]][indices[1]]);

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
}
