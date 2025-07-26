
import java.util.*;
class Main {

    public static boolean isPerfectSquare(int num) {

        int sqrt = (int) Math.sqrt(num);
        return sqrt*sqrt == num;

    }

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(16));
    }
}