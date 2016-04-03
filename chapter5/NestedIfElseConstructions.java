package nestedifelseconstructions;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class NestedIfElseConstructions {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please eneter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        if (first == second) {
            System.out.println("These two numbers are equal.");
        }
        else {
            if (first > second) {
                System.out.println("The first number is greater.");
            }
            else {
                System.out.println("The second number is greater.");
            }
        }
        
    }

}
