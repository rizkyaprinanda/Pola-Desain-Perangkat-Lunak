package PemilihanBaru;

// Kelas PartaiFactoryImpl
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PartaiFactoryImpl implements PartaiFactory {
    private static List<JenisPerwakilan> jenisperwakilan;
    private static List<DaerahPemilihan> daerahPemilihan;
    private static List<Partai> partai;
    private static List<Anggota> anggota;
    private static List<DaftarPemilih> daftarpemilih;
    private static int idPemilihan;
    private static int idPartai;
    private static int idDapil;
    Scanner scan = new Scanner(System.in);

    public void setIdDapil(int idDapil) {
        this.idDapil = idDapil;
    }

    public void setIdPemilihan(int idPemilihan) {
        this.idPemilihan = idPemilihan;
    }

    public void setIdPartai(int idPartai) {
        this.idPartai = idPartai;
    }

    public List<Anggota> getAnggota() {
        return anggota;
    }

    private String getNamaPemilihanById(int idPemilihan) {
        for (JenisPerwakilan perwakilan : jenisperwakilan) {
            if (perwakilan.getIdPerwakilan() == idPemilihan) {
                return perwakilan.getNamaPerwakilan();
            }
        }
        return "";
    }

    // Method untuk mendapatkan objek Pemilihan
    static {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pemilihan", "root", "")) {
            // Load partai data
            partai = new ArrayList<>();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM partai");
            while (rs.next()) {
                int idPartai = rs.getInt("id_partai");
                String namaPartai = rs.getString("nama_partai");
                partai.add(new Partai(idPartai, namaPartai));
            }
            daerahPemilihan = new ArrayList<>();
            rs = stmt.executeQuery("SELECT * FROM daerahpemilihan");
            while (rs.next()) {
                int idDapil = rs.getInt("id_dapil");
                String namaDapil = rs.getString("daerah_pemilihan");
                daerahPemilihan.add(new DaerahPemilihan(idDapil, namaDapil));
            }

            anggota = new ArrayList<>();
            // Proses untuk mengisi list anggota dari hasil query
            rs = stmt.executeQuery("SELECT * FROM anggota JOIN partai ON anggota.id_partai = partai.id_partai");
            while (rs.next()) {
                int idAnggota = rs.getInt("id_anggota");
                int idPartai = rs.getInt("id_partai");
                String namaAnggota = rs.getString("nama_anggota");
                int jenisPerwakilan = rs.getInt("jenis_perwakilan");
                int jumlahSuara = rs.getInt("jumlah_suara");
                int idDapil = rs.getInt("id_dapil");
                anggota.add(new Anggota(idAnggota, idPartai, namaAnggota, jenisPerwakilan, jumlahSuara, idDapil));
            }

            daftarpemilih = new ArrayList<>();
            while (rs.next()) {
                int idPemilih = rs.getInt("id_pemilih");
                long NIK = rs.getLong("NIK");
                int levelPemilih = rs.getInt("level_pemilih");
                daftarpemilih.add(new DaftarPemilih(idPemilih, NIK, levelPemilih));
            }

            jenisperwakilan = new ArrayList<>();
            // Proses untuk mengisi list anggota dari hasil query
            rs = stmt.executeQuery("SELECT * FROM jenis_perwakilan");
            while (rs.next()) {
                int idPerwakilan = rs.getInt("id_perwakilan");
                String namaPerwakilan = rs.getString("nama_perwakilan");
                jenisperwakilan.add(new JenisPerwakilan(idPerwakilan, namaPerwakilan));
            }
        } catch (Exception e) {
            // Proses untuk menangani exception
        }
    }

    @Override
    public void tambahSuara(int idAnggota) {
        int jumlahSuaraBaru;
        idAnggota = idAnggota;

        // Koneksi ke database
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/pemilihan", "root", "")) {

            // Membuat statement
            Statement statement = connection.createStatement();

            // Mengambil jumlah suara saat ini dari anggota yang dipilih
            ResultSet result = statement
                    .executeQuery("SELECT jumlah_suara FROM anggota WHERE id_anggota = " + idAnggota);
            result.next();
            int jumlahSuaraSekarang = result.getInt("jumlah_suara");

            // Menambahkan 1 pada jumlah suara saat ini
            jumlahSuaraBaru = jumlahSuaraSekarang + 1;

            // Update jumlah suara di tabel anggota
            statement.executeUpdate(
                    "UPDATE anggota SET jumlah_suara = " + jumlahSuaraBaru + " WHERE id_anggota = " + idAnggota);
        } catch (SQLException e) {

            System.out.println("Terjadi kesalahan pada koneksi ke database: " + e.getMessage());
        }
    }

    public JenisPerwakilan getJenisPemilihan(int idPerwakilan) {

        for (JenisPerwakilan jp : jenisperwakilan) {
            if (jp.getIdPerwakilan() == idPerwakilan) {
                return jp;
            }
        }
        return null;
    }

    @Override
    public JenisPerwakilan getJenisPerwakilan(int idPerwakilan) {

        return jenisperwakilan.get(idPerwakilan);
    }

    @Override
    public Partai getPartai(int idPartai) {
        for (Partai p : partai) {
            if (p.getIdPartai() == idPartai) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Anggota getAnggota(int id) {
        return anggota.get(id);
    }

    @Override
    public DaerahPemilihan getDapil(int idDapil) {
        for (DaerahPemilihan dp : daerahPemilihan) {
            if (dp.getIdDapil() == idDapil) {
                return dp;
            }
        }
        return null;
    }

    @Override
    public DaftarPemilih getDaftarPemilih(int idPemilih) {
        return daftarpemilih.get(idPemilih);
    }

    @Override
    public void tampilkanJumlahSuara() {
        System.out.println("Masukkan jenis pemilihan yang ingin dilihat (1-4) : ");
        System.out.println("===================================================");
        System.out.println("1. DPR ");
        System.out.println("2. DPRD Provinsi ");
        System.out.println("3. DPRD Kab/Kota ");
        System.out.println("4. DPD ");
        System.out.println("0. Exit ");

        int jenisPerwakilan = scan.nextInt();

        if (jenisPerwakilan < 1 || jenisPerwakilan > 4) {
            if (jenisPerwakilan == 0) {
                System.out.println("Terima kasih telah menggunakan Aplikasi Pemilihan Presiden, \nDPR, DPRD Provinsi, DPRD Kabupaten/Kota dan DPD");
                System.exit(0);
            } else {
                System.out.println("Jenis pemilihan tidak valid. Silakan masukkan jenis pemilihan antara 1-4.");
                tampilkanJumlahSuara();
            }
        }
        // Input untuk menentukan kriteria pengurutan
        System.out.print(
                "Masukkan kriteria pengurutan \n1. Berdasarkan id Anggota \n2. Berdasarkan Nama \n3. Berdasarkan Jumlah Suara: \n4. Berdasarkan Partai \n5. Berdasarkan Id Dapil \n");
        int kriteria = scan.nextInt();
        if (kriteria < 1 || kriteria > 5) {
            System.out.println("Kriteria tidak valid. Silakan masukkan kriteria antara 1-5.");
            tampilkanJumlahSuara();
        }
        // Menyaring data anggota yang memiliki jenisPerwakilan sama dengan
        // jenisPerwakilan yang telah ditentukan
        List<Anggota> anggotaTerpilih = anggota.stream()
                .filter(anggota -> anggota.getJenisPerwakilan() == jenisPerwakilan)
                .collect(Collectors.toList());

        // Menentukan kriteria pengurutan data anggota
        switch (kriteria) {
            case 1:
                anggotaTerpilih.sort(
                        (anggota1, anggota2) -> Integer.compare(anggota1.getIdAnggota(), anggota2.getIdAnggota()));
                break;
            case 2:
                anggotaTerpilih
                        .sort((anggota1, anggota2) -> anggota1.getNamaAnggota().compareTo(anggota2.getNamaAnggota()));
                break;
            case 3:
                anggotaTerpilih.sort(
                        (anggota1, anggota2) -> Integer.compare(anggota1.getJumlahSuara(), anggota2.getJumlahSuara()));
                break;
            case 4:
                anggotaTerpilih
                        .sort((anggota1, anggota2) -> Integer.compare(anggota1.getIdPartai(), anggota2.getIdPartai()));
                break;
            case 5:
                anggotaTerpilih
                        .sort((anggota1, anggota2) -> Integer.compare(anggota1.getIdDapil(), anggota2.getIdDapil()));
                break;
        }

        System.out.println(
                "+---------+---------------------+---------------------------------------------------+----------------+------------------+-----------+");
        System.out.println(
                "| No urut | Nama Partai         | Nama Anggota                                      | Jumlah Suara   | Jenis Perwakilan | Id Dapil  |");
        System.out.println(
                "+---------+---------------------+---------------------------------------------------+----------------+-------------------+-----------+");

        // Menampilkan data anggota yang telah disortir berdasarkan jenisPerwakilan dan
        // kriteria pengurutan
        for (Anggota a : anggotaTerpilih) {
            // Mendapatkan nama partai dari objek Partai yang memiliki id_partai sama dengan
            // id_partai dari objek Anggota
            String namaPartai = partai.stream()
                    .filter(partai -> partai.getIdPartai() == a.getIdPartai())
                    .findFirst()
                    .map(Partai::getNamaPartai)
                    .orElse("Tidak ditemukan");

            // Mendapatkan nama daerah pemilihan dari objek DaerahPemilihan yang memiliki
            // id_dapil sama dengan id_dapil dari objek Anggota
            String namaPerwakilan = jenisperwakilan.stream()
                    .filter(perwakilan -> perwakilan.getIdPerwakilan() == a.getJenisPerwakilan())
                    .findFirst()
                    .map(JenisPerwakilan::getNamaPerwakilan)
                    .orElse("Tidak ditemukan");
            // Mendapatkan nama daerah pemilihan dari objek DaerahPemilihan yang memiliki
            // id_dapil sama dengan id_dapil dari objek Anggota
            String namaDapil = daerahPemilihan.stream()
                    .filter(dapil -> dapil.getIdDapil() == a.getIdDapil())
                    .findFirst()
                    .map(DaerahPemilihan::getNamaDapil)
                    .orElse("Tidak ditemukan");

            System.out.printf("| %-8s| %-20s| %-50s| %-14s | %-14s | %-14s |%n", a.getIdAnggota(), namaPartai,
                    a.getNamaAnggota(),
                    a.getJumlahSuara(), namaPerwakilan, namaDapil);

        }
        System.out.println(
                "+---------+---------------------+---------------------------------------------------+----------------+-------------------+-----------+");
        tampilkanJumlahSuara();

    }

}