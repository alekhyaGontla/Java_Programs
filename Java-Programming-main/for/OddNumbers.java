class OddNumbers
{
	public static void main(String[] args)
	{
		for(int i=1;i<=50;i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------Sum---------------------------------------");
        int sum=0;
		for(int i=1;i<=50;i+=2)
		{
			
			if(i%2!=0)
			{
				sum=sum+i;
				
			}	
		}
		System.out.println(sum);
	}
}