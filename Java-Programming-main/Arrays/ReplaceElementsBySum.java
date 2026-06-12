public class ReplaceElementsBySum{
	public static void main(String[] args)
	{
		int a[]= {10,20,30},s;
		
		for(int i=0;i<=a.length-1;i++) 
		{
			
			a[i]=sumOf(a[i]);
		
			System.out.println(a[i]);
		}
	}
	static int sumOf(int a) 
	{
		int s=0,rem;
		while(a>0)
		{
			rem=a%10;
			s+=rem;
			a=a/10;
			
		}
		return s;
		}	
	}
}