package lesson04;

import java.sql.SQLOutput;

public class HelloString {

    public static void main(String[] args) {
        //magicString();
        //london();
        intToString();
    }
public static void intToString() {
        int digit = 10;
        String text = String.valueOf(digit);
    System.out.println(text);
    int tryAndCry = Integer.parseInt(text);
    System.out.println(tryAndCry);

    String anatebe = "10";
    int myTry = Integer.parseInt(anatebe);
    System.out.println(anatebe);

}


    public static void london() {
    String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.toLowerCase());
        System.out.println(myLife.substring(0,1).toUpperCase()+myLife.substring(1).toLowerCase());
        String game = myLife.substring(0,1).toUpperCase()+
                myLife.substring(1,2).toLowerCase()+
                myLife.substring(4,6).toUpperCase()+
                myLife.substring(7,8).toLowerCase();
        System.out.println(game);
    }

        public static void magicString() {
        String firstName="Liza";
        String secondName="Kubinskaia";
        String user=firstName + secondName;
        int length = user.length();
        System.out.println(length);
        String first10Chars = user.substring(0,9);


    }

}

