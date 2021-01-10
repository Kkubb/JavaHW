package lesson14;

public class LoopswithWhile {
    public static void main(String[] args) {
        countdown(5);   //сколько не билась, не вижу где ошибка и почему заканчивает отсчет на нуле, а не на единице((
        printLineNtimesString("hello", 3); //опять же, вроде довожу до рабочей команды, но выдает совершенно другие результат
    }

    /*14. Реализовать метод “ Обратный отсчёт ” который выводит на экран цифры от n до 1, затем выводит строку „start“. countdown(5) -> 5 4 3 2 1 start*/
    public static void countdown(int number) {
        int i = number;
        do {
            i--;
            System.out.print(i + "\t");
        } while (i > 0);
        System.out.println(" " + "start");
        return;
    }

    /*12. Повторяка номер n реализовать метод, который выводит на экран заданную строку N раз. printLineNtimes(“hello”,3) -> hello hello hello*/
    public static String printLineNtimesString(String word, int number) {
        String result = "";
        int i = 1;
        result = result + word + " ";
        while (i < number) {
            System.out.print(result + word + " ");
            i++;
            return result;
        }
        return result;
    }
}

