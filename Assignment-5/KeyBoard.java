public class KeyBoard {
	String brand;
	String color;
	int price;
	String layOut;
	int keySize;
	String shape;
	String light;
	String version;
	int weight;
	int numKeys;
	
	public KeyBoard(String brand, String color, int price, String layOut, int keySize, String shape, String light,
			String version, int weight, int numKeys) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.layOut = layOut;
		this.keySize = keySize;
		this.shape = shape;
		this.light = light;
		this.version = version;
		this.weight = weight;
		this.numKeys = numKeys;
	}
	void light() {
		System.out.println(brand+" keyboard has the lighting as "+light);
	}
	void numKeys() {
		System.out.println(brand+" keyboard has the total number of keys is "+numKeys);
	}
	void connection() {
		System.out.println(brand+" keyboard is connected with USB connection");
	}
	
}
