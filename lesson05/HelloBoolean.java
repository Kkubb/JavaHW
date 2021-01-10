package lesson05;


public class HelloBoolean {
    public static void main(String[] args) {
        magicGame2();

    }
    public static void magicGame (){
        int a = 5;
        int b = 10;
        boolean c = a>b; //false
        System.out.println(c);
        System.out.println(a <= b); //true
        System.out.println(a >= b); //false
    }

    public static void magicGame2() {
        boolean a = (7+8)*5 > 7+8*5;//true
        boolean b = (7+8)*4 != 7+4*5;//true
        boolean c = 3+4 > 9+1 & 16-5 > 3*4;//false
        boolean d = 16/2 < 6+2 | 4+5 <= 4*5;//false or true = true
        boolean e = !(3*4 < 7+8);//not ! false
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
    }

    public static void booleanIntro (){
        boolean a = true;
        boolean b = false;
        boolean c = a && b; //логическое И and
        System.out.println(c);
        System.out.println(a || b); //|| - ИЛИ or
        System.out.println(!a); //! - НЕ not
        boolean d  = !a;
        boolean f = a^b; //^ исключительное (exponentiation) xor
        System.out.println(f);
    }


}
