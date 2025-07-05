import java.util.Scanner;

/**
 *
 * @author phill
 */

//Java program to count “Uganda” occurrence
public class UgandaCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter book description: ");
        String description = in.nextLine();
        in.close();

        // Normalize to lower case for case‐insensitive search
        String text = description.toLowerCase();
        String target = "uganda";
        int count = 0;
        int idx = 0;

        // Loop: find each occurrence of "uganda"
        while ((idx = text.indexOf(target, idx)) != -1) {
            count++;
            idx += target.length();  // move past this match
        }

        System.out.printf("The word \"%s\" appears %d time%s.%n",
                          "Uganda", count, (count == 1 ? "" : "s"));
    }
}
