package Lists;

import java.util.Scanner;
/**
 * Test LinkedList as Queue
 * @author Fernando Gramajo
 *
 */
public class TestLinkedListAsQueue {

	public static void main(String[] args) {
LinkedList<Animal> Queue = new LinkedList<>();
		
		Scanner scan = new Scanner(System.in);
		String type;
		int age;
		double weigth;
		String skinColor;
		//Adding data for first animal
			System.out.println("Type the animal type");
			type=scan.next();
			
			System.out.println("Type the animal age");
			age=Integer.parseInt(scan.next());

			System.out.println("Type the animal weight");
			weigth=Double.parseDouble(scan.next());
			
			System.out.println("Type the animal skin color");
			skinColor=scan.next();

			Animal newAnimal = new Animal(type,age,weigth,skinColor);
			//Adding first animal to Queue
			Queue.enqueue(newAnimal);
			
		//Adding data for second animal
			System.out.println("Type the animal type");
			type=scan.next();
			
			System.out.println("Type the animal age");
			age=Integer.parseInt(scan.next());

			System.out.println("Type the animal weight");
			weigth=Double.parseDouble(scan.next());
			
			System.out.println("Type the animal skin color");
			skinColor=scan.next();

		    Animal newAnimal2 = new Animal(type,age,weigth,skinColor);
			//Adding second animal to Queue
			Queue.enqueue(newAnimal2);
			
		//Adding data for third animal	
			System.out.println("Type the animal type");
			type=scan.next();
			
			System.out.println("Type the animal age");
			age=Integer.parseInt(scan.next());

			System.out.println("Type the animal weight");
			weigth=Double.parseDouble(scan.next());
			
			System.out.println("Type the animal skin color");
			skinColor=scan.next();

			Animal newAnimal3 = new Animal(type,age,weigth,skinColor);
			//Adding third animal to Queue
			Queue.enqueue(newAnimal3);
		
		//Removing "Animal" type items from Queue
		System.out.println(Queue.dequeue());
		System.out.println(Queue.dequeue());
		System.out.println(Queue.dequeue());
		System.out.println(Queue.dequeue());
	}

}
