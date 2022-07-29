package virtualkey;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileOperations {
	
	public static void main(String[] args) {
		
		FileOperations.createFolder("repo");
		
		Menu.display();
		
		OptionSelection.ScreenInput();
	}
	
	
	public static class OptionSelection {
		
		public static void ScreenInput() {
			boolean val = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					Menu.displayMenu();
					int input = sc.nextInt();

					switch (input) {
					case 1:
						FileOperations.displayFiles("repo");
						break;
					case 2:
						OptionSelection.FileMenuOptions();
						break;
					case 3:
						System.out.println("Program exited successfully.");
						val = false;
						sc.close();
						System.exit(0);
						break;
					default:
						System.out.println("Please select a valid option");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					ScreenInput();
				} 
			} while (val == true);
		}
		
		public static void FileMenuOptions() {
			boolean val = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					Menu.displayFileMenu();
					FileOperations.createFolder("repo");
					
					int input = sc.nextInt();
					switch (input) {
					case 1:
						// Add File
						System.out.println("Enter the name of the file to be added to the \"repo\" folder");
						String fileToAdd = sc.next();
						
						FileOperations.createFile(fileToAdd, sc);
						
						break;
					case 2:
						// Delete File
						System.out.println("Enter the name of the file to be deleted from \"repo\" folder");
						String fileToDelete = sc.next();
						File file = new File("E:\\Project Simpli learn\\Project Phase-1\\repo");
						
						boolean f = new File(file, fileToDelete).exists();
						if(f == true) {
							File f1 = new File(file, fileToDelete);
							f1.delete();
							System.out.println("File Successfully Deleted");
						} 
						else {
							System.out.println("File doesn't exist");
						}
				
						break;
					case 3:
						// Search for a file
						System.out.println("Enter the name of the file to be searched from \"repo\" folder");
						String fileName = sc.next();
						
						FileOperations.createFolder("repo");
						FileOperations.displayFileLocations(fileName, "repo");

						break;
					case 4:
						// Go to Previous menu
						return;
					case 5:
						// Exit
						System.out.println("Program exited successfully.");
						val = false;
						sc.close();
						System.exit(0);
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					FileMenuOptions();
				}
			} while (val == true);
		}

	}
	
	public static void createFolder(String folderName) {
		File file = new File(folderName);
		if (!file.exists()) {
			file.mkdirs();
		}
	}
	
	public static void displayFiles(String path) {
		FileOperations.createFolder("repo");
		
		List<String> filesListNames = FileOperations.listFiles(path, 0, new ArrayList<String>());

		System.out.println("Displaying all files in ascending order\n");
		Collections.sort(filesListNames);

		filesListNames.stream().forEach(System.out::println);
	}

	public static List<String> listFiles(String path, int indentCount, List<String> fileListNames) {
		File dir = new File(path);
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		Collections.sort(filesList);

		 if (files != null && files.length > 0) {
			for (File file : filesList) {

				System.out.print(" ".repeat(indentCount * 2));

				if (file.isDirectory()) {
					fileListNames.add(file.getName());
					listFiles(file.getAbsolutePath(), indentCount + 1, fileListNames);
				} else {
					fileListNames.add(file.getName());
				}
			}
		} else {
			System.out.print(" ".repeat(indentCount * 2));
			System.out.println("--- Empty Directory ---");
		} 
		System.out.println();
		return fileListNames;
	}

	public static void createFile(String fileToAdd, Scanner sc) {
		FileOperations.createFolder("repo");
		Path pathToFile = Paths.get("./repo/" + fileToAdd);
		try {
			Files.createDirectories(pathToFile.getParent());
			Files.createFile(pathToFile);
			System.out.println(fileToAdd + " created successfully");

			System.out.println("Would you like to add some content to the file? (y/n)");
			String choice = sc.next().toLowerCase();

			sc.nextLine();
			if (choice.equals("y")) {
				System.out.println("\n\nInput content and press enter\n");
				String content = sc.nextLine();
				Files.write(pathToFile, content.getBytes());
				System.out.println("\nContent written to file " + fileToAdd);
			}

		} catch (IOException e) {
			System.out.println("Failed to create file " + fileToAdd);
			System.out.println(e.getClass().getName());
		}
	}

	public static List<String> displayFileLocations(String fileName, String path) throws IOException {
		List<String> fileListNames = new ArrayList<>();
		FileOperations.searchFile(path, fileName, fileListNames);

		if (fileListNames.isEmpty()) {
			System.out.println("\n Couldn't find any file with given file name \"" + fileName + "\" \n");
		} else {
			System.out.println("\n\nFound file at below location:");

			List<String> files = IntStream.range(0, fileListNames.size())
					.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());
			
			
			System.out.println(fileListNames);
			String delim="";
			String res = String.join(delim, fileListNames);
			
	        System.out.println("Contents of the File: ");
			
			FileReader reader = null;
			try {
				reader = new FileReader(res);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int data;
			
			while((data=reader.read())!=-1){
				
				System.out.print((char)data);
			} 
		} 
		return fileListNames;
	}
	
	public static void searchFile(String path, String fileName, List<String> fileListNames) {
		File dir = new File(path);
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		if (files != null && files.length > 0) {
			for (File file : filesList) {

				if (file.getName().startsWith(fileName)) {
					fileListNames.add(file.getAbsolutePath());
				}

				if (file.isDirectory()) {
					searchFile(file.getAbsolutePath(), fileName, fileListNames);
				}
			}
		}
	}	
}


