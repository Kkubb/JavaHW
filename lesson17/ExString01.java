package lesson17;
/*
Given a string, return a new string made of 3 copies of the first
2 chars of the original string. The string may be any length.
If there are fewer than 2 chars, use whatever is there.
extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
11. Given a string and a second "word" string, we'll */

public class ExString01 {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));//→ "HeHeHe"
        System.out.println(extraFront("ab"));// → "ababab"
        System.out.println(extraFront("H"));// → "HHH"
    }

    private static String extraFront(String word) {
        if (word.length()>=2) {
            return word.substring(0,2)+ word.substring(0,2) + word.substring(0,2);
        } else if (word.length() ==2) {
            return word.substring(0,2) +word.substring(0,1) + word.substring(0,1);
        } else {
            return"";
        }
    }


}
