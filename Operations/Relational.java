//WAP to accept number from the user and perform using relational operator

package java_practicals;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		boolean res;
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		res = num1>=num2;
		System.out.println("Result:"+res);
        res = num1<=num2;
        System.out.println("Result:"+res);
        res = num1==num2;
        System.out.println("Result:"+res);
        res = num1!=num2;
        System.out.println("Result:"+res);
	}

}
