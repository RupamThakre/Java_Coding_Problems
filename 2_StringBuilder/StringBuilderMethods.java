// StringBuilder Methods
//1. append()
//2. .toString()
//3. reverse()
//4. insert - insert string at specified location
//5. replace()
//6. length()
//7. capacity()
//8. charAT()
//9. subString()
//10.indexOf()
//11. lastIndexOf()
//12. delete()
//13. deleteAtIndex()

class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ajanta");
        System.out.println(sb);

        //convert String to StringBuilder
        String str = "ConvertIntoStringBuildder";
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1);

        //convert StringBuilder to String
        System.out.println(sb1.toString());

        //reverse sb1
        System.out.println(sb1.reverse());

        sb1.insert(2, "ADDDDDD");
        System.out.println(sb1);

        sb1.replace(1,3,"REPLACE");
        System.out.println(sb1);

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        System.out.println(sb1.charAt(5));

        System.out.println(sb1.substring(6));
        System.out.println(sb1.substring(6,12));


    }
}

//OUTPUT
/*
Ajanta
ConvertIntoStringBuildder
ConvertIntoStringBuildder
reddliuBgnirtSotnItrevnoC
reADDDDDDddliuBgnirtSotnItrevnoC
rREPLACEDDDDDDddliuBgnirtSotnItrevnoC
37
41
A
CEDDDDDDddliuBgnirtSotnItrevnoC
CEDDDD
* */