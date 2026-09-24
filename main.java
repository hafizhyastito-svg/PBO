public class main {
    public static void main(String[] args) {
     buku buku1 = new buku(null, null, 0);
     buku1.judul = "mas pesen mie ayam seporsi sebelum mati";
     buku1.pengarang = "Brian Khrisna";
     buku1.tahunTerbit = 2019;
     buku1.isDipinjam = false;
     buku1.tampilkanDetail();
     buku buku2 = new buku(null, null, 0);
     buku2.judul = "Laskar pelangi";
     buku2.pengarang = "Andrea Hirata";
     buku2.tahunTerbit = 2005;
     buku2.isDipinjam = false;
     buku2.tampilkanDetail();
     buku buku3 = new buku(null, null, 0);
     buku3.judul = "Bumi Manusia";
     buku3.pengarang = "Pamoedya Ananta Toer";
     buku3.tahunTerbit = 1980;
     buku3.isDipinjam = false;
     buku3.tampilkanDetail();
     buku buku4 = new buku(null, null, 0);
     buku4.judul = "Harry Potter and the Goblet of Fire";
     buku4.pengarang = "J.K. Rowling";
     buku4.tahunTerbit = 2000;
     buku4.isDipinjam = false;
     buku4.tampilkanDetail();
    }
}

