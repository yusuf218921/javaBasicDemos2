import java.util.Scanner;

public class Armstrong {
    /*
    Bir sayının armstrong sayı olabilmesi için; sayının rakamlarının her birinin,
    o sayının basamağı kadar kuvveti alınıp toplanmasına eşit olması gerekir.
    örn -> 1634 = 1^4 + 6^4 + 3^4 + 4^4
    */
    Scanner scanner = new Scanner(System.in);

    public void isArmstrong() {
        int digit;
        int digits = 0;
        int num;
        int _num;
        int arm_num = 0;

        while (true) {
            try {
                System.out.print("Sayi : ");
                num = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Hatali değer girildi, lütfen bir tam sayi giriniz");
            }
        }
        _num = num; // sayı üzerinde değişiklik yapmamak için eşit bir yeni sayı tutma
        while (_num != 0) {
            _num /= 10;
            digits++; // sayının kaç basamaklı olduğunu bulma
        }
        _num = num;
        for (int i = 0; i < digits; i++) {
            digit = _num % 10;
            _num /= 10;
            arm_num += Math.pow(digit, digits);
        }
        if (num == arm_num) {
            System.out.println("Girmiş olduğunuz sayi bir armstrong sayıdır\n");
        } else {
            System.out.println("Girmiş olduğunuz sayı armstrong bir sayı değildir\n");
        }
    }
}
