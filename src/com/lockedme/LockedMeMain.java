package com.lockedme;
public class LockedMeMain {
public static void main(String[] args) {
	FileOperations.createMainFolderIfNotPresent("main");
	
	MenuOptions.printWelcomeScreen();
	
	HandleOptions.handleWelcomeScreenInput();

}
}
