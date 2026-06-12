class PrevNextPrime
{
	public static void main(String[] args)
	{
		int i=15,j=i-1;
		System.out.println(previousNumber(i));
		System.out.println(nextNumber(i));
	}
	static int previousNumber(int n)
	{
		if(n<=1)
		{
			return 2;
		}
		n--;
		while(true)
		{
			if(prime(n))
			{
				return n;
			}
			n--;
		}	
	}
	static int nextNumber(int n)
	{
		n++;
		while(true)
		{
			if(prime(n))
			{
				return n;
			}
			n++;
		}
		
	}
	static boolean prime(int i)
	{
	    if(i<=1)
		{
			return false;
		}
		for(int a=2;a<=i/2;a++)
		{
			if(i%a==0)
			{
				return false;
			}	
		}
        return true;
	}	
}