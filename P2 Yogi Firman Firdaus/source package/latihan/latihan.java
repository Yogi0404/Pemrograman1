import java.util.Scanner;

public class latihan {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Float kehadiran;
        Float tugas;
        Float nilai_uts;
        Float nilai_uas;
        float realisasi_kehadiran = 21 * 10;
        float realisasi_tugas = 20 / 100;
        float realisasi_uts = 30 / 100;
        float realisasi_uas = 40 / 100;

        System.out.print("input kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.print("input tugas: ");
        tugas = input.nextFloat();
        System.out.print("input nilai uts: ");
        nilai_uts = input.nextFloat();
        System.out.print("input nilai uas: ");
        nilai_uas = input.nextFloat();

      
            float total_kehadiran = kehadiran / realisasi_kehadiran;
            float total_tugas = tugas / realisasi_tugas;
            float total_uts = nilai_uts / realisasi_uts;
            float total_uas = nilai_uas / realisasi_uas;

            float total = total_kehadiran + total_tugas + total_uts + total_uas;
        

        System.out.println("Kehadiran  :"+  kehadiran);
        System.out.println("tugas      :"+  tugas);
        System.out.println("uts        :"+  nilai_uts);
        System.out.println("uas        :"+  nilai_uas);
        System.out.println("total      :"+  total);

        input.close();
    }

}