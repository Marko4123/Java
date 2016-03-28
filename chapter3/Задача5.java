/* Напишете програма, която за подадени дължина и височина на правоъгълник, изкарват на конзолата
 * неговия периметър и лице
 *   
 *   */
public class Rectangle {

	public static void main(String[] args) {
		// Дефиниране на две променливи от тип int
		 int sideA = 10;
		 int sideB = 5;
		 int area;
		 int perimeter; 
		 
		 area = sideA * sideB;
		 perimeter = 2*sideA + 2*sideB;
		 
		 System.out.println("Периметърът на правоъгълника е =  " + perimeter); //30
		 System.out.println("Лицето на правоъгълника е =  " + area); //50
		 
		

	}

}
