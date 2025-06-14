package assignments;

public class ThisAssignment1 {
	int number;
	public ThisAssignment1(int number)
	{
		this.number=number;
		int rev=0;
		while(number!=0)
		{
		
		int rem=number % 10;
		rev=rev*10+rem;
		number = number/10;
		}
		System.out.println("Reverse = "+rev);
		
		
	}
	
	public ThisAssignment1()
	{
		this(456987);
		System.out.println("Finding reverse of "+number);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAssignment1 obj = new ThisAssignment1();
		

	}

}
