/* WAP to print the following using for loop: 
*****  
 ****
  ***
   **
    * 
 */

package java_practicals;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
