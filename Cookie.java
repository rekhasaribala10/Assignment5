package Assignment5;

public class Cookie extends DessertItemClass {
	 int numberOfCookies;
	 float pricePerDozen;
	 
	
	public Cookie(String name, int numberOfCookies,float pricePerDozen) {
		super(name);
		this.numberOfCookies=numberOfCookies;
		this.pricePerDozen= pricePerDozen;
	}

	@Override
	public double getCost() {
		return numberOfCookies * (pricePerDozen/12);
	}
	
	@Override
	public String toString()
	{
		String cookieString = "";
		cookieString = cookieString + numberOfCookies + "@" + DessertShoppe.centsToDollarsAndCents(pricePerDozen) + "/dz.";
		cookieString = cookieString + System.lineSeparator();
		cookieString = cookieString + DessertShoppe.fixedLengthString(super.name, 30);
		cookieString = cookieString +  DessertShoppe.centsToDollarsAndCents(getCost());
		return cookieString;	
	}

}
