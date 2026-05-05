import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class tugas2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indonesia);

        System.out.print("Masukkan total tagihan: ");
        double total = input.nextDouble();

        System.out.print("Masukkan jumlah orang: ");
        int orang = input.nextInt();

        if (orang <= 0) {
            System.out.println("Jumlah orang tidak boleh 0!");
            return;
        }

        System.out.print("Masukkan persen pajak (%): ");
        double pajak = input.nextDouble();

        System.out.print("Masukkan persen service (%): ");
        double service = input.nextDouble();

       double nilaiPajak = total * pajak / 100;
        double nilaiService = total * service / 100;
        double totalAkhir = total + nilaiPajak + nilaiService;
        double perOrang = totalAkhir / orang;

        // Output
        System.out.println("\n===== HASIL SPLIT BILL =====");
        System.out.println("Total awal      : " + rupiah.format(total));
        System.out.println("Pajak           : " + rupiah.format(nilaiPajak));
        System.out.println("Service         : " + rupiah.format(nilaiService));
        System.out.println("Total akhir     : " + rupiah.format(totalAkhir));
        System.out.println("Per orang       : " + rupiah.format(perOrang));

        input.close();
    }
}