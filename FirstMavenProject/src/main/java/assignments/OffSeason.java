package assignments;

public class OffSeason extends OnSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffSeason ob = new OffSeason();
		ob.discount();
	}
	public void discount()
	
	{
		super.discount();
		int amt=1000;
		int discount=(1000*15)/100;
		System.out.println("Offseason discount = "+discount);
		
	}


}
