package lesson12;
/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
        The string will be non-empty.
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

/*

Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at
least 3.
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/


public class HW12_02 {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true)); //H
        System.out.println(theEnd("Hello", false)); //o
        System.out.println(theEnd("oh", true)); //o

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));

        System.out.println(middleThree("Candy"));//and
        System.out.println(middleThree("and"));//and
        System.out.println(middleThree("solving"));//lvi

    }

    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }

    }

    public static boolean endsLy(String str) {

        if (str.endsWith("ly")) {
            return true;
        } else {
            return false;

        }
    }
    public static String middleThree(String str) {
        int middle = str.length();
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }


}


