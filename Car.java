//////
public class Car {
	
	String color;
	int NoofSeat;
	String BrandName;
	
	  Car()
	  {
		  color = null;
		  NoofSeat = 0;
		  BrandName =null;
	  }

	public Car(String color, int noofSeat, String brandName) {
		super();
		this.color = color;
		NoofSeat = noofSeat;
		BrandName = brandName;
	}
	  
	  
	  // setter and getter
	public String getColor()
	{
		return color;
	}
	
	public void SetColor(String color)
	{
		this.color = color;
	}
	
	public int getNoofSeat()
	{
		return NoofSeat;
	}
	
	public void SetNoofSeat(int n)
	{
	    this.NoofSeat = n;	
	}
	
	public String getBrandName()
	{
		return BrandName;
	}
	
	public void SetBrandName(String s)
	{
		this.BrandName = s;
	}
	

}
