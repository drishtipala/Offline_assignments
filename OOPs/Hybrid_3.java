package practicals;

public class Hybrid_3 extends Hybrid_2{
	public void palindrome()
	{
		accept();
		int num1 = num[0];
		int num2;
		num2 = num1;
		while(num1>0)
		{
			r = num1%10;
			sum = sum*10+r;
			num1 = num1/10;
		}
		if(num2==sum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}

}
