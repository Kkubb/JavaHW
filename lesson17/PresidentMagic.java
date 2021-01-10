package lesson17;

import java.util.Scanner;

/*Президент приходит к власти если набрал 51% голосов избирателей. Создайте машину для ввода результатов выборов.*/
public class PresidentMagic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.println("Print amount of votes");
        quantity = input.nextInt();
        if (quantity>58) {
            System.out.println("Your candidate von the election!" + " Congratulations!");
        }else {
            System.out.println("Your candidate lost");
        }
    }


}
