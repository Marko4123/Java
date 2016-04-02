/*
 * Напишете програма, която отпечатва три числа в три виртуални колони на конзолата. 
* Всяка колона трябва да е с широчина 10 символа, а числата трябва да са ляво подравнени. 
* Първото число трябва да е цяло число в шестнадесетична бройна система, второто да е дробно положително, 
* а третото – да е дробно отрицателно. Последните две числа да се закръглят до втория знак след десетичната запетая.
 */
package virtualcol;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class VirtualCol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int firstNumber = input.nextInt();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        
        System.out.printf("%-10x %2$-10.2f %3$-10.2f %n",firstNumber, secondNumber,thirdNumber);
    }
    
}
