package NewPrograms;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.println("Enter the Value");
		int user_input_number = scan.nextInt();
		System.out.println("Entered Value is:");
		System.out.println(user_input_number);
		Scanner scan1 = new Scanner(System.in);  
		System.out.println("Enter the Charecter");
		String user_input_Charecter = scan1.nextLine();
		System.out.println("Entered Charecter is:");
		System.out.println(user_input_Charecter);
		Scanner scan2 = new Scanner(System.in);  
		System.out.println("Enter the DecimalValue");
		float user_input_DecimalValue = scan2.nextFloat();
		System.out.println("Entered DecimalValue is:");
		System.out.print(user_input_DecimalValue);
	}
}