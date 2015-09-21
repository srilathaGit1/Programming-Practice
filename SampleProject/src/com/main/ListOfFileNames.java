
//Write a program to show list of all file names in a folder
package com.main;

import java.io.File;
import java.util.ArrayList;

public class ListOfFileNames {
	
	public ArrayList<String> toListAllFiles(String  pFolderName){
		ArrayList<String> list = new ArrayList<String>();
		File dir = new File(pFolderName);
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		        list.add(file.getName());
		    }
		}
		
		return list;
		
	}
	
	

}
