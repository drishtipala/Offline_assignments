package operations;

public class Arithmetic{
	int num1,num2,res;
	public void oper(int num1, int num2)
	{
		res = num1 + num2;
		System.out.println("Addition of numbers is: "+res);
		res = num1 - num2;
		System.out.println("Subtraction of numbers is: "+res);
		res = num1 * num2;
		System.out.println("Multiplication of numbers is: "+res);
		res = num1 / num2;
		System.out.println("Division of numbers is: "+res);
		res = num1 % num2;
		System.out.println("Modulus of numbers is: "+res);
	}
}


