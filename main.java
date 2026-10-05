public class main {
    public static void main(String[] args) {

        // Membuat objek menu
        MenuItem menu1 = new MenuItem();

        MenuItem burger = new MenuItem("Burger Special","Makanan",35000,15);
        MenuItem esTeh = new MenuItem("Es Teh Manis","Minuman",8000,50);

        System.out.println("\n--- Data Menu Awal ---");

        menu1.tampilInformasi();
        System.out.println();

        burger.tampilInformasi();
        System.out.println();

        esTeh.tampilInformasi();

        System.out.println("\n--- Proses Transaksi ---");

        // Burger pesan 3
        burger.prosesTransaksi(3);

        System.out.println();

        // Es Teh pesan 60
        esTeh.prosesTransaksi(60);

        System.out.println("\n--- Data Menu Setelah Transaksi ---");

        burger.informasiAfter();
        System.out.println();

        esTeh.informasiAfter();
    }
}