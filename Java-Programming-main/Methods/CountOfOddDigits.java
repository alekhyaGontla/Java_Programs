class CountOfOddDigits
{
	public static void main(String[] args) 
	{
		int number=4456;
		int count=countOfOddDigits(number);
		System.out.println(count);
	}

	static int countOfOddDigits(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==1)
			{
				count++;
			}
			n=n/10;
			
		}
		return count;
	}
	
}