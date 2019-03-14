public class Tablet extends Computer{
	
	public float screenSize;

	public float getScreenSize(){
		return screenSize;
	}

	public Tablet(float screenSize, String architecture, float memory) throws MemoryLimitException{
		super(architecture, memory);

		this.screenSize = screenSize;
	}

}