package lesson25;
//nested loops
public class threeeunknown {
    public static void main(String[] args) {
        magicVariable();

    }

    private static void magicVariable() {
        for (int x = 1; x <= 36; x++) {  //x=1
            for (int y = x; y <= 36; y++) {   //y=2
                for (int z = y; z <= 36; z++) { //z=1 to 36
                    if (x*y*z==36) {
                        System.out.println("We won, while ");
                        System.out.print("x = "+ x +",");
                        System.out.print("y = "+ y+",");
                        System.out.print("z = "+ z);
                        System.out.println();
                    }
                }
            }
        }
    }

}
