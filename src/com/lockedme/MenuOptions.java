package com.lockedme;
public class MenuOptions {
	public static void printWelcomeScreen() {
		String companyDetails = String.format("*************************************************************************\n"
				+ "** Welcome to LockedMe.com - An application developed by Atharv Chavan **\n"
				+ "*************************************************************************\n");
		System.out.println(companyDetails);

		System.out.println("Purpose and usage of the Application:-\n"
				+ "• Retrieve all file names in the \"main\" folder\n"
				+ "• Search, add or delete files in \"main\" folder\n"
				+ "\nNote: Please be careful and ensure that correct filename is provided for searching or deleting files**\n");
	}

	public static void displayMenu() {
		String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}
}
