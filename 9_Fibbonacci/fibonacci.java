
class Main {

    public static void generateFibbonaci(int number){
        int a = 0;
        int b = 1;

        for(int i = 0 ; i< number ; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        generateFibbonaci(7);
    }
}