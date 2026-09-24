public class buku {
    
    String judul;
    String pengarang;
    int tahunTerbit;
    boolean isDipinjam;

    public buku (String judul, String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam =  false;
    }

    public void pinjamBuku(){
        if(!isDipinjam){
            isDipinjam = false;
            System.out.println("Berhasil meminjam buku " + judul);
        }else{
            System.out.println("maaf buku tidak tersedia");
        }
    }

    public void kembalikanBuku(){
        if(isDipinjam){
            isDipinjam = false;
            System.out.println("Berhasil Mengembalikan buku " + judul);
        }else{
            System.out.println("anda tidak meminjam buku " + judul);
        }
    }
    public void tampilkanDetail(){
        String status = isDipinjam ? "Dipinjam" : "Tersedia";
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Buku: " + judul);
        System.out.println("Tahun terbit: "+ tahunTerbit);
        System.out.println("Status: " + status);
        System.out.println("-------------------------");
        System.out.println("");
    }


}
