class SumOfFactors
{
	public static void main(String[] args)
	{
		int n=10,sum=n;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}