/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebiggestnumberv2;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class TheBiggestNumberV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Въведете първото число: ");
        int firstNumber = input.nextInt();

        System.out.print("Въведете  второто число: ");
        int secondNumber = input.nextInt();

        System.out.print("Въведете третото число: ");
        int thirdNumber = input.nextInt();

        System.out.print("Въведете четвъртото число: ");
        int fourthNumber = input.nextInt();

        System.out.print("Въведете петото число: ");
        int fifthNumber = input.nextInt();
        
        int largest = firstNumber;
        
        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }
        if (fourthNumber > largest) {
            largest = fourthNumber;
        }
        if (fifthNumber > largest) {
            largest = fifthNumber;
        }   
        System.out.println(largest);
    }
    
}
