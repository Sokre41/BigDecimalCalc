import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("Ucitajte broj: ");
        Scanner scanner = new Scanner(System.in);
        BigDecimal unos = scanner.nextBigDecimal();
        System.out.println("Ucitajte drugi broj: ");
        BigDecimal unos_2 = scanner.nextBigDecimal();

        System.out.println("Obaberite funkciju: ");
        System.out.println("1 - Zbrajanje");
        System.out.println("2 - Oduzimanje");
        System.out.println("3 - Mnozenje");
        System.out.println("4 - Oduzimanje");

        int funkcija = scanner.nextInt();
        switch (funkcija) {
            case 1:
                System.out.println("Rezultat zbrajanja je: " + zbroj(unos, unos_2).toString());
                break;
            case 2:
                System.out.println("Rezultat oduzimanja je: " + razlika(unos, unos_2).toString());
                break;
            case 3:
                System.out.println("Rezultat mnozenja je: " + umnozak(unos, unos_2).toString());
                break;
            case 4:
                System.out.println("Rezultat dijeljanja je: " + kolicnik(unos, unos_2).toString());
                break;
            default:
                System.out.println(" Nepravilan unos!!!!");
        }
    }

    private static BigDecimal kolicnik(BigDecimal unos, BigDecimal unos_2) {
        return unos.divide(unos_2);
    }

    private static BigDecimal umnozak(BigDecimal unos, BigDecimal unos_2) {
        return unos.multiply(unos_2);
    }

    private static BigDecimal razlika(BigDecimal unos, BigDecimal unos_2) {
        return unos.subtract(unos_2);
    }

    private static BigDecimal zbroj(BigDecimal unos, BigDecimal unos_2) {
        return unos.add(unos_2);
    }
}
