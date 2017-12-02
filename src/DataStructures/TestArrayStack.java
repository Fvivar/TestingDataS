package DataStructures;

import java.util.Scanner;

import Lists.Animal;

public class TestArrayStack {

	public static void main(String[] args) {
ArrayStack<Animal> AS = new ArrayStack<>(2);
		
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
			//Adding first animal to ArrayStack
			AS.push(newAnimal);
			
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
			//Adding second animal to ArrayStack
			AS.push(newAnimal2);
			
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
			//Adding third animal to ArrayStack
			AS.push(newAnimal3);
		
			
		//Removing "Animal" type items from ArrayStack
		System.out.println(AS.pop());
		System.out.println(AS.pop());
		System.out.println(AS.pop());
	}

}
