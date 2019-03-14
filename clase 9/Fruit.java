public class Fruit{
	
	// Attributes

	private String color;
	private float tastiness;

	// Accesor methods

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public float getTastiness(){
		return tastiness;
	}

	public void setTastiness(float tastiness){
		this.tastiness = tastiness;
	}

	public Fruit(String color, float tastiness){
		this.color = color;
		this.tastiness = tastiness;

	}

	public Fruit(){
		// Default constructor

	}

	// Behaviours
}