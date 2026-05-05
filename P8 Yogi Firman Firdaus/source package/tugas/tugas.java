import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        int[] hadir = new int[100];
        int[] total = new int[100];
        double[] persen = new double[100];

        int jumlahData = 0;
        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM KEHADIRAN ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Semua Data");
            System.out.println("3. Ranking Kehadiran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama mahasiswa: ");
                    nama[jumlahData] = input.nextLine();

                    System.out.print("Total hari: ");
                    total[jumlahData] = input.nextInt();

                    System.out.print("Jumlah hadir: ");
                    hadir[jumlahData] = input.nextInt();

                    if (hadir[jumlahData] > total[jumlahData] || hadir[jumlahData] < 0) {
                        System.out.println(" Input tidak valid!");
                    } else {
                        persen[jumlahData] = ((double) hadir[jumlahData] / total[jumlahData]) * 100;
                        jumlahData++;
                        System.out.println(" Data berhasil ditambahkan!");
                    }
                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println(" Belum ada data!");
                    } else {
                        System.out.println("\n=== DATA MAHASISWA ===");
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.println((i + 1) + ". " + nama[i]);
                            System.out.println("   Hadir: " + hadir[i] + "/" + total[i]);
                            System.out.printf("   Persentase: %.2f%%\n", persen[i]);

                            if (persen[i] >= 70) {
                                System.out.println("   Status: LULUS");
                            } else {
                                System.out.println("   Status: TIDAK LULUS");
                            }
                        }
                    }
                    break;

                case 3:
                    if (jumlahData == 0) {
                        System.out.println(" Belum ada data!");
                    } else {
                        for (int i = 0; i < jumlahData - 1; i++) {
                            for (int j = 0; j < jumlahData - i - 1; j++) {
                                if (persen[j] < persen[j + 1]) {
                                    double tempPersen = persen[j];
                                    persen[j] = persen[j + 1];
                                    persen[j + 1] = tempPersen;

                                    String tempNama = nama[j];
                                    nama[j] = nama[j + 1];+++
                                    nama[j + 1] = tempNama;

                                    int tempHadir = hadir[j];
                                    hadir[j] = hadir[j + 1];
                                    hadir[j + 1] = tempHadir;

                                    int tempTotal = total[j];
                                    total[j] = total[j + 1];
                                    total[j + 1] = tempTotal;
                                }
                            }
                        }

                        System.out.println("\n=== RANKING KEHADIRAN ===");
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.println((i + 1) + ". " + nama[i] +
                                    " - " + String.format("%.2f%%", persen[i]));
                        }
                    }
                    break;

                case 4:
                    System.out.println(" Keluar...");
                    break;

                default:
                    System.out.println(" Menu tidak tersedia!");
            }

        } while (pilihan != 4);

        input.close();
    }
}