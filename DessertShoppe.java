package Assignment5;

public class DessertShoppe {

	public static String nameOfStore = "       M & M Dessert Shoppe" + System.lineSeparator() + "       -------------------";
	
	public static double taxRate = 0.065;
	
	public static String centsToDollarsAndCents(float cents)
	{
		return String.valueOf(cents/100);
	}
	
	public static String centsToDollarsAndCents(double cents)
	{
		return String.valueOf(cents/100);
	}
	
	public static String fixedLengthString(String string, int maxLength) {
	    return String.format("%1$-"+maxLength+ "s", string);
	}
	
}
