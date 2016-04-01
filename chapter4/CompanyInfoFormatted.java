/*
 * Дадена фирма има име, адрес, телефонен номер, факс, уеб сайт и мениджър.
* Мениджърът има име, фамилия, телефонен номер.
* Напишете програма, която чете информацията за компанията и нейния мениджър и я отпечатва след това
* на конзолата
 */
package company;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner companyInput = new Scanner(System.in);
        Scanner managerInput = new Scanner(System.in);
        
         System.out.println("Въвеждане на информация за фирмата: ");
         
         System.out.print("\nВъведете името на фирмата: ");
         String companyName = companyInput.nextLine();
         
         System.out.print("Въведете  адреса на фирмата: ");
         String companyAddress = companyInput.nextLine();
         
         System.out.print("Въведете уеб сайт на фирмата: ");
         String companySite = companyInput.nextLine();
         
         System.out.print("Въведете телефония номер на фирмата: ");
         int companyPhone = companyInput.nextInt();
         
         System.out.print("Въведете факса на фирмата: ");
         int companyFax = companyInput.nextInt();
         
         System.out.println("\n Въвеждане на информация за мениджъра: ");
         
         System.out.print("Въведете името на мениджъра: ");
         String menegerName = managerInput.nextLine();
         
         System.out.print("Въведете фамилия на мениджъра: ");
         String menegerLastName = managerInput.nextLine();
         
         System.out.print("Въведете телефона на мениджъра: ");
         int menegerPhone = managerInput.nextInt();
         
         System.out.printf("\nИнформаци за контакти с фирма %s %n", companyName);
         System.out.printf("Адрес : %1$s %n" +
                 "Уеб сайт: %2$s %n" +
                 "Телефонен номер на фирмата: %3$010d %n" +
                 "Fax: %4$d %n",companyAddress, companySite, companyPhone,companyFax);
         
         System.out.printf("\nВръзка с мениджъра %1$s %2$s на фирма %3$s %n", menegerName, menegerLastName, companyName);
         System.out.printf("Телефонен номер: %010d", menegerPhone);
    }
    
}
