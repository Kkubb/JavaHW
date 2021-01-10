package lesson14;
/*1. Прямоугольник При вызове метода rectangle(5, 7); на экране появился прямоугольник. Что написано в методе rectangle?
 ******* ******* ******* ******* ********/

public class rectangle {
    public static void main(String[] args) {
        rectangle(5, 7);
        combination(1, 1, 36);
        combination(1, 3, 12);
    }

    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Трое неизвестных: нужно написать алгоритм вывода на экран всех возможных комбинаций 3-х натуральных чисел до 36 с определенными условиями:
    1. необходимо использовать вложенные циклы
    2. x <= y <= z
    3. xyz = 36
    например:
    1. x=1, y=1, z=36
    2. x=1; y=3; z=12*/

    public static void combination(int x, int z, int y) {
        int result = 36;
        for (z = 1; z <= result; z++) {
            for (y = 1; y <= z; y++) {
                for (x = 1; x <= y; x++) {
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + "" + y + "" + z + "");

                    }
                }
            }

        }
    }
}

