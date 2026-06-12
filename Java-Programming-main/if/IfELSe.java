class IfELSe
{
	public static void main(String[] args)
	{
		int a=10;
		if(a%3==0)
		{
			if(a%5==0)
			{
			System.out.println("Sanju weds geeta");
			}
			else{
				System.out.println("Sanju");
			}
		}
		else if(a%5==0)
		{
			System.out.println("geeta");
		}
		else{
			System.out.println("Breakup");
		}
	}
}