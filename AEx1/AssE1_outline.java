// Miklos Farinics 2930017F

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AssE1_outline {
	
	private static final int CAPACITY = 100; // initial capacity
	private static final float LOAD_FACTOR = (float) 0.75;
	
	
	// reading two strings per line from fileName
	// and adding new entry to map
	public static void readFromFileToMap(String fileName, Map<String,String> myMap){
    	try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        	String line;
        	while ((line = reader.readLine()) != null) {
            	String[] parts = line.split(",", 2);
            	if (parts.length == 2) {
                myMap.put(parts[0], parts[1]);
            	}
       	}
    	} catch (IOException e) {
       	 e.printStackTrace();
    	}	
    }
	
	//returning string representation of map, one entry per line
	public static String mapToString(Map<String, String> myMap) {
		String s = "";
		for (Map.Entry<String, String> entry : myMap.entrySet()) {
			s += entry.getKey() + "," + entry.getValue() + "\n";
		}
		return s;
	}
	
	
	//returning string representation of the key set of a map, one line at a time
	public static String keysToString(Map<String, String> myMap) {
		String s = "";
		for (String key : myMap.keySet()) {
			s += key + "\n";
		}
		return s;
	}
	
	
	
	public static void main(String[] args){

		String fileName1 = args[0];
		String fileName2 = args[1];

		Map <String, String> libraryLoans1 = new HashMap<>(CAPACITY, LOAD_FACTOR);
		Map <String, String> libraryLoans2 = new HashMap<>(CAPACITY, LOAD_FACTOR);
		
		//reading contents of FILENAME1 and FILENAME2 into libraryLoans1 and libraryLoans2
		readFromFileToMap(fileName1, libraryLoans1);
		readFromFileToMap(fileName2, libraryLoans2);
		
		//printing the maps one line at a time
		System.out.println("The first map is: \n");
		System.out.println(mapToString(libraryLoans1));
		
		
		System.out.println("The second map is: \n");
		System.out.println(mapToString(libraryLoans2));
		
		System.out.println("The first map overlaid with the second map is: \n");
		libraryLoans1.putAll(libraryLoans2);
		System.out.println(mapToString(libraryLoans1));	
		
		System.out.println("The combined set of keys is: \n");
		System.out.println(keysToString(libraryLoans1)); // After overlaying, libraryLoans1 contains all keys

		
	}

}
