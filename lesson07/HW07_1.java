package lesson07;

/*Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        при езде до 50 км/час нарушений нет;
        за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        за превышение скорости от 16 км/час — 40 евро штрафа;
        за езду от 100 км/час до 130 км/час — штраф 500 евро;
        и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства.*/


public class HW07_1 {

        public static void main(String[] args) {
            userCarSpeed(201);
        }


    public static void userCarSpeed(int speed) {

            if (speed < 50) {
                System.out.println("All fine, continue driving");
            }
            else if (speed >= 50 && speed < 65) {
                System.out.println("Please drive carefully, your speed is higher than recommended, blah blah - no fine");
            }
            else if (speed >= 65 && speed < speed + 16 && speed < 100 ) {
                System.out.println("Your speed is 16 km faster than possible for this road, you are fined with 40 euro");
            }
            else if (speed >= 100 && speed < 130) {
                System.out.println("You are fined with 500 euro for driving that fast");
            }
            else if (speed > 130) {
                System.out.println("You are fined with 1000 euro\n" +
                        "You lose your licence for 3 years from now\n" + "Gimme your car, it now stays with me\n");
            }
        }

}
