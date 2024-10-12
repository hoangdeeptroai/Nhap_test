package ngay2;

import java.util.Scanner;

public class Products {
	private String name;
	private double price;
	private double tax;

	Scanner scan = new Scanner(System.in);

	public Products() {

	}

	public Products(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public void nhapThongTin() {
		this.name = scan.next();
		this.price = scan.nextDouble();
		this.tax = scan.nextDouble();
	}

	public void xuatThongTin() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.tax);
	}

	public double getTaxPrice() {
		return this.price * this.tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
