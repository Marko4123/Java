/* Напишете програма, която проверява дали дадена точка О (x,y) е вътре в окръжност K ((0,0),5 */

import java.util.Scanner;
public class PointCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Моля, въведете x: ");
		int x = input.nextInt();// Въвеждане на стойността на x
		
		System.out.println("Моля, въведете y: ");
		int y = input.nextInt(); //Въвеждане на стойността на y
		
		if (Math.sqrt(x*x+y*y) <= 5) {
			System.out.println("Toчка с координати: " + "x=" +x + " и y=" +y + " е в кръга!");
		}
		else {
			System.out.println("Toчка с координати:" + "x="+x + " и y=" +y + " е извън кръга!");
		}
		

	}

}
