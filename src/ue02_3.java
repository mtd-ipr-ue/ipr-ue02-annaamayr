import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {

            Out.print("x: ");
            double x = In.readInt();
            Out.print("y: ");
            int y = In.readInt();
                
                
                double radius = 4.0;
                
                
                double distance = Math.sqrt(x * x + y * y);
                
                
                if (distance <= radius) {
                    System.out.println("Point is within the circle");
                } else {
                    System.out.println("Point is outside the circle.");
                }
            }
        
    }
