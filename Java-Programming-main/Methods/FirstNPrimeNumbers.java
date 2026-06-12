class FirstNPrimeNumbers
{
   public static void main(String[] args) 
	{
		int n=4,i=2,count=0;
		while(true)
		{
			if(prime(i))
			{
				System.out.print(i+" ");
				count++;
				if(count==n)
				{
					break;
				}
			}
			i++;
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