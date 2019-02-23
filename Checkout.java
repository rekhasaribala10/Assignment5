package Assignment5;

import java.util.ArrayList;

public class Checkout {

	ArrayList<DessertItemClass> myList = new ArrayList<>();
	
	public Checkout()
	{
		
	}
	
	public int numberOfItems()
	{
		int size = myList.size();
		return size;
	}
	
	public void enterItem(DessertItemClass item)
	{
		myList.add(item);			
	}
	
	public void clear()
	{
		myList.clear();
	}
	
	public int totalCost()
	{
		double cost = 0;
		for(DessertItemClass dessertItem : myList)
		{
			cost = cost + dessertItem.getCost();
		}
		return (int)cost;
	}
	
	public int totalTax()
	{
		 return (int) ((int) totalCost() * DessertShoppe.taxRate);	
	}
	
	@Override
	public String toString()
	{
		String x =DessertShoppe.nameOfStore + System.lineSeparator();
		
		for(DessertItemClass dessertItem : myList)
		{
			x = x + dessertItem.toString() + System.lineSeparator();
		}
		
		x = x + System.lineSeparator();
		x = x + DessertShoppe.fixedLengthString("Tax",30)+ DessertShoppe.centsToDollarsAndCents(totalTax());
		x = x + System.lineSeparator();
		x = x + DessertShoppe.fixedLengthString("Total Cost",30) + DessertShoppe.centsToDollarsAndCents(totalTax() + totalCost());
		return x;
	
		
	}
}
