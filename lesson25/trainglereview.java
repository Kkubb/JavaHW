package lesson25;

public class trainglereview {
    public static void main(String[] args) {
        rectangleDraw(5, 7);
    }

    public static void rectangleDraw(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

