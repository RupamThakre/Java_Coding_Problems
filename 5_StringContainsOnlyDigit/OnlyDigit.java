class OnlyDigit {

    public static boolean isOnlyDigit(String data){

        for(char c : data.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;

    }

    public static void main(String... args){
       System.out.println(isOnlyDigit("123456"));
       System.out.println(isOnlyDigit("123456J"));
    }
}