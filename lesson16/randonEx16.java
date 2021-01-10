package lesson16;

public class randonEx16 {

    public static void main(String[] args) {
        random();
        forthMethod();
    }

    private static void forthMethod() {
        char myLovelyChar = (char) (Math.random()*(122-97)+1+97);
        System.out.println(myLovelyChar);
        int count =0;
        while (count<0) {
            char myLovelyCharWhile = (char) (Math.random()*(122-97)+1+97);
            System.out.print(myLovelyCharWhile + " ");
            count++;
        }
        System.out.println();

        for (int i =0; i<100; i++) {
            char myLovelyCharTest = (char) (Math.random()*(122-97)+1+97);
            System.out.print(myLovelyCharTest);
        }
        String a = "az";
        System.out.print(a.codePointAt(0));
        System.out.print(a.codePointAt(1));
    }

    public static void random() {
        double random = Math.random();
        System.out.println(random);
        int normalNumber = (int)(Math.random()*100);
        System.out.println(normalNumber);

    }
}
