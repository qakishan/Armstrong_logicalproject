package aNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 154;
		int rem=0;
		int result=0;
		
		while(a>0)
		{
			rem=rem%10;
			result=result*10+rem;
			a=a/10;
		}
		System.out.println(a);

	}

}
