/* Силата на гравитационното поле на луната е приблизително 17% от това на Земята.
 * Напишете програма, която да изчислява тежестта на човек на луната по дадена тежест на земята
 * 
 * 0.17*Вашето тегло
 * 
 * */
import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight: ");
		int number = input.nextInt();
		
		double weightMoon = 0.17*number;
		
		System.out.println(weightMoon);

	}

}
