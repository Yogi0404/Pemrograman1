import java.util.Scanner;

public class latihan3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        int pilihanReg;
        String nama = "";
        String jurusan = "Teknik Informatika";
        String reg = "";

        System.out.println("1. Teknik Informatika");
        System.out.println("2. Cari informasi jurusan lain");
        System.out.print("Input pilihan: ");
        
        pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Input Nama: ");
            nama = input.nextLine();

            System.out.println("\nPilih Kelas:");
            System.out.println("1. Reg A");
            System.out.println("2. Reg B");
            System.out.println("3. Reg CK");
            System.out.println("4. Reg CS");
            System.out.print("Input pilihan: ");

            pilihanReg = input.nextInt();

            switch (pilihanReg) {
                case 1:
                    reg = "Reguler A";
                    break;
                case 2:
                    reg = "Reguler B";
                    break;
                case 3:
                    reg = "Reguler CK";
                    break;
                case 4:
                    reg = "Reguler CS";
                    break;
                default:
                    System.out.println("Pilihan kelas tidak valid");
                    return;
            }

        } else {
            System.out.println("Jurusan yang anda cari tidak ada");
        }

        if (pilihan == 1) {
            System.out.println("\n=== HASIL ===");
            System.out.println("Nama: " + nama);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Kelas: " + reg);
        }
    }
}