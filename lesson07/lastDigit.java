package lesson07;



public class lastDigit {
    public static void main(String[] args) {
        //System.out.println(lastDigit(23, 19, 13));
        //System.out.println(lastDigit(23, 19, 12));
        //System.out.println(lastDigit(23, 19, 3));
        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));
    }

    /* Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note:
           the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.*/

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }

    /*
 ---Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by
5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod"
operator computes the remainder, e.g. 7 % 5 is 2.*/

    public static int maxMod5(int value1, int value2) {
        int min = Math.min(value1, value2);
        int max = Math.max(value1, value2);
        if (value1 > value2) {
            min = value2;
            max = value1;
        } else {
            min = value1;
            max = value2;

        }
        min=MyLovelyMath.myMin(value1, value2);

        if (value1 == value2) {
            return 0;
        } else if (value1 % 5 == value2 % 5) {
            return min;
        } else {
            return max;
        }
    }
}

