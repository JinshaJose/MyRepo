package assignments;

public class UserClass {
	private int pin1;
	private int pin2;
	private int pin3;
	
	public void setdetails(int pin1,int pin2,int pin3)
	{
		this.pin1=pin1;
		this.pin2=pin2;
		this.pin3=pin3;
	}
	public void getdetails()
	{
		System.out.println(pin1+" "+pin2+" "+pin3);
	}
}



