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
        
        //Печата реалната стойност на pi в float
        System.out.printf("%f%n", pi);// 3.141593
        
        //Печата pi 3 символа след запетайката
        System.out.printf("%.3f%n",pi); // 3.142
        
        //Печата pi 3 символа след запетайката и допълва до 10, като измества числото надясно с необходим брой интервали
        System.out.printf("\"%10.3f\"%n",pi); // "     3.142"
        
        //Печата pi 3 символа след запетайката и допълва до 10, като измества числото наляво с необходим брой интервали
        System.out.printf("\"%-10.3f\"%n",pi); //"3.142     "
        
    }
    
}
