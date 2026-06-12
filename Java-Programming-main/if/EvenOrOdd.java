class EvenOrOdd
{
	public static void main(String[] args)
	{
		int a=9009;
		if(a%2==0)
		{
			System.out.println("even");	 
		}
		else
		{
			System.out.println("Odd");
		}
		if(a/2*2==a)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("Odd");
		}
		switch(a%2)
		{
			case 0:System.out.println("even");
			break;
			default:System.out.println("Odd");
		}
		
	}
}