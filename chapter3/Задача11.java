/*Дадено e число n и позция p. Напишете поредица от опреции, които да отпечатват стойността на бита на позиция
 * p от числото n (0 или 1).
 * 
 * 
 * */

import java.util.Scanner;
public class GetPositionBit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Въведете число \"n\" : ");
		int n = input.nextInt();
		
		System.out.print("Въведете брой позции \"p\" : ");
		int p = input.nextInt();
		
		//Създаване на маска за манипулиране на битовете на числото 1
		int mask = 1 << p; //Двоичен вид на числото 1, изместено със зададен брой позции наляво
		
		int result = n & mask;
		result = result >> p;
		
		System.out.println(result);
	}

}
