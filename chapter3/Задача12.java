/* Дадено е число n, стойност v (v = 0 или 1) и позиция p. Напишете
поредица от операции, които да променят стойността на n, така че
битът на позиция p да има стойност v. */

import java.util.Scanner;
public class ChangeValue {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Въвеждане на числото n
		System.out.print("Въведете числото n: ");
		int n = input.nextInt();
		
		//Въвеждане на стойност v (0 или 1)
		System.out.print("Въведете стойност v: ");
		int v = input.nextInt();
		
		//Въвеждане на стойност v (0 или 1)
		System.out.print("Въведете позиция p: ");
		int p = input.nextInt();
		
		//Проверяваме дали v e 0 Или 1
		if (v == 0) {
			//Алгоритъм за промяна на бит на дадена позция на 0
			int mask = ~(1<<p);
			int newNumber = n & mask;
			System.out.println("Новото число е: " + newNumber);
		}
		else if (v == 1) {
			//Алгоритъм за промяна на бит на дадена позция на 1
			int mask = 1<<p;
			int newNumber = n | mask;
			System.out.println("Новото число е: " + newNumber);
			
		}
	}

}
