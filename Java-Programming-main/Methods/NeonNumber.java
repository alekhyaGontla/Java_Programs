class NeonNumber
{
	public static void main(String[] args) 
	{
		int number=9;
		boolean neon=neon(number);
		System.out.println("Neon Number: "+neon);
	}

	static boolean neon(int n)
	{
		int sum=0,rem,square=n*n;
		while(square>0)
		{
			rem=square%10;
			sum+=rem;
			square=square/10;
		}
		return sum==n;
	}
	
}