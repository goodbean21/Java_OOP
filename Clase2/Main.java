// make a comment - single line
/*
multiline
comments
are practical
*/

// the actual class
// class - description has characteristics and behaviours
// object -  a specific instance that complies with the description of a class

// how to write down a class

public class Main {

    // the actual main method
    // the main entrypoint for our logic
    // the actual thing that will run when executing the program
    // only one per program
    // MUST have the following name
    public static void main(String[] args) {
      System.out.println("HEY GUYS!");

      // java uses a virtual machine
      // compilation - translate java code to virtual machine code - javac

      // VARIABLES
      // declaration
      // java is strictly typed
      // we MUST declare the type of a VARIABLE
      // variable types DON'T change

      // PRIMITIVE TYPES
      // numbers!
      // type name;
      byte var1;
      short var2;
      int var3;
      long var3_5;
      float var4;
      double var5;

      // text
      char var6;
      String var7;

      // booleans
      boolean var8;

      // assignation
      var1 = 110;
      var3 = 25000;

      var4 = 14.2f;
      var5 = 15.3;

      // chars are single quoted
      var6 = 'a';

      // strings are double quoted
      var7 = "hey guys whatsup";

      var8 = false;

      int var9 = 12;

      // FLOW CONTROL STRUCTURES
      if(var9 == 12  && var6 == 'a'){
        // this runs if conditions is true
      } else if(var1 == 110){
        // second test
      } else {
        // if everything else fails
      }

      switch(var9){
        case 12:
          System.out.println("IT WAS TWELVE!");
          break;
        case 5:
          System.out.println("FIVE!!");
          break;
        default:
          System.out.println("WE WILL REVISIT THIS LATER!");
      }

      // loops really quick
      // loop that repeats a certain amount of times
      for(int i = 0; i < 10; i++){

        System.out.println("loop: " + i);
      }

      // loops are used for code that will repeat indefinitely amount of times
      /*
      while(condition){

      }

      do {

      } while(condition);
      */


      // Objects

      // declaration
      // an object by default point to null
      // references
      Food chilaquiles;
      Food beans;
      Food donut;

      // initialization
      // the moment of creation on memory
      chilaquiles = new Food();
      beans = new Food("brown", "great", 0.2f);
      donut = new Food();
      Food taco = new Food();

      Food chilaquiles2 = chilaquiles;
      Food ch3 = chilaquiles2;

      chilaquiles = new Food();

      //beans.color = "brown";
      //donut.flavor = "delicious";

      chilaquiles.giveEnergy();
      double result = chilaquiles.add(2,3);
      System.out.println(result);
      System.out.println(beans.getColor());
    }
}
