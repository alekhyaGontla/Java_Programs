class PrintingLeapYears
{
	public static void main(String[] args)
	{
		for(int i=2000;i<=3000;i++)
		{
			if(i%4==0 && i%100!=0|| i%400==0)
			{
				System.out.println(i);
			}
		}
		
		
	}
}