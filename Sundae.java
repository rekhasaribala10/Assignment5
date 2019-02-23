package Assignment5;

public class Sundae extends IceCream {

	float costOfTopping;
	String nameOfTopping;
	
	public Sundae(String name,float costOfTopping,String nameOfTopping, float cost) {
		super(name,cost);
		this.costOfTopping= costOfTopping;
		this.nameOfTopping=nameOfTopping;
	}
	
	@Override
	public double getCost() {
		return super.getCost() +costOfTopping;
	}

	@Override
	public String toString()
	{
		String icereamString = "";
		icereamString = icereamString + nameOfTopping + " With ";
		icereamString = icereamString + System.lineSeparator();
		icereamString = icereamString + DessertShoppe.fixedLengthString(super.name , 30);
		icereamString = icereamString + DessertShoppe.centsToDollarsAndCents(getCost());
		return icereamString;
	}
	
	
}
