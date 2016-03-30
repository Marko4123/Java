/*
 * Размяна на битове 3, 4, 5 и 24, 25, 26
 */
package changebits;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */

public class ChangeBits {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведете число: ");
        int number = input.nextInt();
        
        //Взимане на третия бит
        int mask = 1 << 3;
        int thirdBit = number & mask;
        thirdBit = thirdBit >> 3;
        
        //Взимане на 24-я бит
        mask = 1 << 24;
        int twentyFourthBit = number & mask;
        twentyFourthBit = twentyFourthBit >> 24;
      
        
        //Проверяваме дали 3-ят бит е 0 и сменяме 24-я с 0
        if (thirdBit == 0) {
            mask = ~(1<<24);
            number= number & mask;
        }
        else if (thirdBit == 1) { //Проверяваме дали 3-ят бит е 1 и сменяме 24 с едно
            mask = 1<<24;
            number = number | mask;
            
        }
        
        if (twentyFourthBit == 0) { //Проверяваме дали 24-ят е 0 и сменяме стойността на 3-я бит с 0
            mask = ~(1<<3);
            number = number & mask;
        }
        else if (twentyFourthBit == 1) {//Проверяваме дали 24-ят е 1 и сменяме стойността на 3-я бит с 1
            mask = 1<<3;
            number = number | mask;
        }
        
        //Взимане на 4ти бит
        mask = 1<<4;
        int fourthBit = number & mask;
        fourthBit = fourthBit >> 4;
        
        //Взимане на 25-я бит
        mask = 1<<25;
        int twentyFifthBit = number & mask;
        twentyFifthBit = twentyFifthBit >> 25;
        
        if (fourthBit == 0) {//Проверяваме дали 4-ят е 0 и сменяме стойността на 25-я бит с 0
            mask = ~(1<<25);
            number = number & mask;
        }
        else if (fourthBit == 1){//Проверяваме дали 4-ят е 1 и сменяме стойността на 25-я бит с 1
            mask = 1<<25;
            number = number | mask;
        }
        
        if (twentyFifthBit == 0) {//Проверяваме дали 25-ят е 0 и сменяме стойността на 4-я бит с 0
            mask = ~(1<<4);
            number = number & mask;
        }
        else if (twentyFifthBit == 1){//Проверяваме дали 25-ят е 1 и сменяме стойността на 4-я бит с 1
            mask = 1<<4;
            number = number | mask;
        }
        
        //Взимане на 5ти
        mask = 1<<5;
        int fifthBit = number & mask;
        fifthBit = fifthBit >> 5;
        
        //Взиманена 26-я бит
        mask = 1<<26;
        int twentySixthBit = number & mask;
        twentySixthBit = twentySixthBit >> 26;
        
         if (fifthBit == 0) {//Проверяваме дали 5-ят е 0 и сменяме стойността на 26-я бит с 0
            mask = ~(1<<26);
            number = number & mask;
        }
        else if (fifthBit == 1){//Проверяваме дали 5-ят е 1 и сменяме стойността на 26-я бит с 1
            mask = 1<<26;
            number = number | mask;
        }
        
        if (twentySixthBit == 0) {//Проверяваме дали 26-ят е 0 и сменяме стойността на 5-я бит с 0
            mask = ~(1<<5);
            number = number & mask;
        }
        else if (twentySixthBit == 1){//Проверяваме дали 26-ят е 1 и сменяме стойността на 5-я бит с 1
            mask = 1<<5;
            number = number | mask;
        }
        System.out.println(number);//Отпечатваме резултата
    }
    
}
