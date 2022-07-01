package chapter11_1;

public class Book extends TangibleAsset {
//	String name;
//	int price;
//	String color;
	String isbn;
	//コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
//		this.name = name;
//		this.price = price;
//		this.color = color;
		this.isbn = isbn;
	}
	//メソッド
//	public String getName() {
//		return this.name;
//	}
//	public int getPrice() {
//		return this.price;
//	}
//	public String getColor() {
//		return this.color;
//	}
	public String getIsbn() {
		return this.isbn;
	}
}
