import java.util.Scanner;

public class Atm {
    public class Balance {
        private int balance;

        public Balance(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
        public void topUp(int money) {
            balance += money;
            System.out.println("Hesabınıza " + money + " TL yüklendi");
        }

        public void withdraw(int money) {
            if (balance >= money) {
                balance -= money;
                System.out.println("Hesabınızdan " + money + " TL para çekildi");
            } else {
                System.out.println("Hesabınızda yeterli miktarda para bulunamadı!");
            }

        }

    }
    private final Scanner scanner = new Scanner(System.in);
    private final Balance balance = new Balance(10000);

    public void atm() throws InterruptedException {
        while (true) {
            System.out.println("\n\n[1] BAKİYE GÖRÜNTÜLE");
            System.out.println("[2] PARA YATIRMA");
            System.out.println("[3] PARA ÇEKME");
            System.out.println("[0] ÇIKIŞ");
            int selection;
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
            int money;
            switch (selection) {
                case 1 -> System.out.println("Hesabınızdaki tutar : " + balance.getBalance() + " TL");
                case 2 -> {
                    while (true) {
                        try {
                            System.out.print("\n\nYatırmak istediğiniz miktarı giriniz(Z) ->  ");
                            money = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            scanner.nextLine();
                            System.out.println("Hatalı değer girildi lütfen tekrar deneyiniz");
                        }
                    }
                    balance.topUp(money);
                }
                case 3 -> {
                    while (true) {
                        try {
                            System.out.print("\n\nÇekmek istediğiniz miktarı giriniz(Z) ->  ");
                            money = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            scanner.nextLine();
                            System.out.println("Hatalı değer girildi lütfen tekrar deneyiniz");
                        }
                    }
                    balance.withdraw(money);
                }
                case 0 -> {
                    System.out.println("Sistemden çıkış yapılıyor");
                    Thread.sleep(1000);
                    System.out.println("3");
                    Thread.sleep(1000);
                    System.out.println("2");
                    Thread.sleep(1000);
                    System.out.println("1");
                    Thread.sleep(1000);
                    System.out.println("0");
                    System.exit(0);
                }
                default -> System.out.println("Hatalı değer girildi lütfen tekrar deneyiniz");

            }

        }
    }
}
