class PrimeNumber
{
   public static void main(String[] args) 
	{
		int n=2;
		if(prime(n))
		{
		System.out.println(n+" is a Prime Number");
		}
		else
		{
			System.out.println(n+" is not a Prime Number");
		}
	}

	static boolean prime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
		 if(n%i==0)
		 {
			 return false;
		 }
		}
		return true;
	}
}