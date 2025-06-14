package assignments;

public class InheritanceClass2 extends InheritanceClass1 {
	double hra;
	double pf;
	
	public void calculate()
	{
		
		hra = (basicPay*5)/100;
		pf = (basicPay*20)/100;

		System.out.println("HRA = "+hra);
		System.out.println("PF = "+pf);
		
	}

}
