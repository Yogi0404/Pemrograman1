import java.util.Scanner;

public class latihan2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String hewan = "";
        int pilihan;

        System.out.println("Masukan pilihan yang anda inginkan:");
        System.out.println("1. Ayam");
        System.out.println("2. Bebek");
        System.out.println("3. Default");
        System.out.print("Input pilihan: ");
        
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hewan = "Ayam";
                break;
            case 2:
                hewan = "Bebek";
                break;
            default:
                System.out.println("Hewan tidak ada");
                break;
        }

        if (pilihan == 1 || pilihan == 2) {
            System.out.println("\n=== HASIL ===");
            System.out.println("Hewan: " + hewan);
        }
    }
}