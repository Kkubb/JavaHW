package lesson24;

/* 1) Даны два числа, a и b. Верните большее из них. Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        getMeMax(15, 5) → 15
        getMeMax(4, 16) → 16
        getMeMax(20, 100) → 100
   2) Даны два числа, a и b. Верните меньшее из них. Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        getMeMin(15, 45) → 15
        getMeMin(44, 16) → 16
        getMeMin(200, 100) → 100
   3) Даны два строковых значения. Верните идущее по алфавиту раньше.
        myFirstCompareTo("Berlin", "Moscow"); → "Berlin"
        myFirstCompareTo("Minsk", "Moscow"); → "Minsk"
        myFirstCompareTo("Kyiv", "Paris"); → "Kyiv"
        myFirstCompareTo("Могилёв", "Потсдам"); → "Могилёв"
   4) While, Do While
        Решите не используя цикл for
        Даны целые числа A и B, где B > 0. Вывести B раз число A.
        Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.*/
public class hw24 {
    public static void main(String[] args) {
        //1)
        System.out.println(biggerThanOther(15, 5));// → 15
        System.out.println(biggerThanOther(4, 16));//→ 16
        System.out.println(biggerThanOther(20, 100));// → 100
        //2)
        System.out.println(smallerThanOther(15, 45));// → 15
        System.out.println(smallerThanOther(44, 16));//→ 16
        System.out.println(smallerThanOther(200, 100));// → 100
        //3)
        System.out.println(compareLetters("Berlin", "Moscow"));// → "Berlin"
        System.out.println(compareLetters("Minsk", "Moscow"));// → "Minsk"
        System.out.println(compareLetters("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(compareLetters("Могилёв", "Потсдам"));// → "Могилёв"
        //4)
        whileNumbers(7, 7);
        //5)
        growingNumbers(5, 17);
    }

    public static int smallerThanOther(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int biggerThanOther(int a, int b) {
        return (a > b) ? a : b;
    }
    public static String compareLetters(String firstCity, String secondCity) {
        if (firstCity.charAt(0) < secondCity.charAt(0) || firstCity.charAt(1) < secondCity.charAt(1)) {
            return firstCity;
        } else {
            return secondCity;
        }
    }
    public static void whileNumbers(int a, int b) {
        int i = 0;
        if (a > 0 && b > 0) {
            do {
                System.out.print(a);
                i++;
            } while (i < b);
        }
    }

    public static void growingNumbers(int a, int b) {
        do {
            System.out.println(a);
            a++;
        } while (a < b);
    }

}
