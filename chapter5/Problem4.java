/* Напишете програма, която за дадена цифра (0-9), зададена като вход, извежда името на цифрата . */

package nameofnumbers;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class NameOfNumbers {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        byte a = input.nextByte();
        
        switch (a) {
            case 0: 
                System.out.println("Нула");
                break;
            case 1:
                System.out.println("Едно");
                break;
            case 2:
                System.out.println("Две");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четири");
                break;
            case 5:
                System.out.println("Пет");
                break;
            case 6:
                System.out.println("Шест");
                break;
            case 7:
                System.out.println("Седем");
                break;
            case 8:
                System.out.println("Осем");
                break;
           case 9:
                System.out.println("Девет");
                break;
           default: 
               System.out.println("Няма такова число!");
        }
    }

}
