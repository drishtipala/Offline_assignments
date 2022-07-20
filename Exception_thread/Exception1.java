package practicals;

public class Exception1 extends RuntimeException{
	String name;
	Exception1(String nm)
	{
		name = nm;
	}
	public String toString()
	{
		return ("The given number is: "+name);
	}
}
