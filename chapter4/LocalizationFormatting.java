/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localization;
import java.util.Locale;
import java.util.Date;

/**
 *
 * @author macbookair
 */
public class Localization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        Locale.setDefault (new Locale("bg", "BG")); // Задаване на локализация
        
        System.out.println("Locale: " + Locale.getDefault().toString());
        System.out.printf("%1$tA %1$tI:%1$tM %1$tB-%1$tY %n", date);
    }
    
}
