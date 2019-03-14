public class Engine{
	
	private int horsePower;
	private int amountOfCylinder;

	public int getHorsePower(){
		return horsePower;
	}

	public int getAmountOfCylinders(){
		return amountOfCylinder;
	}

	public Engine(int horsePower, int amountOfCylinder){
		this.horsePower = horsePower;
		this.amountOfCylinder = amountOfCylinder;
	}
	
}