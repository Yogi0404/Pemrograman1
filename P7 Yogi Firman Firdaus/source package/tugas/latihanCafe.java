import java.util.Scanner;

public class latihanCafe {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int pilihanMinuman;
        int pilihanUkuran;
        int pilihanGula;
        String nama = "";
        String minuman = "";
        String ukuran = "";
        String gula = "";
        String status = "";
        int harga = 0;

        System.out.println("=== CAFE ORDER SYSTEM ===");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Tidak jadi");
        System.out.print("Pilih minuman: ");
        
        pilihanMinuman = input.nextInt();
        input.nextLine();

        if (pilihanMinuman == 1) {
            minuman = "Kopi";
            harga = 10000;
        } else if (pilihanMinuman == 2) {
            minuman = "Teh";
            harga = 8000;
        } else {
            System.out.println("Pesanan dibatalkan");
            return;
        }

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();

        System.out.println("\n=== PILIH UKURAN ===");
        System.out.println("1. Small (+0)");
        System.out.println("2. Medium (+2000)");
        System.out.println("3. Large (+4000)");
        System.out.print("Pilih ukuran: ");
        
        pilihanUkuran = input.nextInt();

        switch (pilihanUkuran) {
            case 1:
                ukuran = "Small";
                break;
            case 2:
                ukuran = "Medium";
                harga += 2000;
                break;
            case 3:
                ukuran = "Large";
                harga += 4000;
                break;
            default:
                System.out.println("Ukuran tidak valid");
                return;
        }

        System.out.println("\n=== LEVEL GULA ===");
        System.out.println("1. Normal");
        System.out.println("2. Sedikit");
        System.out.println("3. Tanpa gula");
        System.out.print("Pilih gula: ");

        pilihanGula = input.nextInt();

        switch (pilihanGula) {
            case 1:
                gula = "Normal";
                break;
            case 2:
                gula = "Sedikit";
                break;
            case 3:
                gula = "Tanpa gula";
                break;
            default:
                System.out.println("Pilihan gula tidak valid");
                return;
        }

        if (harga > 12000) {
            status = "Pesanan Premium";
        } else {
            status = "Pesanan Biasa";
        }

        System.out.println("\n=== STRUK PESANAN ===");
        System.out.println("Nama     : " + nama);
        System.out.println("Minuman  : " + minuman);
        System.out.println("Ukuran   : " + ukuran);
        System.out.println("Gula     : " + gula);
        System.out.println("Harga    : Rp " + harga);
        System.out.println("Status   : " + status);
    }
}