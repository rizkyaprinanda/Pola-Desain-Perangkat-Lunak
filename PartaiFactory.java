
package PemilihanBaru;

// Kelas Interface PartaiFactory
public interface PartaiFactory {
    public DaerahPemilihan getDapil(int idDapil);

    public JenisPerwakilan getJenisPerwakilan(int idPerwakilan);

    public Partai getPartai(int idPartai);

    public Anggota getAnggota(int idAnggota);

    public DaftarPemilih getDaftarPemilih(int idPemilih);

    public void tambahSuara(int idAnggota);

    public void tampilkanJumlahSuara();
}