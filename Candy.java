package Assignment5;

public class Candy extends DessertItemClass{

	private double weight;
	private float pricePerPound;

	public Candy(String name,double weight,float pricePerPound) {
		super(name);
		this.weight= weight;
		this.pricePerPound= pricePerPound;
	}
	
	@Override
	public double getCost() {
		return weight * pricePerPound;
	}
	
	@Override
	public String toString()
	{
		String candyString = "";
		candyString = candyString + weight + " " + "lbs. " +  "@" + DessertShoppe.centsToDollarsAndCents(pricePerPound) + "/lb.";
		candyString = candyString + System.lineSeparator();
		candyString = candyString + DessertShoppe.fixedLengthString(super.name, 30);
		candyString = candyString +  DessertShoppe.centsToDollarsAndCents(getCost());
		return candyString;
	}

}
