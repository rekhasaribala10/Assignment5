package Assignment5;

public abstract class DessertItemClass {
	
	protected String name;
	
	
	public DessertItemClass(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	protected abstract double getCost();

}
