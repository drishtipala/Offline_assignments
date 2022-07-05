package practicals;

public class Overriding2 extends Overriding1{
	int sum=0,i,n1,digit;
	public void poly(int n1)
	{
		while(n1>0)
		{
			digit = n1%10;
			sum = sum + digit;
			n1 = n1/10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}
