import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class World{

	//fields
	private int boxSize = 20; 
	//private int bugNum = 3;
	List<Bug> worldBugArray = new ArrayList<Bug>();
	List<Plants> worldPlantsArray = new ArrayList<Plants>();
	List<Obstacles> worldObstaclesArray = new ArrayList<Obstacles>();
	

//constructor 
public World(){
	
	Bug bugOne = new Bug("b1", "b1", 'B', 5, 2, 1234);
	Bug bugTwo = new Bug("b2", "b2", 'B', 10, 6, 1234);
	Bug bugThree = new Bug("b3", "b3", 'B', 9, 9, 1234);
	
	Plants plantOne = new Plants(2, 'P', 5,3);
	Plants plantTwo = new Plants(2, 'P', 7, 6);
	Plants plantThree = new Plants(2,'P',9,15);
	
	Obstacles obstaclesOne = new Obstacles(3, 'O', 1,3);
	Obstacles obstaclesTwo = new Obstacles(3, 'O', 1, 4);
	Obstacles obstaclesThree = new Obstacles(3,'O',1,5);
		
	worldBugArray.add(bugOne);
	worldBugArray.add(bugTwo);
	worldBugArray.add(bugThree);
	
	worldPlantsArray.add(plantOne);
	worldPlantsArray.add(plantTwo);
	worldPlantsArray.add(plantThree);
	
	worldObstaclesArray.add(obstaclesOne);
	worldObstaclesArray.add(obstaclesTwo);
	worldObstaclesArray.add(obstaclesThree);
	
	drawWorld(boxSize, worldBugArray);
	updatedWorld(boxSize, worldBugArray);
}
	/*try{
	Thread.sleep(500);
	}catch(InterruptedException x){}
		
	}
	
/*
//checks if bug in box then draws it
public void drawBug(int bugX, int bugY, char bugC){
	
	//prints error if bug not in box
	if(!inBox()){
		System.out.println("Error: out of box");
	}
	
	//draws bug in box
	for (int j = 0; j<bugY; j++){
			System.out.println("");
			for (int i = 0; i < bugX; i++){
			System.out.print(" ");
			}
	}
	System.out.print(bugC);
}

//checks if bug position is in box
public boolean inBox(){
	if (.gethorizontalPositionX() < boxSize &&
			this.getverticalPositionY() < boxSize){ 
	return true;
	}
	return false;
}*/

//draws the box and bugs
public void drawWorld(int boxSize, List<Bug> worldBugArray){
	boolean onLineOne = false;
	boolean onLineTwo = false;
	
	//goes accross
	for (int star = 0; star < boxSize; star++){ 
		System.out.print("* ");
	}
	//KEY: i = y space = x //does each side
	for (int i = 0;i<boxSize-2;i++){
		System.out.println("");
		System.out.print("*");
		for (int space = 0; space < boxSize-2; space++){
			
			//draws the Bug
			onLineOne = false;
			onLineTwo = false;
			for(Bug b: worldBugArray){ 
				int bugY = b.getverticalPositionY();
				int bugX = b.gethorizontalPositionX();
				char bugC = b.getSymbol();
				//No need to check if in box
					if(i == bugY && space == bugX)
					{
						System.out.print(bugC);
						onLineOne = true;
					}
			}
			//draws the plant
			//OnLine = false;//needs work
			for(Plants p: worldPlantsArray){ 
				int plantY = p.getverticalPositionY();
				int plantX = p.gethorizontalPositionX();
				char plantC = p.getSymbol();
				//No need to check if in box
					if(i == plantY && space == plantX)
					{
						System.out.print(plantC);
						if (onLineOne){
							onLineTwo = true;
						}
						else{
							onLineOne = true;
						}
					}
			}
			
			//draws the obstacles
			for(Obstacles o: worldObstaclesArray){ 
				int obstaclesY = o.getverticalPositionY();
				int obstaclesX = o.gethorizontalPositionX();
				char obstaclesC = o.getSymbol();
				//No need to check if in box
					if(i == obstaclesY && space == obstaclesX)
					{
						
						System.out.print(obstaclesC);
						if (onLineOne){
						onLineTwo = true;	
						}
						else{
							onLineOne = true;	
						}
					}
			}
			
			
			//changes the spaces required
			if(onLineOne && !onLineTwo){
			System.out.print(" ");
			}
			else if(onLineTwo){
				System.out.print("");
			}
			else{
			System.out.print("  ");
			}
		}
		System.out.print(" *");
	}
	//goes across
	System.out.println("");
	for (int star = 0; star < boxSize; star++){
			System.out.print("* ");
		}
	}
	

public void updatedWorld(int boxSize, List<Bug>worldBugArray){
	
	for(Bug b: worldBugArray){ 
		
		b.smellFood(this);
		/*	//assigns new random positions
		while(true){	
		double random = Math.random();
			if(random <= 0.2){
				b.moveLeft(5);
			}
			else if(random <= 0.5){
				b.moveRight(5);
			}
			else if(random <= 0.7){
				b.moveUp(5);
			}
			else{
				b.moveDown(5);
			}
			//makes sure new positions are in box
			if(b.gethorizontalPositionX() < boxSize && b.getverticalPositionY() < boxSize)
			{
				break;
			}
		}*/
	drawWorld(boxSize, worldBugArray);
			
	}
}
}

//create class plants
//create class obstacle
//create smellFood method
