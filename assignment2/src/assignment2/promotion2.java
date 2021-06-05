package assignment2;

import java.util.Scanner;
// 2.5 use method getPayment by using implements
public class promotion2 extends product_Specification2 implements Payment {
	private double normalprice, discount, PriceAfterDiscount, finalprice;
	private double paymentbycustomer, changes;
	Scanner input = new Scanner(System.in);

	promotion2() {

		System.out.print("Please Enter the normal price:RM ");
		this.normalprice = input.nextDouble();
		System.out.print("Please Enter discount of product(%): ");
		this.discount = input.nextDouble();
		this.PriceAfterDiscount = (this.normalprice * this.discount) / 100;
		this.finalprice = (this.normalprice - this.PriceAfterDiscount);

		printInfo();
		getPayment();
	}

	public void printInfo() { // answer for 2.2 method printInfo

		System.out.println("\nDiscount Statement");
		System.out.printf("Normal Price:RM%.2f%n", normalprice);
		System.out.printf("Discount:RM%.2f%n", discount);
		System.out.printf("Price After Discount:RM%.2f%n", this.PriceAfterDiscount);
		System.out.printf("Final Price:RM%.2f%n", this.finalprice);

	}

	public double getnormalprice() {
		return this.normalprice;
	}

	public double getPriceAfterDiscount() {

		return this.PriceAfterDiscount;
	}

	public double getfinalPrice() {
		return this.finalprice;
	}

	public void getPayment() { // this is answer for 2.5
		System.out.println("\nWelcome To The Dinaa Batik Shop");
		System.out.printf("Your Total price:RM %.2f\n", this.finalprice);
		System.out.println("Enter your payment:RM ");
		this.paymentbycustomer = input.nextDouble();
		this.changes = (this.paymentbycustomer - this.finalprice);
		System.out.printf("Balance:RM %.2f\n", this.changes);

	}
}
