class EvenOdd {

    public static String evenOdd(int number){
        return (number % 2== 0)?"Even":"Odd";
    }

    public static void main(String... args){
        System.out.println(evenOdd(4));
        System.out.println(evenOdd(7));
    }
}