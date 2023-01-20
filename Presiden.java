package PemilihanBaru;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Kelas Presiden
public class Presiden {
    private static Presiden instance;
    private static List<Presiden> presiden;
    private int idCapres;
    private String namaCapres;
    private int jumlahSuara;
    private Scanner scanner = new Scanner(System.in);
    private static Connection conn;

    
        public Presiden(int idCapres, String namaCapres, int jumlahSuara) {
        this.idCapres = idCapres;
        this.namaCapres = namaCapres;
        this.jumlahSuara = jumlahSuara;
    }
            private Presiden(){}



    public static Presiden getPresiden() {
        if (instance == null) {
            instance = new Presiden();
        }
        return instance;
    }

    public void dataPresiden() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/pemilihan", "root", "");
            presiden = new ArrayList<>();
            String query = "SELECT * FROM presiden";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idCapres = rs.getInt("id_capres");
                String namaCapres = rs.getString("nama_capres");
                int jumlahSuara = rs.getInt("jumlah_suara");
                 presiden.add(new Presiden(idCapres, namaCapres, jumlahSuara));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void pilihPresiden() throws InterruptedException {
        System.out.println("Silahkan Pilih Calon Presiden:");
        System.out.println("=======================");
        Thread.sleep(1000);
        for (int i = 0; i < presiden.size(); i++) {
            System.out.println((i + 1) + ". " + presiden.get(i).getNamaCapres());
        }
        System.out.print("Masukkan nomor urut Calon Presiden: ");
        int pilihan = scanner.nextInt();
        if (pilihan <= 0 || pilihan > presiden.size()) {
            System.out.println("Pilihan calon presiden tidak valid, silahkan pilih kembali");
            pilihPresiden();
            
        } else {
            idCapres = presiden.get(pilihan - 1).getIdCapres();
            namaCapres = presiden.get(pilihan - 1).getNamaCapres();
            jumlahSuara = presiden.get(pilihan - 1).getJumlahSuara();
            System.out.println("Presiden yang anda pilih adalah " + namaCapres);
            Thread.sleep(3000);
            updateJumlahSuara();
        }
    }

    private void updateJumlahSuara() {
        try {
            String query = "UPDATE presiden SET jumlah_suara = ? WHERE id_capres = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, jumlahSuara + 1);
            stmt.setInt(2, idCapres);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void tampilDataPresiden() {
    System.out.println("+--------------+---------------------------+----------------+");
    System.out.println("|  ID Capres   |  Nama Calon Presiden      | Jumlah Suara   |");
    System.out.println("+--------------+---------------------------+----------------+");
    for (int i = 0; i < presiden.size(); i++) {
        System.out.printf("| %12d | %-25s | %14d |\n", i+1, presiden.get(i).getNamaCapres(), presiden.get(i).getJumlahSuara());
    }
    System.out.println("+--------------+---------------------------+----------------+");
}



        public void setIdCapres(int idCapres) {
        this.idCapres = idCapres;
    }

    public void setNamaCapres(String namaCapres) {
        this.namaCapres = namaCapres;
    }

    public void setJumlahSuara(int jumlahSuara) {
        this.jumlahSuara = jumlahSuara;
    }
    
    public int getIdCapres() {
        return idCapres;
    }

    public String getNamaCapres() {
        return namaCapres;
    }

    public int getJumlahSuara() {
        return jumlahSuara;
    }

}
