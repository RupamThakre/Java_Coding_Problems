
class Main {

    public static int findSecondLargest(int[] arr){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first; // 1
                first = num; // 1
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 8};
        System.out.println(findSecondLargest(arr));
    }
}