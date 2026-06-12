class FIbonacciSeries
{
	public static void main(String[] args) 
	{
		int n=10,f1=0,f2=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=f1+f2;
			System.out.println(f1+" ");
			f1=f2;
			f2=sum;
		}
		
	}
}



