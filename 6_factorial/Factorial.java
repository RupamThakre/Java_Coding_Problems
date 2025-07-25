class Factorial {

    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;

    }
    public static void main(String... args){
        System.out.println(findFactorial(5));
        System.out.println(findFactorial(15));
        System.out.println(findFactorial(9));
        System.out.println(findFactorial(1));
        System.out.println(findFactorial(2));
    }
}
