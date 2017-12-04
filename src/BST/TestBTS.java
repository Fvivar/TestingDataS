package BST;

import java.util.Scanner;


public class TestBTS {

	public static void main(String[] args) {
BinarySearchTree<Integer> BTS = new BinarySearchTree<>();
Scanner scan = new Scanner(System.in);

int age;
//Adding data for first animal
	System.out.println("Type the animal age");
	age=Integer.parseInt(scan.next());
	
	//Adding first animal at start of LL
	
	BTS.Insert(BTS.R, BTS.CreateNode(age));
	
	
	System.out.println("///////////////////////////////");
//Adding data for second animal
	System.out.println("Type the animal age");
	age=Integer.parseInt(scan.next());
	
	//Adding first animal at start of LL
	
	BTS.Insert(BTS.R, BTS.CreateNode(age));
	
	System.out.println("///////////////////////////////");
	//Adding data for second animal
		System.out.println("Type the animal age");
		age=Integer.parseInt(scan.next());
		
		//Adding first animal at start of LL
		
		BTS.Insert(BTS.R, BTS.CreateNode(age));
		
		
	System.out.println("///////////////////////////////");
	//Adding data for second animal
		System.out.println("Type the animal age");
		age=Integer.parseInt(scan.next());
		
		//Adding first animal at start of LL
			
		BTS.Insert(BTS.R, BTS.CreateNode(age));
			
		System.out.println("///////////////////////////////");
		
		//Adding data for second animal
		System.out.println("Type the animal age");
		age=Integer.parseInt(scan.next());		
		
		//Adding first animal at start of LL
				
		BTS.Insert(BTS.R, BTS.CreateNode(age));
		
		System.out.println("///////////////////////////////");
		//Adding data for second animal
			System.out.println("Type the animal age");
			age=Integer.parseInt(scan.next());
			
			//Adding first animal at start of LL
				
			BTS.Insert(BTS.R, BTS.CreateNode(age));
				
			System.out.println("///////////////////////////////");
			
			//Adding data for second animal
			System.out.println("Type the animal age");
			age=Integer.parseInt(scan.next());		
			
			//Adding first animal at start of LL
					
			BTS.Insert(BTS.R, BTS.CreateNode(age));
			int t=12;
			//Removing Nodes
			BTS.remove(t);


	}

}
