//WAP to print numbers between min and max using while loop

package java_practicals;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max,min;
		System.out.println("Enter min number:");
		min = sc.nextInt();
		System.out.println("Enter max number:");
        max = sc.nextInt();
        //To print numbers between min and max
        while(min<max)
        {
        	System.out.println(min);
        	min++;
        }
	}

}
