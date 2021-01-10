package lesson21;

/*Given an array of ints of odd length, return a new array length 3
containing the elements from the middle of the array.
The array length will be at least 3.
midThree({1, 2, 3, 4, 5}) → {2, 3, 4}
midThree({8, 6, 7, 5, 3, 0, 9}) → {7, 5, 3}
midThree({1, 2, 3}) → {1, 2, 3}*/

import lesson20.main;

public class hw21_01_02 {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};
        System.out.println(ANSI_CYAN + "First New Array" + ANSI_BLACK);
        main.printArrayForEach(midThree(a1));
        System.out.println(ANSI_PURPLE + "Second New Array" + ANSI_BLACK);
        main.printArrayForEach(midThree(a2));
        System.out.println(ANSI_BLUE + "Second New Array" + ANSI_BLACK);
        main.printArrayForEach(midThree(a3));
    }

    public static int[] midThree(int[] input) {
        int middle = (input.length / 2) - 1;
        int[] newArr = new int[3];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = input[middle + i];
        }
        return newArr;
    }

}

