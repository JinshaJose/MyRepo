package interfacepackage;

public class InterfaceEx1 implements InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx1 obj = new InterfaceEx1();
		obj.display();
		obj.print();

	}
	public void print()
	{
		System.out.println("Hello");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface Example");
		
	}

}
