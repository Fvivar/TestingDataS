package DataStructures;

import java.util.Scanner;

import Lists.Animal;
import Lists.DoubleLinkedList;

public class TestArrayList {

	public static void main(String[] args) {
ArrayList<Animal> AL = new ArrayList<>(2);
		
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
			//Adding first animal to ArrayList
			AL.add(0,newAnimal);
			
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
			//Adding second animal to ArrayList
			AL.add(1,newAnimal2);
			
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
			//Adding third animal to ArrayList
			AL.add(2,newAnimal3);
		
		//Changing values at certain index
			AL.set(0, newAnimal3);
			AL.set(1, newAnimal2);
			AL.set(2, newAnimal);
			
		//Removing "Animal" type items from end of ArrayList
		System.out.println(AL.remove(0));
		System.out.println(AL.remove(1));
		System.out.println(AL.remove(0));
	}

}
