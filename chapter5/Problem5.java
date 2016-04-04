/* Напишете програма, която при въвеждане на коефициентите (a, b и c) на квадратно уравнение: 
ax2+bx+c, изчислява и извежда неговите реални корени (ако има такива). 
Квадратните уравнения могат да имат 0, 1 или 2 реални корена.*/
package problem5;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class Problem5 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Въведете а:");
        double a = input.nextDouble();
        System.out.print("Въведете b: ");
        double b = input.nextDouble();
        System.out.print("Въведете c: ");
        double c = input.nextDouble();
        
        double diskriminanta = b*b - 4*a*c;
        
        if (diskriminanta == 0) {
            double x12 = -b/2*a;
            System.out.printf("Квадратното уравнение с диксриминанта равна на %1$.1f, има корени x1=x2=%2$.1f%n",diskriminanta,x12);
        }
        else {
            if (diskriminanta > 0) {
                double x1 = (-b+diskriminanta)/2*a;
                double x2 = (-b - diskriminanta)/2*a;
                System.out.printf("Квадратното уравнение с диксриминанта равна на %1$.1f, има корени x1=%2$.1f и x2=%3$.1f%n",diskriminanta,x1,x2);
            }
            else {
                if (diskriminanta < 0) {
                    System.out.println("Уравнението няма реални корени!");
                }
            }
        }
    }
}
