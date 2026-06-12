class SumOfPalindromeNumber
{
	public static void main(String[] args) 
	{
		int number=121,sum=0;
		for(int i=1;i<=500;i++)
		{
			sum+=palindrome(number);
		}
		System.out.println(sum);
	}

	static int palindrome(int n)
	{
		int rev=0,rem,temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev==temp?temp:0;
	}
	
}