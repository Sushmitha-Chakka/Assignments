public class Bike {
	String brand;
	String type;
	String color;
	int price;
	int wheels;
	double length;
	double height;
	int gear;
	int speed;
	String fuel;
	int milage;
	public Bike(String brand, String type, String color, int price, int wheels, double length, double height, int gear,
			int speed, String fuel, int milage) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
		this.wheels = wheels;
		this.length = length;
		this.height = height;
		this.gear = gear;
		this.speed = speed;
		this.fuel = fuel;
		this.milage = milage;
	}
	void ride() {
		System.out.println(type+" bike is used for trips");
	}
	void accelerate() {
		System.out.println(type+" bike is moving with a speed of "+speed+"kmph");
	}
	void parkInfo() {
		System.out.println("Display the information for parking the bikes");
	}
}