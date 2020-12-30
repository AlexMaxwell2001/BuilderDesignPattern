package cs335_lab_week_04;

public class SportCarBuilder implements CarBuilder{
	
	private final Car car = new Car("SPORTS");
	
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 150.0, " +
				"overall width (inches): 56.2, overall height (inches): 50.7, wheelbase (inches): 130.9," +
				" front track (inches): 45.3, rear track (inches): 45.5 and curb to curb turning circle (feet): 12.5");
	}
	
	@Override
	public void buildPower(){
		car.setPower("400 hp @ 20,500 rpm; 253 ft lb of torque @ 70 000 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("10.0L Duramax V 6 DOHC");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
	}

	@Override
	public void buildSeats() {
		car.setSeats("two front seats");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Laminated side windows.Fixed rear window with defroster, tinted black.");
		
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 31 MPG city, 50 MPG highway, 40 MPG combined and 1.2k mi. range");
		
	}
	
	@Override
	public Car getCar()
	{
		return car;
	}
	
}
