package basics.handson;

public class CodingChallenge1 {
    public static void main(String args[]){
        CodingChallenge1 codingChallenge1Obj = new CodingChallenge1();
        //codingChallenge1Obj.firstSolution();
        //codingChallenge1Obj.secondSolution();
        codingChallenge1Obj.exercise3();



    }

    public void firstSolution(){
        System.out.println("SHOPPING LIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semmi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Fre-range");
        System.out.println("\t- Bread");

    }

    public void secondSolution(){
        System.out.print("SHOPPING LIST \n" +
                "\t- Milk\n" +
                "\t\t> Semmi-skimmed\n" +
                "\t\t> Meidum\n" +
                "\t- Eggs\n" +
                "\t\t> Free-range\n" +
                "\t- Bread");
    }

    public void exercise3(){
        System.out.print("The\n");
        System.out.print("\tCake\n");
        System.out.print("Is\t\t\t");
        System.out.print("A\n");
        System.out.print("\tLie.");
    }
}
