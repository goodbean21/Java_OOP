// which class?
// rules (idioms) - code standards
// classes must start with uppercase letter
// if you have more than one word in the name use CamelCase
public class Food {

  // characteristics
  // attributes
  // these are represented through variables
  // encapsulation - each object protects its data
  // attributes MUST be private
  private String color;
  private String flavor;
  private float weight;

  // accessor methods
  // comes in pairs
  // write / reading
  // get / set
  private void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    // attributes can be used as variables in ANY method in the class
    return color;
  }

  private void setFlavor(String flavor){
    this.flavor = flavor;
  }

  public String getFlavor(){
    return flavor;
  }

  private void setWeight(float weight){
    this.weight = weight;
  }

  public float getWeight(){
    return weight;
  }

  // CONSTRUCTOR
  // method that is invoked upon creation
  // - we always have a constructor
  // - implicitely - we have a empty default constructor
  // - explicitely we can have as many as we wish

  // DECLARATION OF CONSTRUCTOR
  // - MUST be called as the class
  // - has NO return type
  // - regular method otherwise

  // constructor with no parameters - default
  public Food(){
    color = "red";
    flavor = "ok";
    weight = 1;
  }

  public Food(String color, String flavor, float weight){

    this.color = color;
    this.flavor = flavor;
    this.weight = weight;
  }

  // behaviours
  // these are represented through methods (not quite functions but pretty much the same)
  // declaration of methods (functions)
  // idiom - starts with lowercase, uses CamelCase
  public void giveEnergy(){
    System.out.println("YOU ARE NOW ENERGIZED. BE PRODUCTIVE.");
  }

  // methods (functions)
  // signature - firma
  // unique combination that identifies a method
  // access_modifier return_type name(parameter_list)
  public double add(float x, double y){
    return x + y;
  }

}
