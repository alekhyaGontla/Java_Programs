class ArrayElementSum
{
	public static void main(String[] args)
	{
		int sum=0;
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=15;
		a[3]=5;
		for(int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}