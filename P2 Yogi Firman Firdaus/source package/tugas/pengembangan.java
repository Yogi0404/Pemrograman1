import java.util.Scanner;

public class pengembangan {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nama;
        String NIM; 
        String Alamat;
        String Nama_Ortu;
        int usia;

        System.out.println("---------------------");

        System.out.print("input nama : ");
        nama = input.nextLine();

        System.out.print("input nim : ");
        NIM = input.nextLine();

        System.out.print("input alamat : ");
        Alamat = input.nextLine();

        System.out.print("input nama ortu : ");
        Nama_Ortu = input.nextLine();

        System.out.print("input usia : ");
        usia = input.nextInt();

        System.out.println("\n----- HASIL -----");
        System.out.println("Nama     :"+  nama);
        System.out.println("Nim      :"+  NIM);
        System.out.println("Alamat   :"+  Alamat);
        System.out.println("Nama Ortu:"+  Nama_Ortu);
        System.out.println("Usia     :"+  usia);

        input.close();
    }
}

