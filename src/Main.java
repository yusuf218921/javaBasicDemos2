import java.util.Scanner;

public class Main {
    private static void pressEnterToContinue() {
        System.out.println("\nDevam etmek için ENTER tuşuna basınız...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("****************BİNBİR ÇEŞİT UYGULAMAYA HOŞ GELDİNİZ****************\n\n");
        Scanner scanner = new Scanner(System.in);
        int selection;
        while (true) {
            System.out.println("\n[1] ATM Uygulaması");
            System.out.println("[2] Bir Sayının Armstrong Olup Olmadıgını Bulan Uygulama");
            System.out.println("[3] Çarpım Tablosu");
            System.out.println("[4] Faiz Hesaplama");
            System.out.println("[5] Girilen İki Sayi Arasındaki Asal Sayıları Bulan Uygulama");
            System.out.println("[6] İki Sayının Ebobunu Bulan Uygulama");
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
            if (selection == 1) {
                Atm atm = new Atm();
                atm.atm();
            } else if (selection == 2) {
                Armstrong armstrong = new Armstrong();
                armstrong.isArmstrong();
                pressEnterToContinue();
            } else if (selection == 3) {
                MultiplicationTable table = new MultiplicationTable();
                table.multiplicationTable();
                pressEnterToContinue();
            } else if (selection == 4) {
                while (true) {
                    try {
                        System.out.print("Sırasıyla anapara, faiz oranı ve kaç yıl vade yapacağınızı giriniz -> ");
                        InterestCalculator calculator = new InterestCalculator(
                                scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
                        calculator.interest();
                        break;
                    } catch (Exception e) {
                        scanner.nextLine();
                        System.out.println("Lütfen değerli doğru bir şekilde tekrar giriniz");
                    }
                }
                pressEnterToContinue();
            } else if (selection == 5) {
                FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
                while (true) {
                    try {
                        System.out.print("Üst ve alt sınırları arada bir boşluk bırakacak şekilde belirleyiniz (örn 5 6) -> ");
                        findPrimeNumber.primeNumber(scanner.nextInt(), scanner.nextInt());
                        break;
                    } catch (Exception e) {
                        scanner.nextLine();
                        System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");
                    }
                }
                pressEnterToContinue();
            } else if (selection == 6) {
                GCDCalculator gcdCalculator = new GCDCalculator();
                while (true) {
                    try {
                        System.out.print("EBOB'unu bulmak istediğiniz iki sayıyı arada boşluk olucak şekilde giriniz -> ");
                        System.out.println("EBOB : " + gcdCalculator.gdc(scanner.nextInt(), scanner.nextInt()));
                        break;
                    } catch (Exception e) {
                        scanner.nextLine();
                        System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");
                    }
                }
                pressEnterToContinue();
            } else if (selection == 0) {
                System.out.println("Çıkış yapılıyor");
                System.exit(0);
            } else {
                System.out.println("\nHatalı işlem girildi lütfen tekrar deneyiniz...");
                pressEnterToContinue();
            }
        }
    }
}