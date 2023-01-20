package PemilihanBaru;

// Kelas JenisPerwakilan
class JenisPerwakilan {
    private int idPerwakilan;
    private String namaPerwakilan;

    // Constructor
    public JenisPerwakilan(int idPerwakilan, String namaPerwakilan) {
        this.idPerwakilan = idPerwakilan;
        this.namaPerwakilan = namaPerwakilan;
    }

    // Getter untuk idPemilih
    public int getIdPerwakilan() {
        return idPerwakilan;
    }

    // Getter untuk NIK
    public String getNamaPerwakilan() {
        return namaPerwakilan;
    }

}
