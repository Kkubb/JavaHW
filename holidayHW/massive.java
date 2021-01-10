package holidayHW;
/*. Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
fix23([1, 2, 3]) → [1, 2, 0] fix23([2, 3, 5]) → [2, 0, 5] fix23([1, 2, 1]) → [1, 2, 1] */

import lesson20.main;

public class massive {

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{2, 3, 5};
        int[] a3 = new int[]{1, 2, 1};
        main.printArrayForEach(fix23(a1));
        main.printArrayForEach(fix23(a2));
        main.printArrayForEach(fix23(a3));
        //fix23(a1) → [1, 2, 0]
        //fix23(a2) → [2, 0, 5]
        //fix23(a3) → [1, 2, 1]
    }

    public static int[] fix23(int[] input) {
        if (input[0] == 2 && input[1] == 3) {
            input[1] = 0;
        } else if (input[1] == 2 && input[2] == 3) {
            input[2] = 0;
        }
        return input;
    }
}

