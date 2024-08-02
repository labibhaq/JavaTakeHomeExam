package CodingPracticals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practical2 {

    public static boolean doesFileExist(String path) {
        File file = new File(path);
        
        try {
            // Check if the file exists
            if (file.exists() && file.isFile()) {
                System.out.println("The file exists at path: " + path);
                return true;
            } else {
                System.out.println("The file does not exist at path. ");
                return false;
            }
        } catch (SecurityException e) {
            System.out.println("Unable to access the file at path. ");
            return false;
        }
    }
    
    public static void printDictionary(String path) throws IOException {
        // Use a map to store words and their meanings
        Map<String, String[]> dictionary = new HashMap<>();

        // Read the file
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line at the -
            String[] parts = line.split(" - ");
            if (parts.length == 2) {
                String word = parts[0].trim();
                // split meaning by the ,
                String[] meanings = parts[1].split(",");
                dictionary.put(word, meanings);
            }
        
    }

        // Print the dictionary
        for (Map.Entry<String, String[]> entry : dictionary.entrySet()) {
            String word = entry.getKey();
            String[] meanings = entry.getValue();
            
            System.out.println(word);
            for (String meaning : meanings) {
                System.out.println(meaning);
            }
            System.out.println(); 
        }
    }

    
    public static void main(String[] args) throws IOException {
        String filePath = "src\\dictionary.txt";
        doesFileExist(filePath);
        printDictionary(filePath);
    }
}