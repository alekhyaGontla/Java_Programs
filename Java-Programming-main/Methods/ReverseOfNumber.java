class ReverseOfNumber
{
	public static void main(String[] args) 
	{
		int number=9121;
		int reverse=reverse(number);
		System.out.println(reverse);
	}

	static int reverse(int n)
	{
		int rev=0,rem;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	
}