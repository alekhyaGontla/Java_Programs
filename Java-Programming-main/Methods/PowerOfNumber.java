class PowerOfNumber
{
	public static void main(String[] args) 
	{
		int n=4,p=2;
		int f=power(n,p);
		System.out.println(f);
	}

	static int power(int n,int p)
	{
		int pow=1;
		for(int i=1;i<=p;i++)
		{
		 pow*=n;
		}
		return pow;
	}
}