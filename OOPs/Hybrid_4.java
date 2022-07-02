package practicals;

public class Hybrid_4 extends Hybrid_1{
	public void avg()
	{
		accept();
		for(i=0;i<size;i++)
		{
			sum+=num[i];
		}
		avg = sum/size;
		System.out.println("Average of number is: " +avg);
	}

}
