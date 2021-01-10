package lesson07;
/*Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod*/
//вернуть тру, если неотрицательное число 1 или 2 или кратно 20

public class HW10_01 {
    public static void main(String[] args) {

        System.out.println(more20(20));//false
        System.out.println(more20(21));//true
        System.out.println(more20(85));//false
        System.out.println(more20(101));//true

    }

    private static int number;

    public static boolean more20(int number) {
        int temp = number %20;
        if (temp -1 ==0 || temp - 2 ==0) {
            return true;
        } else {

        return false;
    }

    }

}
