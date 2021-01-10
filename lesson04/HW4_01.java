package lesson04;

public class HW4_01 {
    public static void main(String[] args) {
        System.out.println(helloName("Mary, the 'catlover'"));
        System.out.println(helloName("John, the 'systemcrasher'"));
    }

    public static String helloName(String name) {

        String Hello = "Hello, ";
        String lastSymbol = "!";
        String nickname = "";
        char myLastSymbol = '!';
        String result = Hello + name + nickname + "" + lastSymbol;
        return result;
    }
}


