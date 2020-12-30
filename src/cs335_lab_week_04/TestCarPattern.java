package cs335_lab_week_04;

public class TestCarPattern {

	public static void main(String[] args) 
	{
		CarBuilder carBuilder1 = new SedanCarBuilder();
		CarDirector director1 = new CarDirector(carBuilder1);
		director1.build();
		Car car1 = carBuilder1.getCar();
		CarBuilder carBuilder2 = new SportCarBuilder();
		CarDirector director2 = new CarDirector(carBuilder2);
		director2.build();
		Car car2 = carBuilder2.getCar();
		System.out.println(car1);
		System.out.println(car2);
		
	}
	
	
	
	
	
	/*
	public static Car sedan()
	{
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		return car;
	}
	public static Car sports()
	{
		CarBuilder carBuilder = new SportCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		return car;
	}*/
}

