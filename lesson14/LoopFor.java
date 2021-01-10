package lesson14;
//for i
//while
//do while
public class LoopFor {
    public static int multiply(int a, int b) {   //for
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }

        return result;

    }

    public static int multiplyAgain(int a, int b) {  //while
        int result = 0;
        int count = 0;
        while (count < b) {
            result = result + a;
            count++;
        }

        return result;
    }



    public static int multiplyAgainTwo(int a, int b) {  //do while
        int result = 0;
        int count =0;
        do {
            result = result + a;
            count ++;
        } while (count < b);
        return result;
    }

}

//public static void myInt() {
//    int a =6;
//    a=a+7;
//    a=a+4;
//    a=a+9;}

