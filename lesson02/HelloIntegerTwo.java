package lesson02;

public class HelloIntegerTwo {
        public static void main(String[] args) {
            //helloInt();
            //helloByte();
            //helloShort();
            magicNumber();
        }
    public static void magicNumber() {
            int hexValue = 0x100;
            int binary = 0B1001_1001;
            int octal = 0757;
    }
        public static void helloByte() {
            byte a = 10;
            byte b = 20;
            byte c = (byte) (a +b);
            byte d = 120;
            byte e = 10;
            byte f = (byte) (d + e);
            System.out.println(f);
        }

        public static void helloShort() {
            short a = 23433;
            short b = 2423;
            short c = (short) (a + b);
            System.out.println(c);
        }
    public static void helloInt () {
            int a = 6;
            int b = 5;
        System.out.println("ожидаю шесть" + a);

    }
}
