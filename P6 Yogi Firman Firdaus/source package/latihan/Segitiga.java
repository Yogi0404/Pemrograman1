public class Segitiga {

        private double tinggi;
        private double alas;
    
        // Setter tinggi
        public void settinggi(double tinggi) {
            this.tinggi = tinggi;
        }
    
        // Setter alas
        public void setalas(double alas) {
            this.alas = alas;
        }
    
        // Getter tinggi
        public double gettinggi() {
            return tinggi;
        }
    
        // Getter alas
        public double getalas() {
            return alas;
        }
    
        // Menghitung luas
        public double getluas() {
            return (this.tinggi * this.alas * 0.5);
        }
    
        public static void main(String args[]) {
            Segitiga S[] = new Segitiga[2];
            int i;
    
            // Membuat objek
            S[0] = new Segitiga();
            S[1] = new Segitiga();
    
            // Input nilai
            S[0].settinggi(12.0);
            S[0].setalas(8.0);
    
            S[1].settinggi(11.23);
            S[1].setalas(7.7);
    
            // Output
            for (i = 0; i < 2; i++) {
                System.out.println("Segitiga ke-" + (i + 1));
                System.out.println("Tinggi = " + S[i].gettinggi());
                System.out.println("Alas = " + S[i].getalas());
                System.out.println("Luas Segitiga = " + S[i].getluas());
                System.out.println();
            }
        }
    }
