
public class BedBug extends Bug{
	
	private int leg = 0;
	
	public BedBug(int x, int y, int energy){
		super("BedBug", "", 'B', x, y, energy);
	}

	public BedBug(String species, String name, char symbol,int horizontalPositionX, int verticalPositionY,int uniqueID, int leg){
		super(species, name, symbol, horizontalPositionX, verticalPositionY, uniqueID);
		this.leg = leg;
	}
    
}
