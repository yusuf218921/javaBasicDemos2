import java.math.*;

public class FindPrimeNumber {
    public void primeNumber(int low, int high) {
        boolean prime;
        int n = 0;
        for (int i = low; i <= high; i++) {
            prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i == 2) {
                    break;
                } else if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (i == 1) {
                continue;
            }
            if (prime) {
                System.out.print(" " + i);
                n++;
                // her 10 adet girilen asal sayıda bi alt satıra geçmesi için
                if (n % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
