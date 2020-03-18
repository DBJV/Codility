package unit1;

public class Main extends Frog{
    public static void main(String[] args) {

        Frog frog = new Frog();
        int stepsNr = frog.solution(12,516,151);

        System.out.println("Number of jumps: " + stepsNr);

    }
}
