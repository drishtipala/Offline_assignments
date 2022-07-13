package Exception_prog;

public class Exp_demo extends Exception{
	String ans;
	Exp_demo(String as)
	{
		ans=as;
	}
	public String toString()
	{
		return ("The given number is:"+ans);
	}
}
