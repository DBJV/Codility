package lesson1;

import java.util.LinkedList;
import java.util.List;

public class BinaryGap {
    public void solution(int N) {
        String binary;
        binary = Integer.toBinaryString(N);
        System.out.println("N = " + N);
        System.out.println("Binarnie: " + binary);
        System.out.println();

        int size = 0;
        List<Integer> gapSizes = new LinkedList<>();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                gapSizes.add(size);
                size = 0;
            } else
                size++;
        }
        int max = gapSizes.get(0);
//        System.out.println(gapSizes);
        for (int i = 0; i < gapSizes.size(); i++) {
            if (gapSizes.get(i) > max)
                max = gapSizes.get(i);
        }
        System.out.println("Max BinaryGap: " + max);
    }
}