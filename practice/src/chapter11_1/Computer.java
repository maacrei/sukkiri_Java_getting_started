package chapter11_1;

public class Computer  extends TangibleAsset {
//	String name;
//	int price;
//	String color;
	String makerName;
	//コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
//	//メソッド
//	public String getName() {
//		return this.name;
//	}
//	public int getPrice() {
//		return this.price;
//	}
//	public String getColor() {
//		return this.color;
//	}
	public String getMakerName() {
		return this.makerName;
	}
}
