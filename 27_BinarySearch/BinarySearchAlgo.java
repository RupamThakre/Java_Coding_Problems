
class Main {
    public static void main(String[] args) {
        int[] intArray = { -22,-15,1,7,20,35,55};

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, -22));
        System.out.println(iterativeBinarySearch(intArray, 1));
        System.out.println(iterativeBinarySearch(intArray, 7));
        System.out.println(iterativeBinarySearch(intArray, 55));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 20));

    }

    public static int iterativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while(start < end){
            int midPoint = (start + end) / 2;
            if(input[midPoint] == value) {
                return midPoint;
            }
            else if(input[midPoint] < value) {
                start = midPoint + 1;
            }
            else {
                end = midPoint;
            }
        }
        return -1;
    }

}