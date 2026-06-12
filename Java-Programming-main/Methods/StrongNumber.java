class StrongNumber
{
	public static void main(String[] args) 
	{
		int n=145;
		boolean strongNumber=strongNumber(n);
		System.out.println("Strong Number: "+strongNumber);
	}
	static boolean strongNumber(int n)
	{
		int sum=0,temp=n;
		while(n>0)
		{
			int rem=n%10;
			sum+=factorial(rem);
			n=n/10;
		}
		return sum==temp;
	}

	static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
		 fact*=i;
		}
		return fact;
	}
}