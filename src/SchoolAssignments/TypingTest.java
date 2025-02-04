package SchoolAssignments;

import java.util.Scanner;

public class TypingTest {

    public static void main(String[] args) {
        String sampleText = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Typing Test: Type the following text as quickly as you can.");
        System.out.println(sampleText);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter when ready to start...");
        scanner.nextLine();  // Wait for the user to press enter

        long startTime = System.currentTimeMillis();
        System.out.println("Start typing:");
        String typedText = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        scanner.close();

        int elapsedTime = (int) ((endTime - startTime) / 1000); // Convert time to seconds
        int wordCount = sampleText.split(" ").length;
        int typedWords = typedText.split(" ").length;

        if (sampleText.equals(typedText)) {
            System.out.println("Well done!");
            System.out.println("You typed the text correctly.");
        } else {
            System.out.println("There were some differences between the sample and your typing.");
        }

        double wpm = (typedWords / (elapsedTime / 60.0));
        System.out.println("Time taken: " + elapsedTime + " seconds");
        System.out.println("Words per minute (WPM): " + String.format("%.2f", wpm));
    }
}
