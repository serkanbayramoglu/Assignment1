package supporting;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NewFile {

static Scanner scanner = new Scanner(System.in);

	
	static void creatNew(String p1, String newFileName) {
		boolean fileExists = CurrentFiles.search(p1, newFileName);

		if (fileExists) {

			ScreenMessages.newFileExists(newFileName);
			fileExists(p1, newFileName); 
		} else {

			try {

				File newFile = new File (p1, newFileName);
				boolean check = newFile.createNewFile();

				if (check) {
					ScreenMessages.fileCreated(newFileName);
				}
				
				AllScreens.subScreen();

			} catch (IOException e) {
				ScreenMessages.selectionError();
				AllScreens.addFileScreen();
			}
		}
	}
		

	private static void fileExists(String p1, String newFileName) {
		
			int selected = scanner.nextInt();
			
			switch (selected) {
				case 1:
					CurrentFiles.deleteFile(p1, newFileName);
					creatNew(p1, newFileName);
				case 2:
					AllScreens.addFileScreen();
					break;
					
				default: 
					ScreenMessages.selectionError();
					fileExists(p1, newFileName);
					break;
			}
	}
	
}
