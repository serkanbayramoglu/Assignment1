package application;

import supporting.AllScreens;

public class LockedMe {


	public static void main(String[] args) {
		
		boolean firstRun = true;		

		if (firstRun ==  true) {
			ScreenMessagesApp.displayWelcome();
			firstRun = false;
		}
		
		AllScreens.initiate("passcode");		
	}

	public static void exit() {
		ScreenMessagesApp.displayExit();		
		System.exit(0);
	}

}
