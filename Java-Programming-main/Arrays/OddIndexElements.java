public class OddIndexElements 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,8,9,19,00};
		for(int i=0;i<=a.length-1;i++)
		{
		  if(i%2!=0 && a[i]%2==0)
		  {
			  System.out.println(a[i]);
		  }
		}
		
	}

}
