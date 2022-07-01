package chapter11_3;

public abstract class TangibleAsset extends Asset {
//	String name;
//	int price;
	String color;
	public TangibleAsset(String name, int price, String color) {
//		this.name = name;
//		this.price = price;
		super(name, price);
		this.color = color;
	}
//	public String getName() {
//		return this.name;
//	}
//	public int getPrice() {
//		return this.price;
//	}
	public String getColor() {
		return this.color;
	}
}
