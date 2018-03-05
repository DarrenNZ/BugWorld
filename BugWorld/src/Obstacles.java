
public class Obstacles {
	
	//class fields
	private int size = 0;
	private char symbol = '#';
	private int horizontalPositionX = 0;  
	private int verticalPositionY = 0;
	
	//constructor
	public Obstacles() {
		
		this.size = 0;
		this.symbol = '#';
		this.horizontalPositionX = 0;  
		this.verticalPositionY = 0;
	}
	//constructor
	public Obstacles(int size, char symbol, int horizontalPositionX, int verticalPositionY){
			this.size = size;
			this.symbol = symbol;
			this.horizontalPositionX = horizontalPositionX;
			this.verticalPositionY = verticalPositionY;
	}
	
	//getters and setters
	public int getSize(){
		return this.size;
	}
	public void setSize(int size){
		this.size = size;
	}
	
	public char getSymbol(){
		return this.symbol;
	}
	public void setSymbol(char symbol){
		this.symbol = symbol;
	}

	public int gethorizontalPositionX(){
		return this.horizontalPositionX;
	}			
	public void sethorizontalPositionX(int x){
		this.horizontalPositionX = x;
	}
	
	public int getverticalPositionY(){
		return this.verticalPositionY;
	}
	public void setverticalPositionY(int y){
		this.verticalPositionY = y;
	}
}
