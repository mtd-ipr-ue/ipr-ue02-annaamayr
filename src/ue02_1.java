public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Hello, World!");
 
        Out.print("x: "); int x = In.readInt();
        Out.print("y: "); int y = In.readInt();
        Out.print("z: "); int z = In.readInt();
        int max;

        if (x > y && x > z) {
                max=x;
        }   else if (y > x && y > z) {
                max=y;
        }   else {
                max=z;
        }
        
        Out.print("Maximum: ");
        Out.println(max);
    }

}
