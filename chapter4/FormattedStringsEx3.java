/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printfproject3;

/**
 *
 * @author macbookair
 */
public class PrintFProject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
        
        System.out.printf("%f%n", pi);// 3.141593
        
        System.out.printf("%.3f%n",pi); // 3.142
        
        System.out.printf("\"%10.3f\"%n",pi); // "     3.142"
        
        System.out.printf("\"%-10.3f\"%n",pi); //"3.142     "
        
    }
    
}
