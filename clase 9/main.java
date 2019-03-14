// Packages - a way to organize classes
//import javax.swing.3OptionPane;
 import javax.swing.*; // (All of the classes on this level)


public class main{
/*
	Topic list:
	- How to write the main method
	- How to write a class with its 2 parts
	- Data types
	- Object declaration
	- Good management of accs modifiers (private, public)
	- Constructos
	- Inheritance
	- Construtcotrs in inheritance
	- Override
	- Overload
	- Polymorphism 
*/

	public static void main(String[] args){
		// Getting some input from the user
		// Default values in array null or 0

		Fruit[] frutitas = new Fruit[10];
		int current = 0;

/*
		// Static method:
		String firstValue = JOptionPane.showInputDialog("Give me a value");
		String secondValue = JOptionPane.showInputDialog("Give me another value");

		// Chaging string into numbers - Parsing

		float fV = Float.parseFloat(firstValue); // float with capital F is a class
		float sV = Float.parseFloat(secondValue);

		float res = fV + sV;
*/
		int choice = 0;

		do{

			if (choice == 1){
				String fColor = JOptionPane.showInputDialog("Give me the color of the fruit");
				String fTastiness = JOptionPane.showInputDialog("Give the value of Tastiness");
				float fTast = Float.parseFloat(fTastiness);

				frutitas[current] = new Fruit(fColor, fTast);
				current++;

			}else if (choice == 2){
				for(int i = 0; i < current; i++){
					System.out.println(frutitas[i].getColor() + ", " + frutitas[i].getTastiness());
				}
			}
			String Choice = JOptionPane.showInputDialog("What do you want to do? (1. Add fruta, 2. print frutas, 3.End)");
			choice = Integer.parseInt(Choice);
		}while(choice != 3);

		// System.out.println(res);
	}
}