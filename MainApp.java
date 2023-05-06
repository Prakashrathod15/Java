
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // create object of car
		         Car c1 = new Car();
		         
		         Car c2 = new Car("Pankaj",02,"TCS");
		         
		        // System.out.println(c1.getBrandName());
		         
		         System.out.println(c2.getColor());
		         System.out.println(c2.getNoofSeat());
		         System.out.println(c2.getBrandName());
		         
		         c1.SetColor("Orange");
		         c1.SetNoofSeat(1);
		         c1.SetBrandName("Microsoft");
		         
		         System.out.println(c1.getColor());
		         System.out.println(c1.getNoofSeat());
		         System.out.println(c1.getBrandName());

	}

}
