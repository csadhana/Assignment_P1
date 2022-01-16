package com.sl.projectassessment;

public class MainLockedMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperations.createMainFolderIfNotPresent("main");
		Menu.WelcomeScreen("Locker","sadhana");
		OptionHandle.handleWelcomeScreenInput();
		

	}

}
