
import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {


    Out.print("month: ");
        int month = In.readInt();
    Out.print("year: ");
        int year = In.readInt();   
        
          
    if (month < 1 || month > 12) {
         System.out.println("month has to be between 1 and 12.");
     } else if (year < 1) {
        System.out.println("year has to be a positive number.");
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
                    if (isleapyear(year)) {
                     days = 29;
                } else {
                    days = 28;
                            }
                 break;
                    }
        
                    
    System.out.println("The month " + month + " in the year " + year + " has " + tage + " days.");
                }
            }
        
         
    public static boolean isleapyear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        return true;
        } else {
        return false;
                }
            }
        }
