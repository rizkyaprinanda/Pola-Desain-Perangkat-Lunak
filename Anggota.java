
package PemilihanBaru;

// Kelas Anggota
public class Anggota {
    private int idAnggota;
    private int idPartai;
    private String namaAnggota;
    private int jenisPerwakilan;
    private int jumlahSuara;
    private int idDapil;

    // Constructor
    public Anggota(int idAnggota, int idPartai, String namaAnggota, int jenisPerwakilan, int jumlahSuara, int idDapil) {
        this.idAnggota = idAnggota;
        this.idPartai = idPartai;
        this.namaAnggota = namaAnggota;
        this.jenisPerwakilan = jenisPerwakilan;
        this.jumlahSuara = jumlahSuara;
        this.idDapil = idDapil;
    }

    // Getter untuk idPartai
    public int getIdDapil() {
        return idDapil;
    }

    // Getter untuk idAnggota
    public int getIdAnggota() {
        return idAnggota;
    }

    // Getter untuk idPartai
    public int getIdPartai() {
        return idPartai;
    }

    // Getter untuk namaAnggota
    public String getNamaAnggota() {
        return namaAnggota;
    }

    // Getter untuk jumlahSuara
    public int getJumlahSuara() {
        return jumlahSuara;
    }

    // Setter untuk jumlahSuara
    public void setJumlahSuara(int jumlahSuara) {
        this.jumlahSuara = jumlahSuara;
    }

    // Getter untuk jenisPerwakilan
    public int getJenisPerwakilan() {
        return jenisPerwakilan;
    }
}
