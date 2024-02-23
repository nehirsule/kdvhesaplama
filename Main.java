import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("üCRET GİRİNİZ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDVSİZ TUTAR:" + tutar);
        System.out.println("KDV ORANI:" + kdvOran);
        System.out.println("KDV TUTARI:" + kdvTutar);
        System.out.println("KDVLİ TUTAR:" + kdvliTutar);

    }
}