package lesson17;
//округление
public class myLovelyRound {
    public static void main(String[] args) {
        roundIntro();
        roundIntro2();
        roundIntro3();
        roundIntro4();

    }

    private static void roundIntro4() {
        double number = 3.9;
        //округлить вниз
        int newNumber = (int) number;
        System.out.println((double) newNumber);
    }

    private static void roundIntro3() {
        //округлить вверх
        double inputNumber = 3.141;
        int temp = (int) inputNumber;
        double temp2 = temp;
        System.out.println(temp2);
        if(inputNumber>temp2) {
            inputNumber = temp2 +1;
        }
        System.out.println(inputNumber);
    }

    private static void roundIntro() {
        double pi = Math.PI;
        //3 цифры после запятой
        double tempPi = pi*1000;
        System.out.println(tempPi);
        int magicInt = (int) tempPi;
        System.out.println(magicInt);
        pi = magicInt / 1000;
        System.out.println(pi);
    }
    public static void roundIntro2() {
        double number = 3.141;
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
    }

}
