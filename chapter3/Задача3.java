/*
 Напишете израз, който да проверява дали дадено цяло число съдържа 7 за трета цифра (отдясно - на ляво)
 */
package homeworks3;

/**
 *
 * @author marko
 */
public class HomeWorks3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 1766;
        
        int newNumber = number/100;
        int finalNumber = newNumber % 10;
        
        boolean isEqualTo7 = (finalNumber == 7);
        System.out.println(isEqualTo7);
        
    }
    
}
