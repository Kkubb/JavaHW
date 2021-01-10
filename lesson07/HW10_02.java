package lesson07;
/*Given a non-negative number “num”,
return true if num is within 2 of a multiple of 10. верни неотрицальное число, тру если нам кратно 10
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod*/



public class HW10_02 {
    public static void main(String[] args) {
        System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17)); //→ false
        System.out.println(nearTen(19)); //→ true
    }

    private static int number;

    public static boolean nearTen(int num) {
        int temp = num % 10;
        return temp <= 2 || temp >= 8;
        }
    }
