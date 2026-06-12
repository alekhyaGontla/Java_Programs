public class FIndElement {
	public static void main(String[] args) {
//	int a[]= {10,20,30},e=10;
//	for(int i=0;i<=a.length-1;i++) {
//		if(a[i]==e)
//		{
//			System.out.println(i);
//			break;	
//		}
//		else if(i==a.length-1 && a[i]!=e){
//			System.out.println("Not");
//			
//		}

		int a[]= {10,20,30};
		int e=10;
		int b=linearSearch(e,a);
		
		if(b!=-1) {
			System.out.println(b+"th index");
		}
		else {
			System.out.println("Not found");
		}
	}


	static int linearSearch(int e,int a[])
{
	for(int i=0;i<=a.length-1;i++) {
		if(e==a[i]) {
			return i;
		}
	}
	return -1;
	}
}
