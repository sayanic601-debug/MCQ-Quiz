
import java.util.Scanner;

// Question Class
class Question {
    String question;
    String[] options;
    int correctAnswer;

    // Constructor
    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

// Main Class
public class MCQQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions Array
        Question[] questions = {

            new Question(
                "Which language is used for Android development?",
                new String[]{"Python", "Java", "HTML", "SQL"},
                2
            ),

            new Question(
                "Which keyword is used to create a class in Java?",
                new String[]{"class", "method", "new", "void"},
                1
            ),

            new Question(
                "Which data type stores whole numbers in Java?",
                new String[]{"float", "double", "int", "char"},
                3
            ),

            new Question(
                "Which method is the entry point of a Java program?",
                new String[]{"start()", "run()", "main()", "init()"},
                3
            ),

            new Question(
                "Which symbol is used to end a Java statement?",
                new String[]{":", ";", ".", ","},
                2
            ),

            new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"implements", "extends", "inherits", "super"},
                2
            ),

            new Question(
                "Which collection stores elements dynamically in Java?",
                new String[]{"Array", "String", "ArrayList", "Scanner"},
                3
            ),

            new Question(
                "Which keyword is used to create an object in Java?",
                new String[]{"class", "this", "new", "static"},
                3
            ),

            new Question(
                "Which operator is used for comparison in Java?",
                new String[]{"=", "==", "+", "&&"},
                2
            ),

            new Question(
                "Which loop executes at least once in Java?",
                new String[]{"for", "while", "do-while", "foreach"},
                3
            ),

            new Question(
                "What is the size of int data type in Java?",
                new String[]{"2 bytes", "4 bytes", "8 bytes", "1 byte"},
                2
            ),

            new Question(
                "Which keyword prevents a class from being inherited?",
                new String[]{"static", "private", "final", "abstract"},
                3
            ),

            new Question(
                "Which package contains the Scanner class?",
                new String[]{"java.io", "java.util", "java.lang", "java.net"},
                2
            ),

            new Question(
                "Which concept allows the same method name with different parameters?",
                new String[]{"Inheritance", "Encapsulation", "Overloading", "Abstraction"},
                3
            ),

            new Question(
                "Which keyword is used to handle exceptions in Java?",
                new String[]{"throw", "try", "catch", "All of these"},
                4
            )
        };

        int score = 0;

        System.out.println("================================");
        System.out.println("          WELCOME TO MCQ QUIZ");
        System.out.println("================================");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Choose your answer (1-4).\n");

        // Loop Through Questions
        for (int i = 0; i < questions.length; i++) {

            System.out.println("--------------------------------");
            System.out.println("Q" + (i + 1) + ". " + questions[i].question);

            // Display Options
            for (int j = 0; j < questions[i].options.length; j++) {
                System.out.println((j + 1) + ". " + questions[i].options[j]);
            }

            System.out.print("Your answer: ");

            int answer;

            try {
                answer = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Question skipped.");
                continue;
            }

            // Check Answer
            if (answer < 1 || answer > 4) {
                System.out.println("Invalid option! Question skipped.");
            }
            else if (answer == questions[i].correctAnswer) {
                System.out.println("Correct Answer!");
                score++;
            }
            else {
                System.out.println("Wrong Answer!");

                System.out.println(
                    "Correct Answer: " +
                    questions[i].options[questions[i].correctAnswer - 1]
                );
            }
        }

        // Calculate Result
        int totalQuestions = questions.length;
        int wrongAnswers = totalQuestions - score;

        double percentage = (score * 100.0) / totalQuestions;

        // Display Final Result
        System.out.println("\n================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("================================");

        System.out.println("Total Questions : " + totalQuestions);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + wrongAnswers);

        System.out.printf("Your Score      : %d/%d%n", score, totalQuestions);
        System.out.printf("Percentage      : %.2f%%%n", percentage);

        if (percentage >= 80) {
            System.out.println("Result: Excellent!");
        }
        else if (percentage >= 60) {
            System.out.println("Result: Good Job!");
        }
        else if (percentage >= 40) {
            System.out.println("Result: Keep Practicing!");
        }
        else {
            System.out.println("Result: Better Luck Next Time!");
        }

        System.out.println("\nThank you for playing MCQ Quiz!");

        sc.close();
    }
}
