package abstractpackage;

public class AbstractExChild extends AbstractEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExChild obj=new AbstractExChild();
		obj.display();
		obj.display1();

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
		
	}

}
