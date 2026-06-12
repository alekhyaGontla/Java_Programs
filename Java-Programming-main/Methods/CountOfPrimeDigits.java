class CountOfPrimeDigits
{
	public static void main(String[] args) 
	{
		int number=3257;
		int count=count(number);
		System.out.println(count);
	}

	static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==2||rem==3||rem==5||rem==7)
			{
				count++;
			}
			n=n/10;
		}
		return count;
	}
}