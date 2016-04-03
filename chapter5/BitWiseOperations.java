

package bitwiseoperations;

/**
 *
 * @author Marko
 */
public class BitWiseOperations {

   
    public static void main(String[] args) {
        byte b1 = 6 & 5;
        /* 
        * 0000 0110
        * &
        * 0000 0101
        * ----------
        * 0000 0100 -> 4
        */
        
        byte b2 = 7 | 9;
        /*
        * 0000 0111
        * |
        * 0000 1001
        * ----------
        * 0000 1111 -> 15
        */
        
        byte b3 = 5 ^ 4;
        /*
        * 0000 0101
        * ^
        * 0000 0100
        * ----------
        * 0000 0001 -> 1
        */
         System.out.println (b1 + " " + b2 + " " + b3);
    }

}
