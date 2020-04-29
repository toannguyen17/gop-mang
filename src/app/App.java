package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {3,5,7,9,2,4,6,8};
        int[] arr2 = {9,0,9,0,5,6,6};

        int size   = arr1.length + arr2.length;
        int[] arr3 = new int[size];

        //
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.print("Mảng 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.print("\nMảng 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\nGộp mảng 1 và mảng 2: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}