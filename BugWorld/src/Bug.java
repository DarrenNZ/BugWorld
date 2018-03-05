import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Bug {
	
	private String species = "";
	private String name = "";
	private char symbol;
	private int horizontalPositionX = 0; 
    private int verticalPositionY = 0;
    private int uniqueID = 0;
    
    //needed private static int UniqueIDCounter = 0;
	
	//constructor with no arguments
	 public Bug(){	 
		 this.species = "";
		 this.name = "";
		 this.symbol = '0';
		 this.horizontalPositionX = 0; 
		 this.verticalPositionY = 0;
		 this.uniqueID = 0;
	 }
	 
	 //constructor with arguments
	 public Bug(String species, String name, char symbol,int horizontalPositionX, int verticalPositionY,int uniqueID){
		 this.species = species;
		 this.name = name;
		 this.symbol = symbol;
		 this.horizontalPositionX = horizontalPositionX; 
		 this.verticalPositionY = verticalPositionY;
		 this.uniqueID = uniqueID;
	}
	 public void smellFood(World w){
		//find nearest food
		 Plants closestPlant = new Plants();
		 int closestPlantInt = 999999;
		 int x = 0;
		 int y = 0;
		 boolean moveH = false;
		 boolean moveV = false;
		 
		//go through plant array put closest plan into local plant variable
		 for(Plants p: w.worldPlantsArray){
			 x = 0;//not sure
			 y = 0;//not sure
			 
			 //find horizontal distance pos or neg
				 x = this.gethorizontalPositionX() - p.gethorizontalPositionX();
			
			//find vertical distance pos or neg
				 y = this.getverticalPositionY() - p.getverticalPositionY();
			 
			//find closest plant
				 if(closestPlantInt > Math.abs(x) + Math.abs(y)){
				   closestPlantInt = Math.abs(x) + Math.abs(y);
				   closestPlant = p;
				 } 
		} 
		 
		 moveV= false;
		 moveH=false;
		//find the smallest distance left or right
		 if(Math.abs(this.gethorizontalPositionX() - closestPlant.gethorizontalPositionX()) 
				 < Math.abs(this.getverticalPositionY() - closestPlant.getverticalPositionY())){
			moveV = true; 
		 }
		 else{
			 moveH = true;
		 }
		//find horizontal distance pos or neg
		 x = this.gethorizontalPositionX() - closestPlant.gethorizontalPositionX();
	
	    //find vertical distance pos or neg
		 y = this.getverticalPositionY() - closestPlant.getverticalPositionY();
		//move up right down or up
		 if(moveV){
			    if(y > 0){
			    	this.moveUp(2);
			    	
			    }	
			    else if(y < 0){
			    	this.moveDown(2);
			    }
			 }
		 else if(moveH){
				 if(x > 0){
					 this.moveLeft(2);
				 }
				 else if(x < 0){
					 this.moveRight(2);
				 }
				 
			 }
		 //else
		 //move random
		 	
			
}
		
		 
	 
 	
 	//Move Methods
 	public void moveUp(int move){
	 	this.verticalPositionY += move;
		//redraw
	}
	public void moveDown(int move){
		this.verticalPositionY -= move;
		//redraw
	}
	public void moveLeft(int move){
	 	this.horizontalPositionX -= move;
	 	//redraw
	}
	public void moveRight(int move){
		this.horizontalPositionX += move;
		//redraw
	}
 	
 	

 	public void setSpecies(String species){
 		this.species = species;
 	}
 	public String getSpecies(){
 		return this.species;
 	}
 	
 	
 	//getters and setters
 	public String toString(){
 		return this.getName();
 	}
 	public String toText(){
 		return this.getName() + getSpecies();
 	}
 	
 	public void setName(String name){
 		this.name = name;
 	}
 	public String getName(){
 		return this.name;
 	}
	
 	
 	public void setSymbol(char symbol){
		this.symbol = symbol;
	}
	public char getSymbol(){
 		return this.symbol;
	}
	
	
	public void setHorizontalPositionX(int horizontalPositionX){
		this.horizontalPositionX = horizontalPositionX; 
	}
	public int gethorizontalPositionX(){
 		return this.horizontalPositionX;
	}
	
	
	public void setVerticalPositionY(int verticalPositionY){
		this.verticalPositionY = verticalPositionY;
	}
	public int getverticalPositionY(){
 		return this.verticalPositionY;
	}
	
	
	public void setUniqueID(int uniqueID){
	this.uniqueID = uniqueID;
	}
	public int getUniqueID(){
		return this.uniqueID;
	}
	
 	
 	
}

