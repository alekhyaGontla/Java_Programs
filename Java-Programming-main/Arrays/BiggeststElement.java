public class BiggeststElement{
	public static void main(String[] args)
	{
	int b[]= {10,20,30};
	int max=b[0];
	
	for(int j=1;j<=b.length-1;j++) 

		if(b[j]>max)
		{
			max=b[j];
		}
	}
	System.out.println(max);
		
	}
}