/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareintchardouble;

/**
 *
 * @author Marko
 */
public class CompareIntCharDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int weight = 700;
        System.out.println(weight >= 500); //true
        
        char sex = 'm';
        System.out.println(sex <= 'f'); // false
        
        double colorWaveLength = 1.630;
        System.out.println(colorWaveLength > 1.621); // true
    }
    
}
