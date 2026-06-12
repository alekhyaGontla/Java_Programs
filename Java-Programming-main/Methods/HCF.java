class HCF
{
   public static void main(String[] args) 
	{
		int n=12,m=28,gcd=0;
		for(int i=1;i<=n;i++)
		{
		 if(n%i==0 && m%i==0)
		 {
			 gcd=i;
		 }
		}
		System.out.println(gcd);
	}
}