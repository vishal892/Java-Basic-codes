package Run;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		int Limit = 50;
		System.out.println("Printing Even Number between 1 and 50");
		for(int i=1; i<=Limit; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
