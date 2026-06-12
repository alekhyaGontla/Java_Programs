class DecimalToBinary
{
	public static void main(String[] args) 
	{
		int number=4456;
		String binaryDigits=decToBinary(number);
		System.out.println(binaryDigits);
	}

	static String decToBinary(int n)
	{
		String binary="";
		while(n>0)
		{
			int rem=n%2;
			binary+=rem;
			n=n/2;
			
		}
		return binary;
	}
	
}