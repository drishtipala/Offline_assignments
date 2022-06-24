//WAP to accept number from the user and perform arithmetic operation

package java_practicals;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,add,sub,mul,div,mod;
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		mod = num1%num2;
		System.out.println("Addition:"+add);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+mul);
		System.out.println("Division:"+div);
		System.out.println("Modulus:"+mod);
	}

}
