package aNumber;

public class ArmNumber {
	public static void main(String [] arms)
	{
		int a =153;
		int rem=0;
		int x =0;
		while(a>0)
		{
			rem=a%10;
			x=x + rem*rem*rem;
			a=a/10;
		}
		System.out.println(x);
	}

}