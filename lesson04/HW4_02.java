package lesson04;

public class HW4_02 {
    public static void main(String[] args) {
        magicString();

    }
    public static void magicString() {
        String firstName="User name is: Liza ";
        String secondName="Kubinskaia";
        String age = "\nUser age is: 27\n";
        String city = "She lives in Berlin, ";
        String address = "in Flughafenstrasse 60\n";
        String course = "She studies fundamentals of Java\n";
        String user=firstName + secondName + age + city + address + course ;
        System.out.println(user);
    }

}
