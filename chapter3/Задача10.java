/*Напишете програма, която приеме за вход четрицифрено число във формат abcd 
 * и след това извършва следните действия:
 * 
 * Пресмята сбора на цифрите на числото
 * Разпечатва на конзолата цифрите в обратен ред
 * Поставя последната цифра, на първо място
 * Разменя мястото на втората и третата цифра
 * */

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.print("Въведете цяло четрицифрено число: ");
		Scanner input = new Scanner(System.in);
		int abcd = input.nextInt();
		
		//Взимане на а
		int a = abcd/1000;
		a = a%10;
		//Взимане на b
		int b = abcd/100;
		b = b%10;
		//Взимане на c
		int c = abcd /10;
		c = c%10;
		//Взимане на d
		int d = abcd /1;
		d = d%10;
		
		int sum = a+b+c+d; //Сума на цифрите на числото
		System.out.println("Сумата от цифрите на числото е = "+sum);
		
		//Подреждане на цифрите в обратен ред dcba 
		int reverse = 1000*d+100*c+10*b+a;
		System.out.println("Цифрите в обратен ред са: " + reverse);
		
		//Постявяне на последната цифра на първо място dabc;
		int lastToFirst = 1000*d+100*a+10*b+c;
		System.out.println("Последна цифра на първо място: " + lastToFirst);
		
		//Разменяне на местата на втората и третата цифра acbd
		int changeSecondToThird = 1000*a+100*c+10*b+d;
		System.out.println("Промяна на втората и третата цифра: " + changeSecondToThird);
			

	}

}
