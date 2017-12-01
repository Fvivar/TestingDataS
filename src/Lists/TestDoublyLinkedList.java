package Lists;

import java.util.Scanner;
/**
 * Testing class for DoublyLinkedList
 * @author Fernando Gramajo
 *
 */
public class TestDoublyLinkedList {

	public static void main(String[] args) {
DoubleLinkedList<Animal> Dll = new DoubleLinkedList<>();
		
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
			//Adding first animal at start of Dll
			Dll.addFirst(newAnimal);
			
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
			//Adding second animal at start of Dll
			Dll.addFirst(newAnimal2);
			
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
			//Adding third animal at end of Dll
			Dll.addLast(newAnimal3);
		
		//Removing "Animal" type items from end of DLL
		System.out.println(Dll.removeFirst());
		System.out.println(Dll.removeLast());
		System.out.println(Dll.removeFirst());
	}

}
