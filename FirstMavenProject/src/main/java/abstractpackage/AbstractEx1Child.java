package abstractpackage;

public class AbstractEx1Child extends AbstractEx1 {

	public static void main(String[] args) {
		AbstractEx1Child obj = new AbstractEx1Child();
		obj.display();
		obj.display1();
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
		
	}

}
