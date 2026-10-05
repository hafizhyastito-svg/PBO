public class MenuItem {
    private String namaMenu;
    private String kategori;
    private double harga;
    private int stok;

    public MenuItem(String namaMenu, String kategori, double harga, int stok) {
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public MenuItem() {
        this("Menu Mboten Wonten", "Umum", 0.0, 0);
    }

    public MenuItem(String namaMenu, double harga) {
        this(namaMenu, "Makanan", harga, 10);
    }

    public void tampilInformasi() {
        System.out.println("==========================================");
        System.out.println("Nama Menu : " + this.namaMenu);
        System.out.println("Kategori  : " + this.kategori);
        System.out.println("Harga     : Rp" + this.harga);
        System.out.println("Sisa Stok : " + this.stok);
        System.out.println("==========================================");
    }

    public double prosesTransaksi(int jumlahPesanan) {

        System.out.println(
            "Pelanggan memesan " + jumlahPesanan +
            " porsi " + this.namaMenu + "..."
        );

        if (jumlahPesanan <= this.stok) {

            this.stok -= jumlahPesanan;

            double total = this.harga * jumlahPesanan;

            System.out.println(
                "Total tagihan " + this.namaMenu +
                ": Rp" + total
            );

            return total;

        } else {

            System.out.println(
                "[Gagal] Stok '" + this.namaMenu +
                "' tidak mencukupi untuk pesanan sebanyak " +
                jumlahPesanan
            );

            System.out.println(
                "Total tagihan " + this.namaMenu + ": Rp0.0"
            );

            return 0;
        }
    }

    public void informasiAfter() {
        System.out.println("==========================================");
        System.out.println("Nama Menu : " + this.namaMenu);
        System.out.println("Kategori  : " + this.kategori);
        System.out.println("Harga     : Rp" + this.harga);
        System.out.println("Sisa Stok : " + this.stok);
        System.out.println("==========================================");
    }

    public void updateStok(int jumlah) {
        this.stok += jumlah;
        if (this.stok < 0) {
            this.stok = 0;
        }

        System.out.println(
            "Info stok '" + this.namaMenu +
            "' berhasil diupdate menjadi " + this.stok
        );
    }
}