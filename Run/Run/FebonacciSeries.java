package Run;

public class FebonacciSeries {

	public static void main(String[] args) {
		int limit=20;
			long[] series = new long[limit];
			series[0]=0;
			series[1]=1;
			for(int i=2; i<limit; i++)
			{
				series[i]=series[i-1]+ series[i-2];
			}
			System.out.println("Fibonecci Series upto " +limit);
			for(int i=0; i<limit; i++)
			{
				System.out.print(series[i] + " ");
			}

	}

}
