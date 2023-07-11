import java.util.Scanner;
public class KeyBoardApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter brand of the keyboard");
		String brand=scan.next();
		System.out.println("Enter color of the keyboard");
		String color=scan.next();
		System.out.println("Enter price of the keyboard");
		int price=scan.nextInt();
		System.out.println("Enter layout of the keyboard");
		String layOut=scan.next();
		System.out.println("Enter keysize of the keyboard");
		int keySize=scan.nextInt();
		System.out.println("Enter shape of the keyboard");
		String shape=scan.next();
		System.out.println("Enter light color of the keyboard");
		String light=scan.next();
		System.out.println("Enter version of the keyboard");
		String version=scan.next();
		System.out.println("Enter weight of the keyboard");
		int weight=scan.nextInt();
		System.out.println("Enter total no.of keys in the keyboard");
		int numKeys=scan.nextInt();
		KeyBoard k =new KeyBoard(brand, color, price, layOut, keySize, shape, light, version, weight, numKeys);
		System.out.println(k.brand+" "+k.color+" "+k.price+" "+k.layOut+" "+k.keySize+" "+k.shape+" "+k.light+" "+k.version+" "+k.weight+" "+k.numKeys);
		k.light();
		k.numKeys();
		k.connection();
	}
}
