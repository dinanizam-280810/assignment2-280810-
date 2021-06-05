package assignment2;

public class marketing {
	private String advertisement_id;
	private String type, title, description;

	marketing() {

		System.out.println("Advertisement ID: " + getadvertisement_id());

		printpromotion();
	}

	public void printpromotion() {

		System.out.println("\nAdvertisement Type: Newspaper");
		System.out.println("Advertisement Title: Popularising batik");
		System.out.println(
				"Advertisement Description: WE do not have to wait for Visit Malaysia Year 2020 to promote local batik, \nnor wait for Thursdays, or for some formal occasions. "
						+ "\nOr wait for our wakil rakyat to adorn it in Parliament, \nperhaps make a drab debate more colourful.");
	}

	public String getadvertisement_id() {
		return this.advertisement_id;
	}

	public String gettype() {
		return this.type;
	}

	public String gettitle() {
		return this.title;
	}

	public String getdescription() {
		return this.description;

	}
}
