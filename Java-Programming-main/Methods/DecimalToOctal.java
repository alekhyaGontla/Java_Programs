class DecimalToOctal
{
	public static void main(String[] args) 
	{
		int number=4456;
		String OctalDigits=decToOctal(number);
		System.out.println(OctalDigits);
	}

	static String decToOctal(int n)
	{
		String binary="";
		while(n>0)
		{
			int rem=n%8;
			binary+=rem;
			n=n/8;
			
		}
		return binary;
	}
	
}