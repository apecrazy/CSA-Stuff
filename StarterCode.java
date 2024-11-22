import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StarterCode {
    
    public static void main(String[] args) {
        // read input from a file into an array
        // change the filename as needed
        String[] lines = readStringsFromFile("inputs1.txt");
        System.out.println("\n\n\n");
        for (String line: lines) {
            System.out.println(line);
        }

        // Not much of a need to edit anything down here
        // Here is where your methods actually run and return their results!
        System.out.println(partOne(lines));
        System.out.println(partTwo(lines));
    }

// -------------------------------------------------------------------------------------- //


    // TODO: Complete Part One!
    public static long partOne(String[] lines) {
        // put your code for Part One below and return your answer
        return -1;  // dummy return statement; delete when completing this problem
    }

    // TODO: Complete Part Two!
    public static long partTwo(String[] lines) {
        // put your code for Part Two below and return your answer
        return -1;  // dummy return statement; delete when completing this problem
    }


// -------------------------------------------------------------------------------------- //
    // HELPER METHODS

    /*
     * A method to read Strings from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
    public static String[] readStringsFromFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            String[] lines = new String[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                String data = myReader2.nextLine();
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            String[] dummy = new String[1];
            return dummy;
        }
    }
	
    /*
     * A method to read ints from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
	public static int[] readIntsFromFile(String fileName) {
		try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            int[] lines = new int[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                int data = Integer.parseInt(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            int[] dummy = new int[1];
            return dummy;
        }
            
    }
	
    /*
     * A method to read longs from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
	public static long[] readLongsFromFile(String fileName) {
		try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            long[] lines = new long[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                long data = Long.parseLong(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            long[] dummy = new long[1];
            return dummy;
        }
    }
	
        
}
