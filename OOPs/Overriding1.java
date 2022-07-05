//WAP to implement palindrome and sum of digit using overriding

package practicals;

public class Overriding1 {
	int n1,n2,r,sum=0;
	public void poly(int n1)
	{
		n2 = n1;
		while(n1>0)
		{
			r = n1%10;
			sum = sum*10+r;
			n1 = n1/10;
		}
		if(n2==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not plaindrome");
		}
	}

}
