package lesson14;



public class LoopsExerss {
    public static void main(String[] args) {
        printLineNtimes("hello ",3);
        System.out.println(printLineNtimesString("frontend", 5));
        countdown(5);
        System.out.println(digitPowTwo(5));

    }
    /*12. Повторяка номер n реализовать метод, который выводит на экран заданную строку N раз. printLineNtimes(“hello”,3) -> hello hello hello*/
    public static String printLineNtimesString(String word, int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result = result + word + " ";
        }
        return result;
    }

    public static void printLineNtimes(String word, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(word);
        }
    }


    /*14. Реализовать метод “ Обратный отсчёт ” который выводит на экран цифры от n до 1, затем выводит строку „start“. countdown(5) -> 5 4 3 2 1 start*/

    public static void countdown(int number){
        for (int i = number; i>0; i--) {
            System.out.print(i + "");
        }
        System.out.println(" " + "start");
    }

    /*10. Степень числа Возведите число n во вторую степень. Не используя арифмитический оператор умножения.
digitPowTwo(5) -> 25 digitPowTwo(10) -> 100 digitPowTwo(4) -> 16*/

    public static int digitPowTwo (int number) {
        int result = 0;
        for (int i =0; i< number; i++) {
            result = result = number;
        }
        return result;

    }



}


