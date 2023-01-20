package PemilihanBaru;

// Kelas DaerahPemilihan
class DaerahPemilihan {
    private int idDapil;
    private String namaDapil;

    // Constructor
    public DaerahPemilihan(int idDapil, String namaDapil) {
        this.idDapil = idDapil;
        this.namaDapil = namaDapil;
    }

    // Getter untuk idDapil
    public int getIdDapil() {
        return idDapil;
    }

    // Getter untuk NIK
    public String getNamaDapil() {
        return namaDapil;
    }

}
