class FactorialValue
{
	public static void main(String[] args) 
	{
		int n=4;
		int f=factorial(n);
		System.out.println(f);
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