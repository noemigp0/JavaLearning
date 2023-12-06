package basics.fundamentals;

public class BreakAndContinue {
    public static void main (String args[]){

        for (int i = 0; i <= 5; i++){
            if (i == 2){
                continue;  //The "2" number isn´t printed cause this line is skipping the iteration
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 5; i++){
            if (i == 4){
                break; //This lines breaks the loop when the if statement will be completed
            }
            System.out.println(i);

        }


    }
}
