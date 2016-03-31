/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datesproject;
import java.util.Date;
/**
 *
 * @author macbookair
 */
public class DatesProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("The time is: %1$tH:%1$tM:%1$tS.%n", date);
        
        
        
        System.out.printf("The date in Day/Month/Year is: %1$td/%1$tm/%1$tY.%n",date);
        
        System.out.printf("%1$tA %1$tI:%1$tM %1$tB/%1$tY %n", date);
    }
    
}
