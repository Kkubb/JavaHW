package lesson17;
/* Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
1)comp to gn a digit
2)game logic
3)add scanner
*/

import java.util.Scanner;

public class RandomGame1 {
    public static void main(String[] args) {
        System.out.println(generateDigit());
        game();



    }
    private static void game() {
        Scanner input = new Scanner(System.in);
        int digit = generateDigit();
        System.out.println("Input number from 0 to 100");
        int number= input.nextInt();
        while (number != digit){
            System.out.println(compareDigits(number, digit));
        }

    }


     public static String compareDigits(int number, int digit) {
        if (number == digit){
            return "bingo";
        } else if (number > digit) {
            return "number>digit";
        } else {
            return "number<digit";
        }
     }


    public static int generateDigit() {
        return (int) (Math.random() * 100);

    }


}
