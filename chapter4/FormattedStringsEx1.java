/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printfproject;

/**
 *
 * @author macbookair
 */
public class PrintFProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Marko";
        int age = 26;
        String town = "Sofia";
        
       System.out.printf("My name is %s.%n", name); 
       
       System.out.printf("My name is %S.%n",name);
       System.out.printf(
        "%3$s is a big town.%n"+
        "%1$s lives in %3$s.%n" +
        "%1$s is %2$d years old.%n",name,age,town);  
       
       
       
       int a = 2;
       int b = 3;
       
       System.out.printf("%d + %d = ",a,b);
       System.out.printf("%d%n",(a+b));
       
       System.out.printf("%d * %d = %d%n",a,b,(a*b));
       
       float pi = 3.14159206f;
       System.out.printf("%.2f%n",pi); // Два знака след запетайката
       System.out.printf("%.5f%n",pi);
       
       double colaPrice = 1.20;
       String cola = "Coca Cola";
       double fantaPrice = 1.20;
       String fanta = "Fanta Banbocha";
       double beerPrice = 1.50;
       String beer = "Kamenitza";
       
       System.out.println("\nMenu: ");
       System.out.printf("1. %s - %.2f%n",cola,colaPrice);
       System.out.printf("2. %s - %.2f%n",fanta,fantaPrice);
       System.out.printf("3. %s - %.2f%n", beer, beerPrice);
       
       System.out.println("\nNext sentence will be" + " on a new line!");
       System.out.printf("Bye,Bye %s from %s.%n",name,town );
       
      
    }
    
}
