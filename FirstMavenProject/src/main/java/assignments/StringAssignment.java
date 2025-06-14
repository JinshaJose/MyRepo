package assignments;

public class StringAssignment {
	public void check(String str)
	{
		String a=str.toUpperCase();
		int left=0;
		int right=a.length()-1;
		while(left<right)
		{
			if(a.charAt(left)!=a.charAt(right))
			{
				System.out.println(a+" is not a Palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println(a+" is Palindrome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAssignment obj = new StringAssignment();
		obj.check("Java");
		obj.check("Malayalam");
}
}


