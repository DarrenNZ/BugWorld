
public class Plants {
	
	int size = 0;
	char symbol = '!';
	int horizontalPositionX = 0;  
	int verticalPositionY = 0;
	
	public Plants(){
		this.size = 0;
		this.symbol = '!';
		this.horizontalPositionX = 0;
		this.verticalPositionY = 0;
	}
	public Plants(int size, char symbol, int horizontalPositionX, int verticalPositionY){
		this.size = size;
		this.symbol = symbol;
		this.horizontalPositionX = horizontalPositionX;
		this.verticalPositionY = verticalPositionY;
	}
	
	public int getSize(){
		return this.size;
	}
	public void setSize(int size){
		this.size += size;	
		if(this.size > 0){
			this.size = 9;
		}
		if(this.size < 1){
			this.size = 1;
		}
	}
	
	public int gethorizontalPositionX(){
		return this.horizontalPositionX;
	}
	public void sethorizontalPositionX(int x){
		this.horizontalPositionX += x;
	}
	
	
	public int getverticalPositionY(){
		return this.verticalPositionY;
	}
	public void setverticalPositionY(int y){
		this.verticalPositionY += y;
	}
	
	public char getSymbol(){
		return this.symbol;
	}
	
	
	
	
}
