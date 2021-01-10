package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        helloLong();
    }
    public static void helloLong() {
        System.out.println("Here we look at long");
        long al = 938529;
        int test = 938529;
        long bl = 305324181L;
        long sum = al + bl;
        System.out.println(sum);
    }

    public static void helloInt() {
        int a = 5;
        int b = 3;
        int c = a + b;
        //definition
        // !!!declaration!!! - int X - задекларировать
        //initialisation
        System.out.println(a);
        System.out.println(c);

    }
}

