import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> allQuestions = Arrays.asList(
            new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2),
            new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 1),
            new Question("Who wrote 'Romeo and Juliet'?", new String[]{"Shakespeare", "Hemingway", "Dickens", "Tolkien"}, 0),
            new Question("What is the largest ocean?", new String[]{"Atlantic", "Indian", "Arctic", "Pacific"}, 3),
            new Question("Which element has the chemical symbol 'O'?", new String[]{"Gold", "Oxygen", "Iron", "Hydrogen"}, 1),
            new Question("What is 9 x 7?", new String[]{"63", "72", "56", "81"}, 0),
            new Question("Who painted the Mona Lisa?", new String[]{"Van Gogh", "Da Vinci", "Picasso", "Rembrandt"}, 1),
            new Question("Which language is used for Android development?", new String[]{"Swift", "Java", "Python", "C#"}, 1),
            new Question("What is the boiling point of water?", new String[]{"90°C", "100°C", "110°C", "120°C"}, 1),
            new Question("Which country hosted the 2016 Olympics?", new String[]{"China", "Brazil", "UK", "Russia"}, 1),
            new Question("What is the square root of 144?", new String[]{"10", "11", "12", "13"}, 2),
            new Question("Which organ pumps blood?", new String[]{"Liver", "Lungs", "Heart", "Kidneys"}, 2)
        );

        Collections.shuffle(allQuestions);
        int score = 0;

        System.out.println("🧠 Welcome to the Quiz! Answer 10 questions:");

        for (int i = 0; i < 10; i++) {
            boolean correct = allQuestions.get(i).ask(scanner);
            if (correct) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect.");
            }
        }

        System.out.println("\n🎉 Quiz Complete! Your score: " + score + "/10");
        scanner.close();
    }

}
