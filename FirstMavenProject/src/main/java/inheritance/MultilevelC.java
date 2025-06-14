package inheritance;

public class MultilevelC extends MultilevelB {
	
	public void newmethod()
	{
		System.out.println("Multilevel child");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelC obj = new MultilevelC();
		obj.display();
		obj.print();
		obj.newmethod();

	}

}
