/* 
 * Напишете програма, която проверява дали точка О (x,y) е вътре в окръжността К((0,0),5)
 * и е извън правоъгълника (-1,1),(5,5))
 * 
 * */

import java.util.Scanner;
public class PointCircleRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Въвеждане на x
		System.out.print("Въведете x: ");
		int x = input.nextInt();
		
		//Въвеждане на y
		System.out.print("Въведете y: ");
		int y = input.nextInt();
		
		boolean inTheCircleIsIt = Math.sqrt(x*x+y*y) <= 5; // Проверява дали точката е в кръга
		boolean outsideTheRectangleIsIt =(x<-1 || x>5 || y<1 || y>5); //Проверява дали точката е извън правоъгълника
		boolean result = inTheCircleIsIt && outsideTheRectangleIsIt; //Проверява и двете условия
		
		System.out.println(result); // Отпечатва резултата true или false
		

	}

}
