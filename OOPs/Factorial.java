package operations;

public class Factorial {
	int fact=1;
	public void fact(int num) {
		while(num>0)
		{
			fact = fact*num;
			num--;
		}
		System.out.println("Factorial of the number is: "+fact);
	}
}
