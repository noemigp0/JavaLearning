package basics.handson.fundamentals.endodsection;
import java.util.Scanner;

public class CodingChallenge2 {

    /*
    * Write a quiz program with five true-or-false questions. Display a question to the user, and ask the user to enter either true or false,
    *   then move on to the next question. At the end of the quiz display the user’s score.
    *   Use three arrays, a String array for holding the questions, a boolean array for the answers, and another boolean array for the user’s answers.
    *Hints:
        *You can use the Scanner’s nextBoolean() method to get the user’s input
        *Because the questions, answers, and user’s answers are stored in three separate arrays,
        *  you can use their indexes to associate them (e.g. index 1 in the answers array correlates to index 1 in the questions array)
    * */
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("**********QUIZ**********");
        System.out.println("Respond true or false to the questions");

        String[] questions = new String[]{"The moon is further away from the earth than the sun is: ",
                "Goldfish only have three second memory: ",
                "Microwaves have a longer wavelength than ultraviolet: ",
        "Antibiotics are used to treat viral infections: ",
        "Octopuses have three hearts"};

        boolean[] answers = new boolean[]{ false, false, true, false, true};
        boolean[] userAnswers = new boolean[questions.length];
        boolean isTrue;
        int total = 0;

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            isTrue = scanner.nextBoolean();
            userAnswers[i] = isTrue;

        }

        for (int i = 0; i < answers.length; i++){
            for(int j = 0; j < userAnswers.length; j++){
                if ( (i == j) && (answers[i] == userAnswers[j])){
                    total++;
                }
            }

        }

        System.out.println("Your score is: " + total);
    }
}
