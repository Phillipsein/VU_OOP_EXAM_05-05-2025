import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author phill
 */

//QUESTION 3d)
//Java Program: 30 Random AQI Readings, Median & “Hazardous” Days
public class AQIAnalyzer {
    public static void main(String[] args) {
        // i) Generate 30 random AQI readings (1–300)
        Random rand = new Random();
        int[] readings = new int[30];
        for (int i = 0; i < readings.length; i++) {
            readings[i] = rand.nextInt(300) + 1; // [1,300]
        }

        // ii) Compute median
        int[] sorted = readings.clone();
        Arrays.sort(sorted);
        double median;
        int n = sorted.length;
        if (n % 2 == 0) {
            // average of middle two
            median = (sorted[n/2 - 1] + sorted[n/2]) / 2.0;
        } else {
            median = sorted[n/2];
        }

        // iii) Count “hazardous” days (AQI > 200)
        int hazardousCount = 0;
        for (int aqi : readings) {
            if (aqi > 200) {
                hazardousCount++;
            }
        }

        // Display results
        System.out.println("All AQI readings: " + Arrays.toString(readings));
        System.out.printf("Median AQI: %.1f%n", median);
        System.out.printf("Number of hazardous days (AQI>200): %d%n", hazardousCount);
    }
}
