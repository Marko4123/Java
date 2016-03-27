/*
 Напишете булев израз, който да проверява дали дадено цяло число се дели на 5 и 7 без остатък
 */
package homeworks2;

/**
 *
 * @author marko
 */
public class HomeWorks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 35; //Дефиниране и инициализация на променлива от целочислен тип
        
        boolean isDevideBy5And7 = (a%5 == 0 && a%7 == 0);
        System.out.println(isDevideBy5And7);
    }
    
}
