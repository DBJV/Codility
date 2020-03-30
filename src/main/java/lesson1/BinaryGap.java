package lesson1;

public class BinaryGap {
    public void solution(int N) {
        String wynik;
        wynik = Integer.toBinaryString(N);
        System.out.println("N = " + N);
        System.out.println("Binarnie: " + wynik);

        int zero = 0;
        for (int i = 0; i <= wynik.length(); i++) {
            if (wynik.charAt(i) == '0') {
                zero++;
            }
            else zero = 0;
            System.out.println("Przerwa: " + zero + "zer");
        }
    }
}