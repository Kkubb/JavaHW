package lesson17;
/*1)Напишите программу, которой надо представиться.
Данные, которые спрашивает машина: имя, фамилия, пол,
возраст, e-mail.
Для считывания данных типа String используйте метод next(): input.next()

2)Напишите программу, которая принимает из "сканера"
возраст человека в строке и отдаёт его в вашу переменную
int. В четвёртой главе(char, String)
мы коротко рассматривали один из способов передачи такой информации.
 */

import java.util.Scanner;

public class HWTasts {
    public static void main(String[] args) {
        introduseYourSelf();
        String name = giveMeName();


    }

    private static String giveMeName() {
        Scanner scr = new Scanner(System.in);
        String result = scr.next();
        return result;
    }

    public static void introduseYourSelf() {
        String firstname, secondName, gender, email;
        int age;
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Tell your age, plz");
        age = inputTemp.nextInt(); //чтобы можно было ввести возвраст
        System.out.println("Your first name, plz");

        firstname = inputTemp.next();
        System.out.println("Your secondName?");
        secondName = inputTemp.next();
        System.out.println("Your gender?");
        gender = inputTemp.next();
        System.out.println("Email?");
        email = inputTemp.next();
        System.out.println("Did I get your age right " + age + "no" );
    }


}
