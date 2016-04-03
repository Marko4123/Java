package ifconstruction;
import java.util.Scanner;


/**
 *
 * @author Marko
 */
public class IfConstruction {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Eneter two numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        
        int biggest = firstNumber;
        if (secondNumber > biggest) {
            biggest = secondNumber;
        }
        System.out.printf("The biggest number is: %d%n", biggest);
    }

}
