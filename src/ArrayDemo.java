import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int [] arr1 = {3, 4, 5};
        int [] arr2 = {7, 1, 3};

        System.out.println("Array 1 is: " + Arrays.toString(arr1));
        System.out.println("Array 2 is: " + Arrays.toString(arr2));
        System.out.println("Array added is: " + Arrays.toString(addArrays(arr1, arr2)));
        System.out.println("Array multiplied is: " + Arrays.toString(multiplyArrays(arr1, arr2)));


    }

    public static int[] addArrays(int[] arr1, int[] arr2){
        int[] added = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            added[i] = arr1[i] + arr2[i];
        }
        return added;
    }

    public static int[] multiplyArrays (int[] arr1, int[] arr2){
        int[] multiplied = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            multiplied[i] = arr1[i] * arr2[i];
        }
        return multiplied;
    }



}
