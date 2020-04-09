package lesson2;

import java.util.Arrays;
import java.util.Random;

public class CyclicRotation {
    public int[] solution(int[] A, int N) {
        Random rand = new Random(N);
        int M = rand.nextInt(N);

        A = new int[M];
        System.out.println("losowane M: " + M);
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(A));
        return A;
    }
}