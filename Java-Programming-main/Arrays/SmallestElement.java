public class SmallestElement{
	public static void main(String[] args)
	{
	int b[]= {10,20,30};
	int min=b[0];
	
	for(int j=1;j<=b.length-1;j++) 
	{
		if(b[j]<min)
		{
			min=b[j];
		}
	}
	System.out.println(min);
		
	}
}