package PemilihanBaru;

// Kelas ProxyPemilihan
public class ProxyPemilihan implements Pemilihan {

    RealPemilihan realPemilihan = new RealPemilihan();
    
    public void jenisPemilihan(int idPemilihan) {
        realPemilihan.jenisPemilihan(idPemilihan);
    }

    public void tampilkanPartai() {
        realPemilihan.tampilkanPartai();

    }

    public void tampilkanAnggota() {
        realPemilihan.tampilkanAnggota();

    }

    public void tampilkanSemuaSuara() {
        System.out.println("Anda tidak memiliki akses untuk ini.");
    }

    
    public void daerahPemilihan() {
        realPemilihan.daerahPemilihan();
    }

    
    
}
