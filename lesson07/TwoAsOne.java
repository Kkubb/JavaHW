package lesson07;

public class TwoAsOne {
    //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));

    }
    public static boolean twoAsOne(int a, int b, int c){
        return a + b ==c||b+c ==a||a+c==b;
    }



}
