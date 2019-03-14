
public class Car {

  private String model;
  private int year;

  // relationship - HAS
  // an object as an attribute
  private Wheel fl; //, fr, bl, br;
  /*Lazy initialize initialization
  
  This initializes the value of the variable for the 1st time.

  private Engine engine = new Engine(200,8);

  */
  private Engine engine;
  // enginge is a REFERECE in the last two cases

  // can attributes that are objects have accessor methods?
  // YES
  // an object can be send as parameter
  private void setFl(Wheel fl){
    this.fl = fl;
  }

  public Wheel getFl(){
    return fl;
  }

  //Java is case sensitive
  public void setEngine(Engine engine){
    this.engine = engine;
  }

  public Engine getEngine(){
    return engine;
  }

  public Car(){
    /* 
      Sth you can do and is very common
      Initialize objcts in the constructor
    */
      fl = new Wheel(20, "GoodYear");
      engine = new Engine(200, 8);
  }

  public Car(Wheel fl, Engine engine){
    this.fl = fl;
    this.engine = engine;
  }

} 
