/* Сортирайте 3 реални числа в намаляващ ред.  */
package changenumberorders;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class ChangeNumberOrders {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Въвъедете а: ");
        int a = input.nextInt();
        System.out.print("Въведете b: ");
        int b = input.nextInt();
        System.out.print("Въведете c: ");
        int c = input.nextInt();
        int pom;

        if (a < b) {
            pom = a;
            a = b;
            b = pom;
        }

        if (b < c) {
            pom = b;
            b = c;
            c = pom;
        }

        if (a < b) {
            pom = a;
            a = b;
            b = pom;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
