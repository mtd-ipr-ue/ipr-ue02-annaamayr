
import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {


    Out.print("month: ");
        int month = In.readInt();
    Out.print("year: ");
        int year = In.readInt();   
        
          
    if (month < 1 || month > 12) {
         System.out.println("Monat muss zwischen 1 und 12 liegen.");
     } else if (year < 1) {
        System.out.println("Jahr muss eine positive Zahl sein.");
    } else {
                    

         int days = 0;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    if (istSchaltjahr(year)) {
                     days = 29;
                } else {
                    days = 28;
                            }
                 break;
                    }
        
                    
    System.out.println("The month " + month + " in the year " + year + " has " + tage + " days.");
                }
            }
        
         
    public static boolean istSchaltjahr(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        return true;
        } else {
        return false;
                }
            }
        }
