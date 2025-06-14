package interfacepackage;

public class MultipleInheritanceChildClass implements MultipleInheritanceInterface,MultipleInheritanceInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceChildClass obj=new MultipleInheritanceChildClass();
		obj.display();
		obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Multiple Inheritance");
		
	}

}
