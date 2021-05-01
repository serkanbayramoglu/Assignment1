package supporting;

import java.util.InputMismatchException;
import java.util.Scanner;
import application.LockedMe;

public class AllScreens {

	String passcode;
	static String p1 = new String("./myFiles");
	
	public static void initiate(String passcode) {
		
		if (passcode.equals("passcode")) {
			mainScreen();
		} else {
			LockedMe.exit();
		}
	}


	static void mainScreen() {
		
		try {
		ScreenMessages.mainMenu();
		Scanner scanner = new Scanner(System.in);
		int selectedInput = -1;
		selectedInput = scanner.nextInt();
		
			switch (selectedInput) {
			
			case 0:
				LockedMe.exit();
				break;
				
			case 1:
				String [] fileNames = CurrentFiles.listFileNames(p1);
				for (String i :  fileNames) {
					System.out.println(i);
				}
				mainScreen();
				break;
				
			case 2:
				subScreen();
				break;	
				
			default:
				ScreenMessages.selectionError();
				mainScreen();
				break;
			}
		
		} catch (InputMismatchException e) {
			ScreenMessages.selectionError();
			mainScreen();
		}
}
	
	static void subScreen() {

		ScreenMessages.subMenu1();
		
		try {
			Scanner scanner = new Scanner(System.in);
			int selectedInput = -1;
			selectedInput = scanner.nextInt();
			
			switch (selectedInput) {
			
			case 0:
				LockedMe.exit();
				break;
				
			case 1:
				addFileScreen();
				subScreen();
				break;
				
			case 2:
				searchScreen();	
				break;		
			
			case 3:
				deleteFileScreen();
				break;	
	
			case 4:
				mainScreen();
				break;	
				
			default:
				ScreenMessages.selectionError();
				subScreen();
				break;
			}	

		} catch (Exception e) {
			ScreenMessages.selectionError();
			subScreen();
		}
	}
	
	static void searchScreen() {
			
		Scanner scanner = new Scanner(System.in);
		ScreenMessages.searchFile();
		String fileName = scanner.next();
		
		switch (fileName) {
			case "0":
				LockedMe.exit();
				break;
			
			case "1":
				subScreen();
				break;
				
			case "2":
				mainScreen();
				break;
				
			default:
				if (CurrentFiles.search(p1, fileName)) {
					ScreenMessages.searchFileExists(fileName);
				} else {
					ScreenMessages.searchFileNotExist(fileName);
				}
				
				subScreen();
				break;
		}
		
		
	}
	
	static void deleteFileScreen() {
		
		Scanner scanner = new Scanner(System.in);
		ScreenMessages.deleteFile();
		String fileName = scanner.next();
		
		switch (fileName) {
			case "0":
				LockedMe.exit();
				break;
			
			case "1":
				subScreen();
				break;
				
			case "2":
				mainScreen();
				break;
				
			default:
				CurrentFiles.deleteFile(p1, fileName);
				subScreen();
				break;
		}
	}
	
	static void addFileScreen () {
		
		Scanner scanner = new Scanner(System.in);
		String newFileName = null;
		ScreenMessages.createNewFile();
		newFileName = scanner.next();

		
		switch (newFileName) {
		case "0":
			LockedMe.exit();
			break;
		
		case "1":
			subScreen();
			break;
			
		case "2":
			mainScreen();
			break;
			
		default:
			NewFile.creatNew(p1, newFileName);
			break;
		}

	} 
	
}