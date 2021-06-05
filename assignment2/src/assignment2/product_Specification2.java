package assignment2;

import java.util.Scanner;
//Abstraction 2.2
public abstract class product_Specification2 {
	private String product_name;
	private String Description;
	private String material;
	private String color;
	private double price;
	private String day;
	private int month;
	private int year;

	Scanner input = new Scanner(System.in);

	product_Specification2() {
		System.out.println("\nEnter The Product Name: ");
		this.product_name = input.nextLine();
		System.out.println("Enter The Description: ");
		this.Description = input.nextLine();
		System.out.println("Enter The material: ");
		this.material = input.nextLine();
		System.out.println("Enter The Color");
		this.material = input.nextLine();
		System.out.println("Enter The Price:RM ");
		this.price = input.nextDouble();
		
	}

	// to answer question 1.4 Constructor for using constructor with three-arguments
	product_Specification2(String day, int month, int year) {
		System.out.println("Enter The Day: ");
		this.day = input.nextLine();
		System.out.println("Enter the Month: ");
		this.month = input.nextInt();
		System.out.println("Enter the Year: ");
		this.year = input.nextInt();
		
		
	
	}

	public void printInfo(String day,int month,int year)

 {						
		
		System.out.println("Product Specification Details");
		System.out.println("Product: "+this.product_name );
		System.out.println("Product Description: " + this.Description);
		System.out.printf("Price:RM %.2f " , this.price);
	}
	
	public abstract void printInfo();		//answer for 2.4 Abstract method

	public String getproduct_name() {
		return this.product_name;
	}

	public String getDescription() {
		return this.Description;
	}

	public String getmaterial() {
		return this.material;
	}

	public String getcolor() {
		return this.color;
	}

	public double getprice() {
		return this.price;
	}

	public String getday() {
		return this.day;
	}

	public Integer getmonth() {
		return this.month;

	}

	public Integer getyear() {
		return this.year;
	}
}


