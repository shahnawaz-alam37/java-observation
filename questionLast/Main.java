package questionLast;//remove the package name

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "input.txt"; // change this to the name of your input file
        String wordToCount = "qqgpt"; // change this to the word you want to count

        int count = 0;

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        while (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(wordToCount)) {
                    count++;
                }
            }
            line = reader.readLine();
        }
        reader.close();

        System.out.println("The word \"" + wordToCount + "\" appears " + count + " times in the file.");
    }
}
