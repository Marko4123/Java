/* Напишете израз, който изчислява площта на трапец по дадени а, b и h 
 * 0.5*(a+b)*h
 * */
public class Trapeze {

	public static void main(String[] args) {
		//Дефиниране на променливи от тип float
		float a = 10f;
		float b = 3f;
		float h = 4f;
		
		// Искаме резултата във float затова преобразуваме 0.5(double) във float --- (float)0.5
		float area = (float)0.5*(a+b)*h; 
		System.out.println(area);

	}

}
