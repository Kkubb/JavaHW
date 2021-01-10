package lesson06;
 /*Напишите программу, которая определяет сезон года. Месяца указаны int переменными./*

  */
public class HW06_01 {
     public static void main(String[] args) {
         int myUnknownSeason = 1;
         System.out.println(intToStringSeason(myUnknownSeason));

     }
     public static String intToStringSeason(int number){
         String output = "";
         String result = "";
         String season = "";

         switch(number) {
             case 1:
                 season  = "Winter";
                 break;
             case 2:
                 season  = "Winter";
                 break;
             case 12:
                 season  = "Winter";
                 break;
             case 3:
                 season  = "Spring";
                 break;
             case 4:
                 season  = "Spring";
                 break;
             case 5:
                 season  = "Spring";
                 break;
             case 6:
                 season  = "Summer";
                 break;
             case 7:
                 season  = "Summer";
                 break;
             case 8:
                 season  = "Summer";
                 break;
             case 9:
                 season  = "Autumn";
                 break;
             case 11:
                 season  = "Autumn";
                 break;
             case 10:
                 season  = "Autumn";
                 break;
             default:
                 season = "Not existing";
                 break;
    }
         return season;
     }
 }



