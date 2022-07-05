//WAP to using polymorphism(overloading). In first method - Reverse_No, 2nd method - swapping_No, 3rd method - GRT between three_No

package practicals;

public class Overloading {
	
	public void poly(int num)
	{
		int sum=0,r;
		while(num>0)
		{
		   r = num%10;
		   sum = sum*10+r;
		   num = num/10;
		}
		System.out.println("Reverse number: "+sum);
	}
	public void poly(int n1,int n2)
	{
		System.out.println("Before swapping: n1= "+n1 +" and n2= "+n2);
		int n3;
		n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("After swapping: n1= "+n1 +" and n2= "+n2);
	}
	public void poly(int n1,int n2,int n3)
	{
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+ " is greater than other numbers");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+ " is greater than other numbers");
		}
		else
		{
			System.out.println(n3+ " is greater than other numbers");
		}	
	}
}
		

