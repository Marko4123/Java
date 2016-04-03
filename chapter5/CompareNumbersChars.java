/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparenumberschars;

/**
 *
 * @author Marko
 */
public class CompareNumbersChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char a = 'a';
        char b = 'b';
        System.out.println("char \'a\' == \'a\' ? " + (a == a)); // true
        System.out.println("char \'b\' == \'b\' ? " + (a == b)); // false
        System.out.println("5 != 6 ? " + (5 != 6)); // true
        System.out.println("5.0 == 5L ? " + (5.0 == 5L)); //true
        System.out.println("true == false ? " + (true == false)); // false
    }
    
}
