package Lists;

import java.util.Scanner;
/**
 * Test implementation of LeakyStack
 * Based on a CircularLinkedList works as a Stack
 * @author Fernando Gramajo
 *
 */
public class TestingCircularLL {

	public static void main(String[] args) {
		ImplLeakyStack<Animal> Cll = new ImplLeakyStack<>(2);
		
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
			//Adding first animal at end of ImplLeakyStack
			Cll.saveHistory(newAnimal);
			
		//Adding data for second animal
			System.out.println("Type the animal type");
			type=scan.next();
			
			System.out.println("Type the animal age");
			age=Integer.parseInt(scan.next());

			System.out.println("Type the animal weight");
			weigth=Double.parseDouble(scan.next());
			
			System.out.println("Type the animal skin color");
			skinColor=scan.next();

		    newAnimal = new Animal(type,age,weigth,skinColor);
			//Adding second animal at end of ImplLeakyStack
			Cll.saveHistory(newAnimal);
			
		//Adding data for third animal	
			System.out.println("Type the animal type");
			type=scan.next();
			
			System.out.println("Type the animal age");
			age=Integer.parseInt(scan.next());

			System.out.println("Type the animal weight");
			weigth=Double.parseDouble(scan.next());
			
			System.out.println("Type the animal skin color");
			skinColor=scan.next();

			newAnimal = new Animal(type,age,weigth,skinColor);
			//Adding third animal at end of ImplLeakyStack
			Cll.saveHistory(newAnimal);
		
		//Removing "Animal" type items from end of ImplLeakyStack
		System.out.println(Cll.removeFirst());
		System.out.println(Cll.removeFirst());
	}

}
