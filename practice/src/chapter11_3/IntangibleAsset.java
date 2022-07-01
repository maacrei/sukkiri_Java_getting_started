package chapter11_3;

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
