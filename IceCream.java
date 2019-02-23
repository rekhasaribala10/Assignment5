package Assignment5;

public class IceCream extends DessertItemClass{

	protected float cost;

	public IceCream (String name,float cost) {
	super(name);
	this.cost = cost;
	}
	
	@Override
	public double getCost() {
		return cost;
	}
	
	@Override
	public String toString()
	{
		String icereamString = "";
		icereamString = icereamString + DessertShoppe.fixedLengthString(super.name, 30);
		icereamString = icereamString + DessertShoppe.centsToDollarsAndCents(getCost());
		return icereamString;
	}

}
