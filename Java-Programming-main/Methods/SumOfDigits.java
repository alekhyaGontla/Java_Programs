class SumOfDigits
{
	public static void main(String[] args) 
	{
		int n=4456;
		int sum=sumOfDigits(n);
		System.out.println(sum);
	}

	static int sumOfDigits(int n)
	{
		int sum=0,rem=0;
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}

}