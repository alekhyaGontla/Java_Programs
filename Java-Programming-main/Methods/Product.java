class Product
{
	public static void main(String[] args) 
	{
		int number=4456;
		int product=product(number);
		System.out.println(product);
	}

	static int product(int n)
	{
		int product=1,rem=0;
		while(n>0)
		{
			rem=n%10;
			product*=rem;
			n=n/10;
		}
		return product;
	}
}