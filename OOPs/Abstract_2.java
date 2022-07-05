package practicals;

import java.util.Scanner;

public class Abstract_2 extends Abstract_1{
    Scanner sc = new Scanner(System.in);
	@Override
	public void demo() {
		int num1,num2,r,sum=0;
		System.out.println("Enter a number:");
		num1 = sc.nextInt();
		num2 = num1;
		while(num1>0)
		{
			r = num1%10;
			sum = sum*10+r;
			num1 = num1/10;
		}
		if(num2==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrome");
		}
	}
    public static void main(String[] args)
    {
	   Abstract_2 obj = new Abstract_2();
	   obj.demo();
	   obj.stu_data();
    }
}