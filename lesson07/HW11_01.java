package lesson07;
//Напишите программу, которая проверяет год на високосность. Кратный четырём.

//Напишите программу, которая находит числа кратные 11 между a и b.
public class HW11_01 {
    public static void main(String[] args) {
        //System.out.println(leapYear(2020));//true - високосный
        //System.out.println(leapYear(2021));//false
        //System.out.println(leapYear(1995));//false
        System.out.println(modulo11(12));//false
        System.out.println(modulo11(11));//true
    }
    private static boolean leapYear(int year) {
        return year % 4 ==0;
    }
    public static boolean modulo11(int number){
        return number % 11 ==0;
    }


}
