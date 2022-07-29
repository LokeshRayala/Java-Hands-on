package virtualkey;

public class Menu {
	
	public static void display() {
		String greet = String.format("*********************  Welcome  *********************\n");
		String desc = "This Virtual Key Repository application is used to :- \n"
				+ "\n Retrieve all file names in the folder\n"
				+ "\n Add, delete and search files in the folder.\n";
		System.out.println(greet);
		System.out.println("\n");
		System.out.println(desc);
	}

	public static void displayMenu() {
		String menu = "\n Select any option from below \n"
				+ "1) Retrieve all files in current folder\n" + "2) Display menu for Business level operations\n"
				+ "3) Exit program \n";
		System.out.println(menu);

	}

	public static void displayFileMenu() {
		String fileMenu = "\n\n Select any option from below \n\n"
				+ "1) Add a file to folder\n" + "2) Delete a file from folder\n"
				+ "3) Search for a file and print its contents from folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}
	
}
