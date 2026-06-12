class MostRepeatedElement
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,10,30,89,89,89,89,9,99},max=0,e=0;//[10,20,10,30]
		boolean b[]=new boolean[a.length];//[fasle,false,false,false]
		for(int i=0;i<=a.length-1;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<=a.length-1;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1 && count>max)
				{
					max=count;
					e=a[i];
				}
					
			}
				
		}
		System.out.println(e);
	}
	
	
}