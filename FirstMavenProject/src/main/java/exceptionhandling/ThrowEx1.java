package exceptionhandling;

public class ThrowEx1 {
public static void main(String[] args) throws VotingException {
		
		int age=17;
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else
		{
			//System.out.println("Not eligible for voting");
			throw new VotingException("Not eligible for voting");
		}


}
}
