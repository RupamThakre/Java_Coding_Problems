//  By using a Set that does not allow duplicates, we can easily eliminate duplicate values from an array

import java.util.*;
class Main {

    public static int[] removeDuplicateFromArrays(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();
        for(int n : arr){
            set.add(n);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for(int s : set) {
            result[i++] = s;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(removeDuplicateFromArrays(arr)));
    }
}