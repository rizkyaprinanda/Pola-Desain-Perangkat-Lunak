
package PemilihanBaru;

// Kelas Partai
public class Partai {
    private int idPartai;
    private String namaPartai;

    // Constructor
    public Partai(int idPartai, String namaPartai) {
        this.idPartai = idPartai;
        this.namaPartai = namaPartai;
    }

    // Getter untuk idPartai
    public int getIdPartai() {
        return idPartai;
    }

    // Getter untuk namaPartai
    public String getNamaPartai() {
        return namaPartai;
    }
}