package supporting;

public class ScreenMessages {

	static void mainMenu() {
		
	System.out.println("*******************************************************************************");
	System.out.println("*                   Please Select From the Below Options (0 - 2)              *");
	System.out.println("*******************************************************************************");
	System.out.println("                           0) Exit application");
	System.out.println("                           1) Current file names");
	System.out.println("                           2) Other options");
	}

	static void subMenu1() {
	System.out.println("*******************************************************************************");
	System.out.println("*                   Please Select From the Below Options (0 - 4)              *");
	System.out.println("*******************************************************************************");
	System.out.println("                           0) Exit application");
	System.out.println("                           1) Add file");
	System.out.println("                           2) Search file");
	System.out.println("                           3) Delete file");
	System.out.println("                           1) Previous Menu");
	}
	
	static void createNewFile() {
	System.out.println("*******************************************************************************");
	System.out.println("*                   Please enter new file name, or enter (0 - 2)              *");
	System.out.println("*******************************************************************************");
	System.out.println("                           0) Exit application");
	System.out.println("                           1) Previous Menu");
	System.out.println("                           2) Main Menu");
	}
	

	static void newFileExists(String name) {
	System.out.println("*******************************************************************************");	
	System.out.println("              A file under the name " + name + " exists.");  
	System.out.println("*             Please Select From the Below Options (Enter 1 - 2)              *");
	System.out.println("*******************************************************************************");	
	System.out.println("                           1) Replace the file");
	System.out.println("                           2) Enter a new file name"); 
	}
	
	static void fileCreated(String name) {
	System.out.println("*******************************************************************************");	
	System.out.println("              The new file " + name + " is created in the folder.    ");  
	System.out.println("*******************************************************************************");	 
	}
	
	static void searchFileExists(String name) {
	System.out.println("*******************************************************************************");	
	System.out.println("           A file under the name " + name + " exists under the folder         ");  
	System.out.println("*******************************************************************************");	 
	}

	static void searchFileNotExist(String name) {
	System.out.println("*******************************************************************************");	
	System.out.println("      A file under the name " + name + " does not exist under the folder      ");  
	System.out.println("*******************************************************************************");	 
	}
	
	static void searchFile() {	
	System.out.println("*******************************************************************************");
	System.out.println("*            Please enter the file name to Search, or enter (0 - 2)           *");
	System.out.println("*******************************************************************************");
	System.out.println("                           0) Exit application");
	System.out.println("                           1) Previous Menu");
	System.out.println("                           2) Main Menu");
	}
	
	static void deleteFile() {
	System.out.println("*******************************************************************************");
	System.out.println("*             Please enter file name to delete in name.ext format             *");
	System.out.println("*                             or enter (0 - 2)                                *");
	System.out.println("*******************************************************************************");
	System.out.println("                           0) Exit application");
	System.out.println("                           1) Previous Menu");
	System.out.println("                           2) Main Menu");
	}
	
	static void fileDeleted(String name) {
	System.out.println("*******************************************************************************");	
	System.out.println("              The existing file " + name + " is deleted.    ");  
	System.out.println("*******************************************************************************");	 
	}

	static void selectionError() {
	System.out.println("*******************************************************************************");
	System.out.println("*                  This input is not valid. Please try again                  *");
	System.out.println("*******************************************************************************");
	}
	
}
