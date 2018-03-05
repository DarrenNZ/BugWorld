public class Aphid extends Bug{
	
	private int leg = 0;

	public Aphid(String species, String name, char symbol,int horizontalPositionX, int verticalPositionY,int uniqueID, int leg){
		super(species, name, symbol, horizontalPositionX, verticalPositionY, uniqueID);
		this.leg = leg;
	}
    
}
