import java.text.NumberFormat;
import java.util.Locale;

public class FormatAngkaLokal {
    public static void main(String[] args) {

        double angka = 83243463.342245;
        double angkaPecahan = 0.902235643;

        // Format Germany
        NumberFormat numberFormatterGermany = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat currFormatterGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat percentFormatterGermany = NumberFormat.getPercentInstance(Locale.GERMANY);

        String numberStrGermany = numberFormatterGermany.format(angka);
        String currStrGermany = currFormatterGermany.format(angka);
        String percentStrGermany = percentFormatterGermany.format(angkaPecahan);

        System.out.println("=== FORMAT GERMANY ===");
        System.out.println("Number   : " + numberStrGermany);
        System.out.println("Currency : " + currStrGermany);
        System.out.println("Percent  : " + percentStrGermany);

        System.out.println();

        // Format US
        NumberFormat numberFormatterUS = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat currFormatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat percentFormatterUS = NumberFormat.getPercentInstance(Locale.US);

        String numberStrUS = numberFormatterUS.format(angka);
        String currStrUS = currFormatterUS.format(angka);
        String percentStrUS = percentFormatterUS.format(angkaPecahan);

        System.out.println("=== FORMAT US ===");
        System.out.println("Number   : " + numberStrUS);
        System.out.println("Currency : " + currStrUS);
        System.out.println("Percent  : " + percentStrUS);
    }
}