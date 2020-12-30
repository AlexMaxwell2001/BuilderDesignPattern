package cs335_lab_week_04;

public interface CarBuilder 
{
	public void buildBodyStyle();
	public void buildPower();
	public void buildEngine();
	public void buildBreaks();
	public void buildSeats();
	public void buildWindows();
	public void buildFuelType();
	public Car getCar();
}
