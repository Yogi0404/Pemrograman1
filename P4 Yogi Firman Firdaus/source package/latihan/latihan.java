import java.util.Scanner;

public class latihan {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double hadir;
        double total_pertemuan = 21;

        double tugas;
        double nilai_uts;
        double nilai_uas;

        System.out.print("Jumlah hadir: ");
        hadir = input.nextDouble();

        System.out.print("Nilai tugas (0-100): ");
        tugas = input.nextDouble();

        System.out.print("Nilai UTS (0-100): ");
        nilai_uts = input.nextDouble();

        System.out.print("Nilai UAS (0-100): ");
        nilai_uas = input.nextDouble();

        double kehadiran = (hadir / total_pertemuan) * 100;

        double total_kehadiran = kehadiran * 0.1;
        double total_tugas = tugas * 0.2;
        double total_uts = nilai_uts * 0.3;
        double total_uas = nilai_uas * 0.4;

        double total = total_kehadiran + total_tugas + total_uts + total_uas;

        System.out.printf("Total nilai: %.2f\n", total);
        input.close();
    }
}