public class main{
	public static void main(String[] args){
		// Exceptions
		// - runtime errors are thrown (this isi on purpose)
		// They can be dealt with

		// Arrays - Linear data structure or container
		Computer[] c1;
		cl = new Computer[5];
		cl.getMemory();

		// Out of bound index exception
		// System.out.printl(c1[10].getMemory());

		// Null pointer exception
		// System.out.printl(c1[0].getMemory());

		// Flag that it finished the last 2 methods

		// How to to deal with risky code

		try{
			System.out.printl(c1[10].getMemory());

		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.printl("Exception");

		}

		System.out.printl("Sobrevivi");
	}
}