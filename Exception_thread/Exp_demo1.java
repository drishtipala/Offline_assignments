package Exception_prog;

import java.util.Scanner;

public class Exp_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
	}
	public static void demo()
	{
	    Scanner sc = new Scanner(System.in);
	    try
	    {
	    	int[] arr = new int[7];
	    	System.out.println("Enter a number:");
	    	arr[7] = sc.nextInt();
	    	System.out.println("The value in array is: "+arr[7]);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("Array value exception \n"+e.getMessage());
	    }
	}
}
