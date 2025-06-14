package assignments;

public class Assignment2 {
	
	public void average(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("Average of 3 integer numbers = "+avg);
	}
	public void average(float a,float b,float c)
	{
		float avg=(a+b+c)/3;
		System.out.println("Average of 3 float numbers = "+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 obj = new Assignment2();
		obj.average(10, 20, 30);
		obj.average(10.5f, 20, 20.5f);
	}

}
