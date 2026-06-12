class SpyNumber
{
	public static void main(String[] args) 
	{
		int number=4456;
		boolean s=spy(number);
		System.out.println("Spy Number: "+s);
	}

	static boolean spy(int n)
	{
		int sum=0,rem=0,product=1;
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			product*=rem;
			n/=10;
		}
		return sum==product;
	}
}