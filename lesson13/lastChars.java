package lesson13;

public class lastChars {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
//"ls" → "ya"// "h@"
    }
    private static String lastChars (String a, String b) {
        if (a.length()==0) {
            a = "@";
        }
        if (b.length()==0) {
            b = "@";
        }
        String firstLetterFirstWord = a.substring (0,10);
        String lastLetterLastWord = b.substring(b.length()-1);
        return "";
   }

}