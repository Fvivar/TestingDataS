package Lists;

import java.util.Scanner;
/**
 * Adding main class for testing positional list
 * @author Fernando Gramajo
 *
 */
public class TestListas {

	public static void main(String[] args) {
		LinkedPositionalList<Animal> lnkdL = new LinkedPositionalList<>();
		
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
			//Adding first animal at start of positionalList
			lnkdL.addFirst(newAnimal);
			
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
			//Adding second animal at start of positionalList
			lnkdL.addLast(newAnimal2);
			
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
			//Adding third animal to positionalList in the previous position of last position
			lnkdL.addBefore(lnkdL.last(),newAnimal3);
		
		//Removing "Animal" type items from positionalList
		System.out.println(lnkdL.remove(lnkdL.last()));
		System.out.println(lnkdL.remove(lnkdL.first()));
		System.out.println(lnkdL.remove(lnkdL.last()));
		
	}

}
