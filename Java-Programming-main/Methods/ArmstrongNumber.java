class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		int number=153;
		String sno=""+number;
		int count=sno.length();
		boolean armstrongNumber=armstrongNumber(number,count);
		System.out.println("Armstrong Number: "+armstrongNumber);
	}

	static boolean armstrongNumber(int n,int count)
	{
		int sum=0,temp=n;
		while(n>0)
		{
			int rem=n%10;
			sum+=(int)Math.pow(rem,count);
			n=n/10;
		}
		return sum==temp;
	}
}