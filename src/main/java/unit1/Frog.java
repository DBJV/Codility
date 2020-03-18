package unit1;

public class Frog {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int modulo = distance % D;
        int stepsNr = distance / D;
        int realLocation = X + stepsNr * D;

        if (modulo == 0)
            return stepsNr;
        else
            return stepsNr + 1;
    }
}

