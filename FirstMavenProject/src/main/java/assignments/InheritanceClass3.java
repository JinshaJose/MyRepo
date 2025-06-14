package assignments;

public class InheritanceClass3 extends InheritanceClass2 {
	
	public void total()
	{
		double totalSalary=basicPay+hra-pf-deduction+bonus;
		System.out.println("Total salary by hand = "+totalSalary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceClass3 obj = new InheritanceClass3();
		obj.get();
		obj.calculate();
		obj.total();
		
		
		
		
		
		

	}

}
