//1. Reverse a string without using inbuilt methods
// using StringBuilder
// using String

class Main {
    public static String reverseString(String data){
        StringBuilder sb = new StringBuilder();

        for(int i=data.length()-1;i>=0;i--) {
            sb.append(data.charAt(i));
        }

        return sb.toString();

    }

    public static String reverseString2(String data){
        String s = "";
        for(int i=data.length()-1;i>=0;i--) {
            s = s+data.charAt(i);
        }

        return s;
    }

    public static String reverseString3(String data){
        String s = "";
        char[] ch = data.toCharArray();
        for(int i=ch.length-1;i>=0;i--) {
            s = s+data.charAt(i);
        }

        return s;
    }

    public static String reverseString4(String data){
        StringBuilder sb = new StringBuilder(data);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String data = "HelloWorld";
        String reversed = reverseString4(data);
        System.out.println(reversed);
    }
}