package encapsulation;

public class Encapsulation {

	private String name;
	private int age;
	public void setdetails(String name, int age)//setter method
	{
		this.name=name;
		this.age=age;
	}
	public void getdetails()//getter method
	{
		System.out.println(name+" "+age);
	}
}
