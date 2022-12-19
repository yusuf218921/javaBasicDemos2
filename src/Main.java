import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int selection;
        while (true) {
            System.out.println("\n[1] ATM Uygulaması");
            System.out.println("[2] Bir Sayının Armstrong Olup Olmadıgını Bulan Uygulama");
            System.out.println("[3] Çarpım Tablosu");
            System.out.println("[4] Faiz Hesaplama");
            System.out.println("[0] Çıkış");
            while (true) {
                try {
                    System.out.print("\n\nLütfen yapmak istediğiniz işlemin numarasını giriniz -> ");
                    selection = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Hatalı değer girildi lütfen tekrar deneyiniz");
                }
            }
            if (selection==1) {
                Atm atm = new Atm();
                atm.atm();
            } else if (selection==2) {
                Armstrong armstrong = new Armstrong();
                armstrong.isArmstrong();
            } else if (selection==3) {
                MultiplicationTable table = new MultiplicationTable();
                table.multiplicationTable();
            } else if (selection==4) {
                while (true) {
                    try {
                        System.out.print("Sırasıyla anapara, faiz oranı ve kaç yıl vade yapacağınızı giriniz -> ");
                        InterestCalculator calculator = new InterestCalculator(
                                scanner.nextDouble(),scanner.nextDouble(),scanner.nextInt());
                        calculator.interest();
                        break;
                    } catch (Exception e) {
                        scanner.nextLine();
                        System.out.println("Lütfen değerli doğru bir şekilde tekrar giriniz");
                    }
                }
            } else if (selection==0) {
                System.out.println("Çıkış yapılıyor");
                System.exit(0);
            }
        }
    }
}