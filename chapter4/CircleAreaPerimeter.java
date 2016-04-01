/*
 * Напишете програма, която чете от конзолата радиус r на кръг
* и отпечатва неговия периметър
 */
package circleareaperimeter;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class CircleAreaPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведете радиуса на кръга: ");
        double r = input.nextDouble();
        final double pi = Math.PI; //Задаване на константа с final
        
        double area = pi * r * r;
        double perimeter = 2*pi*r;
        
        System.out.println("Лицето на кръга е: " + area);
        System.out.println("Периметърът на кръга е: "+perimeter);
             
    }
    
}
