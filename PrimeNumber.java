package automation1.assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		boolean prime=false;
		for(int i=2; i<=n;i++)
		{
		if(n%i==0)
		{
		prime=true;
		break;
		 
		}
		
		}
		if(prime==true) {
		
			System.out.println(n+"  prime number");
	}else
	{
		System.out.println(n+"  not a prime number"); }}}
		

	


