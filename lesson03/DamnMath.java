package lesson03;

public class DamnMath {


    public static void main(String[] args) {
        findCircleSquare();
        /* expMath(); */
    }
        public static void expMath () {
            double d1 = 1.0;
            double d2 = 28964853.0;
            double d3 = d1 / d2;
            System.out.println(d3);
//answer is 3.45246012468974E-8 where E-8 is exponence
        }

        public static void findCircleSquare () {
            int radius = 10;
            final double PI = 3.14;
            //final int MAX_TEMP = 16;
            double squareCircle = PI * radius * radius;
            System.out.println("squareCircle " + squareCircle);
        }
    }
