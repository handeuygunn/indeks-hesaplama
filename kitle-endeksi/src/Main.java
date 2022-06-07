import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy,kilo;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Boyunuzu (metre cinsinde) giriniz:");
        boy = girdi.nextDouble();
        System.out.print("Kilonuzu (kg cinsinde) giriniz:");
        kilo = girdi.nextDouble();

        double indeks = kilo / (boy*boy);

        System.out.print("Vucut kitle endeksiniz:");
        System.out.print(indeks);



    }
}
