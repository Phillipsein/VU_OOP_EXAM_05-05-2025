import java.io.*;

/**
*
* @author phill
*/

//Question 4d)
//Java program to read and display a File’s contents
public class MedicalLogReader {
    public static void main(String[] args) {
        // Assuming this File object is provided or configured
        File medicalLogFile = new File("medicalLog.txt");

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(medicalLogFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Log file not found: " + medicalLogFile.getAbsolutePath());
        } catch (IOException ioe) {
            System.err.println("Error reading log file: " + ioe.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException closeEx) {
                    System.err.println("Failed to close reader: " + closeEx.getMessage());
                }
            }
        }
    }
}
