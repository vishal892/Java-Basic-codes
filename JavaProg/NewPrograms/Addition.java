package NewPrograms;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.println("Enter the Value1");
		int x = scan.nextInt();
		System.out.println("Entered Value1 is:");
		System.out.println(x);
		System.out.println("Enter the Value2");
		int y = scan.nextInt();
		System.out.println("Entered Value2 is:");
		System.out.println(y);
		int Addition=x+y;
	
		System.out.println("Addition is " + Addition);
		
	}

}
