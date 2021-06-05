// extend by employees class
package assignment2;

import java.util.Scanner;

public class finance2{
	private double Totalrevenue, CostOfGoodSolds;
	private double QuantitySold, pricetake;
	private double ProfitMargin, PercentageLoss;
	
	Scanner input = new Scanner(System.in);

	finance2() {

		//total revenue per month
				System.out.println("\n\nReminder enter revenue per month");
				System.out.println("Enter the Quantity Sold: ");
				this.QuantitySold = input.nextDouble();                      //2.3 encapsulation
				System.out.println("Enter the Pricetake: ");
				this.pricetake = input.nextDouble();

				this.Totalrevenue = this.QuantitySold * this.pricetake;
				System.out.println("Enter the Cost Of Good Solds: ");
				this.CostOfGoodSolds = input.nextDouble();
		//to calculate the profit margin for month
				this.PercentageLoss = ((this.Totalrevenue - this.CostOfGoodSolds) / this.Totalrevenue) * 100;

		//to calculate the percentage loss
				this.ProfitMargin = ((this.Totalrevenue - this.CostOfGoodSolds) / this.CostOfGoodSolds) * 100;

			}

	public void printInfo() {

		System.out.println("Finance Details");
		System.out.printf("Profit Margin: %.2f\n", this.PercentageLoss);
		System.out.printf("Percentage Loss: \n",this.ProfitMargin);
		
	}

	public Double getTotalrevenue() {
		return this.Totalrevenue;
	}

	public Double getQuantitySold() {
		return this.QuantitySold;
	}

	public Double getpricetake() {
		return this.pricetake;
	}

	public Double getCostofGoodSolds() {
		return this.CostOfGoodSolds;
	}

	public Double getProfitMargin() {
		return this.ProfitMargin;
	}

	public Double getPercentageLoss() {
		return this.PercentageLoss;
	}


}
