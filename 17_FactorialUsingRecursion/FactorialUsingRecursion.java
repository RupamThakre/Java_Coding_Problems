class FactorialUsingRecursion {

    public static int factorialUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialUsingRecursion(n - 1);
    }
    public static void main(String... args) {
        int n = 5;
        int factorial = factorialUsingRecursion(n);
        System.out.println(factorial);
    }
}