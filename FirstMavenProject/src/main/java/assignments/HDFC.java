package assignments;

public class HDFC implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj=new HDFC();
		obj.recurringDeposit(5000,1);
		}

	@Override
	public void recurringDeposit(int p,int t) {
	int n=4;
	double a=p*Math.pow(1 + r/n,n*t);
	System.out.println(a);
	
	
		
	}

}
