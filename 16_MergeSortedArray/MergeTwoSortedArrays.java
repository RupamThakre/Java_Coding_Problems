
/*
- using concept of merge sort
*/
import java.util.*;
class Main {

    public static int[] mergeTwoSortedArr(int[] arr1, int[] arr2) {

        int[] merge = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        while(i < arr1.length) { merge[k++] = arr1[i++]; }
        while(j < arr2.length) { merge[k++] = arr2[j++]; }

        return merge;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        System.out.println(Arrays.toString(mergeTwoSortedArr(arr1,arr2)));

    }
}