package Exception_prog;

import java.util.Scanner;

public class Exception_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r,sum=0;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a number:");
			num = sc.nextInt();
			int num1 = num;
			while(num>0)
			{
				r = num%10;
				sum = sum*10+r;
				num = num/10;
			}
			if(num1==sum)  
			{
				throw new Exp_demo("Palindrome");
			}
			else
			{
				throw new Exp_demo("Not a Palindrome");
			}
		}
		catch(Exp_demo obj)
		{
			System.out.println("My Exception:)");
			System.out.println(obj);
		}
	}
}
