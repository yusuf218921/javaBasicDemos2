public class GCDCalculator {
    public int gdc(int num1, int num2) {
        int gdc = 1;
        for (int i = 2; i <=num1; i++) {
            while (true)
                if (num1 % i == 0 && num2 % i == 0) {
                    gdc *= i;
                    num1 /= i;
                    num2 /= i;
                } else {
                    break;
                }
        }
        return gdc;
    }
}
