package exceptionhandling;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		//System.out.println("Hai");
		try
		{
			int c=a/b;//Arithmetic Exception
			System.out.println(c);
		}
		/*catch(ArithmeticException x)
		{
			int d=a+b;
			System.out.println(d);
			System.out.println(x);//To know the type of exception
		}*/
		finally
		{
			System.out.println("Execution Completed");
		}

	}

}
