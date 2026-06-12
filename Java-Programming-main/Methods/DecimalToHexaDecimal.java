class DecimalToHexaDecimal
{
	public static void main(String[] args) 
	{
		int number=4456;
		String binaryDigits=decToHexa(number);
		System.out.println(binaryDigits);
	}

	static String decToHexa(int n)
	{
		String binary="";
		while(n>0)
		{
			int rem=n%16;
			binary+=rem;
			n=n/16;
			
		}
		return binary;
	}
	
}