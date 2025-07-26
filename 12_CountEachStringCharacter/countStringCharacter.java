//count occurance of each character of string
import java.util.*;
class Main {

    public static void countEachCharacterString(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        countEachCharacterString("hello world");
    }
}