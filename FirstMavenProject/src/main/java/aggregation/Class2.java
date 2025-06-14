package aggregation;

public class Class2 {
	String bookname;
	int bookid;
	Class1 ref;//Aggregation process
	public Class2(String bookname,int bookid,Class1 ref)//create reference variable of class 1
	{
		this.bookname=bookname;
		this.bookid=bookid;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.authorname+" "+ref.place);
		System.out.println(bookname+" "+bookid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj=new Class1("Author Name","Place");//Invoke class 1 constructor
		Class2 obj1=new Class2("Book Name",100,obj);//Invoke class 2constructor
		obj1.display();

	}

}
