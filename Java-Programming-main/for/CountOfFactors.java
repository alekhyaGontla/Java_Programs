class CountOfFactors
{
	public static void main(String[] args)
	{
		int n=10,c=1;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}