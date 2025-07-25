
class Main {

    public static void reverseNumber(int number){

        int reverse = 0;

        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number/10;
        }

        System.out.println(reverse);

    }

    public static void main(String[] args) {
        reverseNumber(12345);
    }
}