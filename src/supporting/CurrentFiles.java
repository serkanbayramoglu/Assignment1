package supporting;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

import application.LockedMe;

class CurrentFiles {

	
// list in sorted order
	static String[] listFileNames (String p1) {
		File f = new File(p1);
		String[] fileNames = null;
		
		try {	
			FileFilter filter = new FileFilter() {	
				@Override
				public boolean accept(File file) {
					return ((file.isHidden()==false) && file.isFile());
				}
			};
		
			File[] files = f.listFiles(filter);
				
			fileNames = new String[files.length];
				
			for (int i=0; i<files.length;i++) {
				fileNames[i] = files[i].getName();
			}
						
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		Sortings.sort(fileNames);
			
		return fileNames;

	}

// delete
	static void deleteFile(String p1, String existingFileName) {
		File existingFile = new File (p1, existingFileName);
		boolean check = existingFile.delete();
		if (check) {
			ScreenMessages.fileDeleted(existingFileName);
		} else {
			ScreenMessages.searchFileNotExist(existingFileName);
		}
	}

// Search
	static boolean search(String p1, String newFileName) {

		boolean fileExists = false;
		String [] fileNames = CurrentFiles.listFileNames(p1);
		
		for (String fileName :  fileNames) {
			if (newFileName.equals(fileName)) {
				fileExists = true;
			}
		}
		return fileExists;
	}
}
