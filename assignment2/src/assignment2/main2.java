package assignment2;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		int answer;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome.Press 1....");
		System.out.println("Enter: ");
		answer = input.nextInt();
		while (answer != -1) {

			{
		// user and admin enter
				BatikCompany2 log = new BatikCompany2();
				log.setCompanyName("DINA BATIK COMPANY");
				log.setAddress("LOT 27,JALAN TEMBIKAI 6");
				log.setPostcode("07000");
				log.setLocation("PANTAI CENANG,LANGKAWI");
				log.setPhoneNumber("0136743110");
				log.setFax("07485678");
				log.setWebsite("www.DinaaBatikCompany.com.my");
				System.out.println("\nCOMPANY INFORMATION");
				System.out.println("Company Name : " + log.getCompanyName());
				System.out.println("Company Address : " + log.getAddress());
				System.out.println("Company PostCode : " + log.getPostcode());
				System.out.println("Company Location : " + log.getLocation());

				System.out.println("Company Contact Number : " + log.getphonenumber());
				System.out.println("Company Fax Number : " + log.getFax());
				System.out.println("Company Website : " + log.getWebsite());
		System.out.println("\nUser");
		product_Specification2 ps= new feedback2();
		product_Specification2 ps2=new promotion2();

	marketing m=new marketing();
	System.out.println("Advertisement ID: "+m.getadvertisement_id());
	System.out.println("Type Advertisement: "+m.gettype());

	System.out.println("Title Advertisement: "+m.gettitle());

	System.out.println("Advertisment Description: "+m.getdescription());
//admin enter
				// b is object for subclass employee
				employee2 b = new employee2();
				System.out.println("\nYour ID: " + b.getempid());
				System.out.println("Your Name: " + b.getName());
				System.out.println("Your Number Phone: " + b.getnumber());
				System.out.println("Position: " + b.getposition());
				System.out.printf("\nYour Total Net Salary:RM %.2f\n", b.Salary());

	}
}


 System.out.println("\nDo you want to continue..\n1 continue\n-1 log out");
 
 answer = input.nextInt();
  
  } }
 

