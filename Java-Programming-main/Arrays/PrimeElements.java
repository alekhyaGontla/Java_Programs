public class PrimeElements{
	public static void main(String[] args){
	int c[]= {10,20,1,2,3};
	for(int i=0;i<=c.length-1;i++)
	{
		if(prime(c[i])==true)
			System.out.println(c[i]);
	}
		
	}
	
	static boolean prime(int a)
	{
		for(int i=2;i<=a/2;i++) 
		{
			if(a%i==0)
			{
				return false;
			}
		}
	return true;
	}

}