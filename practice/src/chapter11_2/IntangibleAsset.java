package chapter11_2;

public abstract class IntangibleAsset extends Asset {
	String patent;
	public IntangibleAsset(String name, int price, String patent) {
		super(name, price);
		this.patent = patent;
	}
	public String patent() {
		return this.patent;
	}
}
