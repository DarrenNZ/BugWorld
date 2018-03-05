import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Main {
	
	static List<Bug> bugArray = new ArrayList<Bug>();
	
	
	public static void main(String[] args){
		
		Bug bugOne = new Bug("b1", "b1", '!', 3, 3, 1234);
		Bug bugTwo = new Bug("b2", "b2", '@', 6, 6, 1234);
		Bug bugThree = new Bug("b3", "b3", '#', 9, 9, 1234);
			
		addToBugArray(bugOne);
		addToBugArray(bugTwo);
		addToBugArray(bugThree);
		
		
		
		World w1 = new World();
		
		
		
		/*
		//taskOne
		Bug bugOne = new Bug();
		Bug bugTwo = new Bug("dirt", "butTwo", '@', 10, 15, 123);
		Bug bugThree = new Bug();
		
		Bug bugFour = createNewBugWithValues();
		
		moveRandom100(bugOne);
		System.out.println(bugOne.gethorizontalPositionX());
		System.out.println(bugOne.getverticalPositionY()); //changed to one from two for testing
		System.out.println(bugThree);
		System.out.println(bugFour);
		
		addToBugArray(bugOne);
		addToBugArray(bugTwo);
		addToBugArray(bugThree);
		addToBugArray(bugFour);
		
		for(Bug b: bugArray){
			b.toText();
		}
		System.out.println(bugArray.size());
		*/
	}
	
	//taskTwo //run checks
	public static Bug createNewBugWithValues(){
		
		
		
		 Scanner scan = new Scanner(System.in);
		 
		 String species = scan.nextLine();
		 String name = scan.nextLine();
		 char symbol = scan.nextLine().charAt(0);
		 int horizontalPositionX = scan.nextInt(); 
		 int verticalPositionY = scan.nextInt();
		 int uniqueID = scan.nextInt();
		 
		 scan.close();
		 
		 Bug temp = new Bug(species, name, symbol, horizontalPositionX , verticalPositionY, uniqueID);
		 return temp;
		 
	}
	
	//taskthree
	public static void addToBugArray(Bug bug){
		bugArray.add(bug);
	}
	
	//taskfour
	//see move methods in bug class ie bugOne.moveLeft(10);
	
	//task five
	public static void moveRandom100(Bug bug){
		
		for (int i = 0; i < 100; i++){
			double random = Math.random();
			if(random <= 0.2){
				bug.moveLeft(10);
			}
			if(random <= 0.5){
				bug.moveRight(10);
			}
			if(random <= 0.7){
				bug.moveUp(10);
			}
			if(random <= 1.0){
				bug.moveDown(10);
			}
			System.out.println(bug.gethorizontalPositionX());
			System.out.println(bug.getverticalPositionY());
		}
		
	}
	
			

}
