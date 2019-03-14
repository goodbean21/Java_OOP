public class Class2 {

  public static void main(String[] args){

    // arrays???
    // array - linear data structure
    // - contains data in a list kind of fashion (one after the other)
    // - have a fixed size
    // declaration
    // type[] name
    int[] arr1;

    // initialize
    arr1 = new int[5];

    // first position is zero
    // position of value in memory = location of reference + index * size
    arr1[0] = 2;

    // can we have an array of objects? YES.

    // typical loop to traverse an array
    for(int i = 0; i < arr1.length; i++){
      System.out.println(arr1[i]);
    }

    System.out.println("******************");
    // SCOPE
    for(int i = 0; i < args.length; i++){

      System.out.println(args[i]);
    }
    System.out.println("******************");

    // strictly typed
    // all variables have a type and that is set
    // parsing / casting
    // strings to something - parsing
    int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

    // casting - return a representation of the variable in a different type
    byte result2 = (byte)result;

    // "adding" a string - concatenation
    System.out.println("HEY THIS EXIST, THIS IS PROOF! " + result);

  }
}
