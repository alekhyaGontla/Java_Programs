class Leapyear
{
	public static void main(String[] args)
	{
		int y=1300;
		if(y%4==0&&y%100!=0||y%400==0)
		{
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not leap year");
		}
	}
}