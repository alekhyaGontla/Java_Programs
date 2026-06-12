class CountOfDigits
{
	public static void main(String[] args) 
	{
		int number=4456;
		int count=count(number);
		System.out.println(count);
	}

	static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
}