import java.util.Arrays;
class Anagram {

    public static boolean checkAnagram(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    public static boolean checkAnagram2(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        char[] sc1 = sortArrayBubbleSort(c1);
        char[] sc2 = sortArrayBubbleSort(c2);

        for(int i = 0 ; i< sc1.length; i++){
            if(sc1[i] != sc2[i])
                return false;
        }

        return true;
    }

    public static char[] sortArrayBubbleSort(char[] c){
        for(int i = 0; i< c.length; i++) {
            for(int j=0; j< c.length-1; j++) {
                if(c[j] > c[j+1]){
                    char max = c[j];
                    c[j] = c[j+1];
                    c[j+1] = max;
                }
            }
        }
        return c;
    }

    public static char[] sortArraySelectionSort(char[] c) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

    }

    public static void main(String... args){
        boolean isAnagram1 = checkAnagram2("silent","listen");
        boolean isAnagram = checkAnagram2("silent","listej");
        System.out.println(isAnagram);
    }
}