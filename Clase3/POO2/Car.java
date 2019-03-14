
public class Car {

  private String model;
  private int year;

  // relationship - HAS
  // an object as an attribute
  private Wheel fl, fr, bl, br;

  // can attributes that are objects have accessor methods?
  // YES
  // an object can be send as parameter
  private void setFl(Wheel fl){
    this.fl = fl;
  }

  public Wheel getFl(){
    return fl;
  }

}
