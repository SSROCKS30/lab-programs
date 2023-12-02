import java.util.Scanner;

public class QuizGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char gradeAnotherQuiz;

        do {
            // Step 1: Ask the user how many questions are in the quiz.
            System.out.print("Enter the number of questions in the quiz: ");
            int numQuestions = scanner.nextInt();

            // Step 2: Ask the user to enter the key (correct answers).
            System.out.println("Enter the key for the quiz (space-separated integers): ");
            int[] key = new int[numQuestions];
            for (int i = 0; i < numQuestions; i++) {
                key[i] = scanner.nextInt();
            }

            // Step 3: Ask the user to enter the answers for the quiz to be graded.
            System.out.println("Enter the answers for the quiz (space-separated integers): ");
            int numCorrect = 0;
            for (int i = 0; i < numQuestions; i++) {
                int userAnswer = scanner.nextInt();

                // Compare the user's answer to the key
                if (userAnswer == key[i]) {
                    numCorrect++;
                }
            }

            // Step 4: Print the number correct and the percent correct.
            double percentCorrect = (double) numCorrect / numQuestions * 100;
            System.out.println("Number correct: " + numCorrect);
            System.out.println("Percent correct: " + percentCorrect + "%");

            // Ask the user if they want to grade another quiz.
            System.out.print("Grade another quiz? (y/n): ");
            gradeAnotherQuiz = scanner.next().charAt(0);

        } while (gradeAnotherQuiz == 'y' || gradeAnotherQuiz == 'Y');

        System.out.println("Goodbye!");
    }
}
