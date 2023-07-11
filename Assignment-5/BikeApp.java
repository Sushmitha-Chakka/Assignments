import java.util.Scanner;
public class BikeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter brand of the bike");
		String brand=scan.next();
		System.out.println("Enter type of the bike");
		String type=scan.next();
		System.out.println("Enter color of the bike");
		String color=scan.next();
		System.out.println("Enter price of the bike");
		int price=scan.nextInt();
		System.out.println("Enter no.of wheels of the bike");
		int wheels=scan.nextInt();
		System.out.println("Enter length of the bike");
		double length=scan.nextDouble();
		System.out.println("Enter heigth of the bike");
		double heigth=scan.nextDouble();
		System.out.println("Enter gear of the bike");
		int gear=scan.nextInt();
		System.out.println("Enter speed of the bike");
		int speed=scan.nextInt();
		System.out.println("Enter fuel used in bike");
		String fuel=scan.next();
		System.out.println("Enter milage of the bike");
		int milage=scan.nextInt();
		Bike b= new Bike(brand, type, color, price, wheels, length, heigth, gear, speed, fuel, milage);
		System.out.println(b.brand+" "+b.type+" "+b.color+" "+b.price+" "+b.wheels+" "+b.length+" "+b.height+" "+b.gear+" "+b.speed+" "+b.fuel+" "+b.milage);
		b.ride();
		b.accelerate();
		b.parkInfo();
		
	}
}
