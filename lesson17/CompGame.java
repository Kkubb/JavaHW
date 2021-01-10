package lesson17;
/*Компьютер загадывает число от 1 до n.
У пользователя k попыток отгадать.
После каждой неудачной попытки компьютер
сообщает меньше или больше загаданное число.
В конце игры текст с результатом (или “Вы угадали”, или
“Попытки закончились”).
 */

import java.util.Scanner;

public class CompGame {
    public static void main(String[] args) {
        game();

    }

    private static void game() {
        int range = customerRange();
        int attempts = customerAttempts();

        int secretCompNumber = generateDigit(range);

        //выиграл, если в указанное колво попыток угадал
        //проиграл, если попытки кончились и не угадал
        int countAttempts = 0;
        System.out.println("Давай начнем игру!");
        //while (countAttempts <= attempts || )
        int customerNumber;
        Scanner scr = new Scanner(System.in);
        customerNumber = scr.nextInt();
        while (customerNumber!=secretCompNumber) {
            System.out.println();
            System.out.println(compare(customerNumber, secretCompNumber));
            System.out.println("введите число заново");
            countAttempts++;
            attemptsDone(countAttempts);
        }
        System.out.println("Гейм Овер, сенкс!");
    }
    public static String compare(int customerNumber, int secretCompNumber){
        if(customerNumber == secretCompNumber) {
            return "You guessed";
        } else if (customerNumber> secretCompNumber) {
            return "You number is bigger";
        } else {
            return "Wrong";
        }
    }

    private static void attemptsDone(int countAttempts) {
        System.out.println("Game over" + countAttempts + " attempts used");
    }

    private static int customerRange() {
        Scanner scr = new Scanner(System.in);
        System.out.println("В каком диапазоне я могу загадать число?");
        return scr.nextInt();
    }
    public static int generateDigit(int diapason) {
        return (int) (Math.random() * diapason);

    }
    public static int customerAttempts() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Я рекомндую диапазон от нуля до ста не менее пяти");
        System.out.println("Сколько попыток тебе дать?");
        return scr.nextInt();
    }
}
