package lesson07;
//% //modulo
public class HelloModulo {
    public static void main(String[] args) {
        int a = 7%4;//модуло - остаток от деления. например 19/2=9(только одно), 9+9=18= 1 - модуло
        int b = 7/4;
        System.out.println(a);
        System.out.println(b);

        if (a%2==0){
            System.out.println("even number");

        }else {
            System.out.println("uneven number");
        }
    }
}
