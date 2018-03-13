
package practise;
import java.util.Scanner;
public class Practise {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        float a, b;
        
        System.out.println("Total Hours =");
        a = input.nextFloat();
        
        System.out.println("Class Hours' =");
        b = input.nextFloat();
        
        System.out.println("Number of Classes = "+a/b);
    }
    
}
