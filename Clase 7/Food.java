/* Rules(idioms) - code standards
	classes must start with uppercase letter
	if you have more than one word in the name use CamelCase
		** CamelCase Example: FoodForTheSoul **  

*/

public class Food{
	
	/* Characteristics (or Attributes)
		These are presented through variables
	*/

	public String color;
	public String flavor;
	public double weight;

	/* Behaviours	
		These are presented through methods
		Declaration of methods functions()
		Idioms - Starts with lowervase, afterwards CamelCase
	*/

	public void giveEnergy(){
		System.out.println("YOU ARE NOW ENERGIZED. BE PRODUCTIVE");
	}

	//	OBJECTS

	// Declaration
	
	Food chilaquiles;

	// Inizialization

	chilaquiles = new Food();

	chilaquiles.giveEnergy();
}