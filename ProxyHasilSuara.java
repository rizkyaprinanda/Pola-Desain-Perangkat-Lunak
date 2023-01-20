package PemilihanBaru;

// Kelas ProxyHasilSuara
public class ProxyHasilSuara implements Pemilihan {

    RealPemilihan realPemilihan = new RealPemilihan();
    
    public void daerahPemilihan() {
        realPemilihan.daerahPemilihan();
    }

    public void tampilkanPartai() {
        System.out.println("Anda tidak memiliki akses untuk ini.");
    }

    public void tampilkanAnggota() {
        System.out.println("Anda tidak memiliki akses untuk ini.");
    }

    public void tampilkanSemuaSuara() {
        realPemilihan.tampilkanSemuaSuara();
    }

    @Override
    public void jenisPemilihan(int idPemilihan) {
        realPemilihan.jenisPemilihan(idPemilihan);
    }

}
