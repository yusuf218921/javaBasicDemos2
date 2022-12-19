public class InterestCalculator {
    private double principal;
    private double interestRatio;
    private int maturity;

    public InterestCalculator(double principal, double interestRatio, int maturity) {
        this.principal = principal;
        this.maturity = maturity;
        this.interestRatio = interestRatio;
    }

    public void interest() {
        double total = principal;
        for (int i = 1; i <= maturity; i++) {
            System.out.println("\n" + i + "yıl kazancınız : " + (total * interestRatio));
            total = total + (total * interestRatio);
            System.out.println(i + "yil toplam paranız : " + total);
        }
    }
}
