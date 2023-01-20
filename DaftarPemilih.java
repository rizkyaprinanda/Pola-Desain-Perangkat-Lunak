package PemilihanBaru;

// Kelas DaftarPemilih
public class DaftarPemilih {
    private int idPemilih;
    private long NIK;
    private int levelPemilih;

    // Constructor
    public DaftarPemilih(int idPemilih, long NIK, int levelPemilih) {
        this.idPemilih = idPemilih;
        this.NIK = NIK;
        this.levelPemilih = levelPemilih;
    }

    // Getter untuk idPemilih
    public int getIdPemilih() {
        return idPemilih;
    }

    // Getter untuk NIK
    public long getNIK() {
        return NIK;
    }

    // Getter untuk levelPemilih
    public int getlevelPemilih() {
        return levelPemilih;
    }
}