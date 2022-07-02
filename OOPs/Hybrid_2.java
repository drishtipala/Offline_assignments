package practicals;

public class Hybrid_2 extends Hybrid_1{
	public void GRT()
	{
		accept();
		for(i=0;i<size;i++)
		{
			System.out.println(num[i]);
		} 
		temp = num[0];
		for(i=0;i<size;i++)
		{
			if(temp<num[i])
			{
				temp = num[i];
			}
			
		}
		System.out.println("The greater value is: "+temp);
	}

}
