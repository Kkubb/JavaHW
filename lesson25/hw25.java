package lesson25;

import java.util.Scanner;

//BMI
public class hw25 {
    public static void main(String[] args) {
        calculator();
        System.out.println(bmiFinder(55,1.67));
    }

    private static void calculator() {
        double userW = weightFinder();
        double userH = heightFinder();
        System.out.println("BMI of the user is: " + bmiFinder(userW, userH));
    }

    private static double weightFinder() {
        double weight;
        System.out.println("Your weight ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        return weight;
    }
    private static double heightFinder() {
        double height;
        System.out.println("Your height ");
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        if (height>100) {
            height = height / 100;
        }
        return height;
    }
    private static double bmiFinder(double weight, double height) {

        return weight / (height*height);
    }
}
