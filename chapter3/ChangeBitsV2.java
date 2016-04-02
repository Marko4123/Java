/*
 *  Напишете програма, която разменя битовете на позиции {p, p+1, …, p+k-1) с битовете на позиции 
* {q, q+1, …, q+k-1} на дадено цяло положително число.
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
        Scanner input = new Scanner (System.in);
        
        System.out.print("Въведете n: ");
        int n = input.nextInt();
        
        System.out.print("Въведете p: ");
        int p = input.nextInt();
        
        System.out.print("Въведете q: ");
        int q = input.nextInt();
        
        System.out.print("Въведете k: ");
        int k = input.nextInt();
        
        // Взимане на бита на позиция p
        int mask = 1<<p;
        int pBit =  n & mask;
        pBit = pBit >> p;
                
        //Взимаме на бита на позиция q
          mask = 1<<q;
          int qBit = n & mask;
          qBit = qBit >> q;
          
          // Размяна на местата на бит  p с q
          if (pBit == 0) {
              mask =~ (1<<q);
              n = n&mask;
          }
          else if(pBit == 1) {
              mask = 1<<q;
              n = n|mask;
          }
          
          if (qBit == 0) {
              mask = ~(1<<p);
              n = n&mask;
          }
          else if (qBit == 1) {
              mask = 1<<p;
              n = n | mask;
          }
          
          //Взимане на бит на позиция p+1
          mask = 1<<(p+1);
          int pPlusOneBit = n & mask;
          pPlusOneBit = pPlusOneBit >> (p+1);
          
          //Взимане на бит на позция q+1
          mask = 1<<(q+1);
          int qPlusOneBit = n & mask;
          qPlusOneBit = qPlusOneBit >> (q+1);
          
          if (pPlusOneBit == 0) {
              //  Сменяме стойността на q+1 на 0
               mask = ~(1<<(q+1));
               n = n & mask;
          }
          else if (pPlusOneBit == 1) {
              //Сменяме стойността на q+1 на 1
              mask = 1<<(q+1);
              n = n | mask;
          }
          
          if (qPlusOneBit == 0) {
              //Сменяме стойността на p+1 на 0
              mask = ~(1<<(p+1));
              n = n&mask;
          }
          else if (qPlusOneBit == 1) {
              //Сменяме стойността на p+1 на 1
              mask = 1<<(p+1);
              n = n|mask;
          }
          
          //Взимаме стойността на p+k-1
          mask = 1<<(p+k-1);
          int pPlusKMinusOne = n & mask;
          pPlusKMinusOne = pPlusKMinusOne >> (p+k-1);
          
          //Взимане на стойността на q+k-1
          mask = 1 << (q+k-1);
          int qPlusKMinusOne = n&mask;
          qPlusKMinusOne = qPlusKMinusOne >> (q+k-1);
          
          if (pPlusKMinusOne == 0) {
              //Промяна на стойността на q+k-1 на 0
              mask = ~(1<<(q+k-1));
              n = n&mask;
          }
          else if (pPlusKMinusOne == 1) {
              //Промяна на стойността на q+k-1 на 1
              mask = 1<<(q+k-1);
              n = n|mask;
          }
          
          if (qPlusKMinusOne == 0) {
              // Промяна на стойността на p+k-1 на 0
              mask = ~(1<<(p+k-1));
              n = n & mask;
          }
          else if (qPlusKMinusOne == 1) {
              //Промяна на стойността на p+k-1 на 1
              mask = 1<<(p+k-1);
              n = n|mask;
          }
          System.out.println(n);
    }
    
}

