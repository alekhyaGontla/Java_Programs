class BinaryToDecimal
{
	public static void main(String[] args) 
	{
		int number=001;
		int decimal=binaryToDecimal(number);
		System.out.println(decimal);
	}

	static int binaryToDecimal(int n)
	{
		int decimal=0,p=0;
		while(n>0)
		{
			int rem=n%10;
			decimal+=rem*(int)Math.pow(2,p);
			n=n/10;
			p++;
		}
		return decimal;
	}
	
}