package assignment2;

import java.util.Scanner;
//2.1 inheritance
public class feedback2  extends product_Specification2 {
	private String feedback_name;
	private String feedback_title;
	private String feedback_comment;
	private int feedback_rating;
	
	Scanner input = new Scanner(System.in);

	feedback2() {

		System.out.println("\nPlease Enter Your Name: ");
		this.feedback_name = input.nextLine();
		System.out.println("Please Enter Your Feedback Title:");
		this.feedback_title = input.nextLine();
		System.out.println("Enter Your comment:");
		this.feedback_comment = input.nextLine();
		System.out.println("Enter Your rating:\nRate:1-3");
		this.feedback_rating = input.nextInt();
		rating();
	//2.2 polymorphism
printInfo();
	}


	// method for feedback rating
	public void rating() {
		if (this.feedback_rating == 1) {
			System.out.println("WORST");
			System.out.println("Thank You");
		} else if (this.feedback_rating == 2) {
			System.out.println("moderate");
			System.out.println("Thank You");
		} else if (this.feedback_rating == 3) {
			System.out.println("Excellent");
			System.out.println("Thank You");
		} else
			System.out.println("ERROR");

	}
	

	public String getfeedback_name() {
		return this.feedback_name;
	}

	public String getfeedback_title() {
		return this.feedback_title;
	}

	public String getfeedback_comment() {
		return this.feedback_comment;
	}

	public Integer getfeedback_rating() {
		return this.feedback_rating;
	}
	



	@Override
	public void printInfo() {
		System.out.println("\nFeedback Details");
		System.out.println("Feedback Name: "+this.feedback_name);
		System.out.println("Feedback Title: "+this.feedback_title);
		System.out.println("Feedback Comment: "+this.feedback_comment);
		System.out.println("Feedback rating: "+ this.feedback_rating);
		
	}
}
