/*
 Напишете израз, който да проверява дали дадено цяло число е четно или нечетно
 */
package homework1;

/**
 *
 * @author marko
 */
public class HomeWork1 {

    /**
     * Случай за тестване
     * 2
     * 3
     * Integer.MAX_VALUE
     * Integer.MIN_VALUE
     * 0
     * -1
     * -2
     * 1
     * 100000
     */
    public static void main(String[] args) {
        int a = 100000; //Дефинииране и инициализация на цяло число
        boolean isEven = (a%2 == 0); //Дефиниране на булев израз, който да проверява дали числото е четно
        
       System.out.println(isEven); //Принтиране на резултата, като true или false

    }
    
}
