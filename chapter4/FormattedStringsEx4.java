/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maketable;

/**
 *
 * @author macbookair
 */
public class MakeTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String column1 = "Column1";
        String column2 = "Column2";
        String column3 = "Column3";
        
        String row1  = "Test na sistemta";
        String row2 = "row2";
        String row3 = "row3";
        
        System.out.printf("%s %20s %20s%n",column1,column2, column3);
        System.out.printf("%s %8s %20s%n",row1,row2,row3);
    }
    
}
