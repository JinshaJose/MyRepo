package exceptionhandling;

public class ThrowEx {

	public static void main(String[] args) {
		
		int age=17;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else
		{
			//System.out.println("Not eligible for voting");
			throw new NumberFormatException("Not eligible for voting");
		}

	}

}
