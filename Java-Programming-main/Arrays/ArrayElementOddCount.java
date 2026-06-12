class ArrayElementOddCount
{
	public static void main(String[] args)
	{
		
		int c=0;
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=15;
		a[3]=5;
		for(int i=a.length-1;i>=0;i--)
		{
			if(i%2!=0)
			{
				c=c+1;
				
			}
		}
			System.out.println(c);
	}
}