package MarkTcs;

public class Bag {
	String bag;
	int price;
	String color;
	public String getBag() {
		return bag;
	}
	public void setBag(String bag) {
		this.bag = bag;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Bag(String bag, int price, String color) {
		super();
		this.bag = bag;
		this.price = price;
		this.color = color;
	}
	

}
