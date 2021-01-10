package lesson02;


public class homework2 {
    public static void main(String[] args) {
        findCubePerimeter();
        findCubeSquare();

        findTrianglePerimeter();
        findTriangleSquare();

        findRectanglePerimeter();
        findRectangleSquare();
    }
    public static void findCubePerimeter() {
        int a = 10;
        int perimeter = 12 * a;
        System.out.println("Периметр куба равен: " + perimeter);
    }
    public static void findCubeSquare() {
        int a = 10;
        int square = a * a;
        int cubeSquare = 6 * square;
        System.out.println("Площадь куба равна: " + cubeSquare);
    }

    public static void findTrianglePerimeter() {
        short b = 135; //стороны (равнобедренного) треугольника
        short c = 68; //основание треугольника
        short f = 80; //высота треугольника
        short trianglePerimeter = (short) (b + c + b);
        System.out.println("Периметр треугольника равен: " + trianglePerimeter);
    }
    public static void findTriangleSquare() {
        short b = 135; //стороны (равнобедренного) треугольника
        short c = 68; //основание треугольника
        short f = 80; //высота треугольника
        short triangleSquare = 68 / 2 * 80;
        System.out.println("Площадь треугольника равна: " + triangleSquare);
    }

    public static void findRectanglePerimeter() {
        long d = 48625;
        long e = 5489;
        long rectanglePerimeter = d * 2 + e * 2;
        System.out.println("Периметр прямоугольника равен: " + rectanglePerimeter);
    }
    public static void findRectangleSquare() {
        long d = 48625;
        long e = 5489;
        long rectanglePerimeter = d * 2 + e * 2;
        long rectangleSquare = d * e;
        System.out.println("Площадь прямоугольника равна: " + rectangleSquare);
    }

    //попытка решить задачу про зернышки
    //пусть N = 1*2*3*4*5*6*7*8*9
          //  а дальше я нагуглила про факториалы и попыталась разобраться в рекурсии, но стало очень уж сложно, три звездочки не для меня

}