class PalindromeNumber
{
	public static void main(String[] args) 
	{
		int number=121;
		boolean palindrome=palindrome(number);
		System.out.println("Palindrome Number: "+palindrome);
	}

	static boolean palindrome(int n)
	{
		int rev=0,rem,temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev==temp;
	}
	
}