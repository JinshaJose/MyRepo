package assignments;

public class EmployeeChildClass extends Employee {

	public static void main(String[] args) {
		EmployeeChildClass obj=new EmployeeChildClass();
		obj.calculateSalary();

	}

	@Override
	public void calculateSalary() {
		
		int p=100;//Payment Per Hour
		int h=7;//Working Hours
		int salary=p*h;
		int s=8*p;
		System.out.println("Salary : "+salary);
		System.out.println("Salary of Full Time Employee : "+s);
		}

}
