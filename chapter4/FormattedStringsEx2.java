/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printfproject2;

/**
 *
 * @author macbookair
 */
public class PrintFProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 120582;
        System.out.printf("\"%d\"%n", n); // "120582"
        
        //Допълвне на числото до 8 символа с 0 отпред
        System.out.printf("\"%08d\"%n",n); // "00120582"
        
        /*Винаги поставяне на знак + пред числото и допълване до 8 символа, 
        като числото се измества надясно с необхдим брой интервали
        в случая 1
        */
        System.out.printf("\"%+8d\" %n",n);// " +120582"
        
        /*Изместване на числото на дясно с необходим брой интервали до 8 символа.
        В случая 2 интервала
        */
        System.out.printf("\"%8d\"%n",n); // "  120582"
        
        /*Изместване на числото на ляво с необходим брой интервали до 8 символа.
        В случая 2 интервала
        */
        System.out.printf("\"%-8d\"%n",n); //"120582  "
        
        /* Слагане на запетайка където е необходимо и допълване на числото до 8 символа
        като го измества надясно с интервали. 
        В нашия случай 1
        */
        System.out.printf("\"%,8d\"%n",n); //" 120,582"
        
        /* Слагане на запетайка където е необходимо и допълване на числото до 8 символа
        като го измества наналяво с интервали. 
        В нашия случай 1
        */
        System.out.printf("%,-8d%n",n); // "120,582 "
        
        /* Слагане на запетайка където е необходимо и  знак + пред числото
        и го изместваме надясно с определен брой интервали, ако е необходимо
        */
        System.out.printf("\"%+,8d\"%n",n); //"+120,582"
        
    }
    
}
