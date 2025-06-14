package customeexception;

import exceptionhandling.VotingException;

public class ExceptionExample {

	public static void main(String[] args) throws VotingExceptionEX 
	{
		int age=10;
		if(age>=18)
		{
			System.out.println("eligible");
		}
		else
		{
throw new VotingExceptionEX("Not eligible");
	}
	}
}
