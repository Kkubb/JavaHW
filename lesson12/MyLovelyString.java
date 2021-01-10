package lesson12;

public class MyLovelyString {
    public static void main(String[] args) {
        exampleOne();
    }
    static void exampleOne(){
        //charAt
        String hm = "Schwarznegger";
        System.out.println(hm.charAt(3));
        System.out.println(hm.charAt(hm.length()-3));
        char firstLetter = hm.charAt(3);
        char lastLetter = hm.charAt(hm.length()-1);
        System.out.println(firstLetter | lastLetter);
        int magicInt = firstLetter +   lastLetter;
        String magicString = "" + firstLetter + lastLetter;
        String magicString2 = String.valueOf(firstLetter + lastLetter);
        String magicString3 = "";
        magicString3 += firstLetter +lastLetter;
        String magicString4 = "";
       // magicString4 + firstLetter;



    }

}
