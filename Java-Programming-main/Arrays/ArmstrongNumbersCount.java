public class ArmstrongNumbersCount 
{
	public static void main(String[] args)
	{
		int a[]= {10,1,153,123},c=0;
		for(int i=0;i<=a.length-1;i++) 
		{
			if(armstrongNumber(a[i])) 
			{
				c++;
			}
		}
		System.out.println(c);
	}
	static boolean armstrongNumber(int a) 
		{
			int temp=a,temp2=a,sum=0,c=0;
			while(a>0) 
			{
				a=a/10;
				c++;
			}
			while(temp>0)
			{
				int rem=temp%10;
				sum=sum+power(rem,c);
				temp=temp/10;
			}
			return sum==temp2;
	   }
		
	static int power(int rem,int c) 
	{
			int p=1;
			for(int i=0;i<c;i++)
			{
				p*=rem;
			}
			return p;
	}		
}