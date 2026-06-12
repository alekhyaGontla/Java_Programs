public class PalindromeElements
{
	public static void main(String[] args)
	{
	int c[]= {10,121,2,3,4,45};
	for(int i=0;i<=c.length-1;i++) 
	{
		if(palindrome(c[i])) 
		{
			System.out.println(c[i]);
		}
	}
    }
	
	static boolean palindrome(int a) 
	{
		int rev=0,rem,temp=a;
		while(a>0) 
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		
		return rev==temp;
		
	}

}

