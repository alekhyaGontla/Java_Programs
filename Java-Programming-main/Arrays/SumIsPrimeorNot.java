public class SumIsPrimeorNot
 {
	public static void main(String[] args)
	{
		int a[]= {10,20,30},small=a[0],big=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		int sum=small+big;
		if(prime(sum))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("NOt Prime");
			
		}
	}


static boolean prime(int sum)
{
	for(int i=2;i<=sum/2;i++)
	{
		if(sum%i==0)
		{
			return false;
		}
	}
	return true;
}
 }