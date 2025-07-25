class MaxElement {

    public static int findMaxElement(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
             max = arr[i];
            }
        }
        return max;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int a : arr){
            max = (a > max)?a:max;
        }
        return max;
    }

    public static void main(String... args){
        int[] arr = {3,1,8,4,5,7,3,0,9};
        System.out.println(findMax(arr));
    }
}