
package PemilihanBaru;

import java.util.Scanner;
import java.sql.*;

// Kelas Main
public class Main {
    public static void main(String[] args) {
        RealPemilihan pemilihan = new RealPemilihan();

        int idPartai;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan No KTP: ");
            long noKTP = scanner.nextLong();

            // establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pemilihan", "root", "");
            // create statement
            Statement stmt = con.createStatement();
            // execute query untuk menangkap NIK dan id level dari tabel daftarpemilih
            ResultSet rs = stmt
                    .executeQuery("SELECT * FROM daftarpemilih WHERE NIK = '" + noKTP + "'");
            // Result set dengan query SELECT COUNT(*) as count FROM jenis_perwakilan

            // Mengecek jika noKTP terdaftar pada tabel daftarpemilih sebagai NIK maka
            // lanjutkan pengecekan levelPemilih
            if (rs.next()) {
                String nama = rs.getString("nama_pemilih");
                System.out.println("Selamat datang " + nama + " di Aplikasi Pemilihan Presiden, \nDPR, DPRD Provinsi, DPRD Kabupaten/Kota dan DPD");
                Thread.sleep(1000);
                int levelPemilih = rs.getInt("level_pemilih");
                int sudahmemilih = rs.getInt("sudahmemilih");
                int idPemilihan = 4;
                // Lakukan pemilihan dengan idPemilihan = 2 yaitu Pemilihan DPR

                if (levelPemilih == 1) {
                    if (sudahmemilih == 0) {
                        System.out.println(
                                "Mohon berhati-hati dalam melakukan pemilihan, karena pemilihan hanya dapat dilakukan sekali saja.");
                        String jawaban;
                        System.out.print("Apakah anda mengerti? y/t: ");
                        jawaban = scanner.next();
                        if (!jawaban.equals("y")) {
                            main(args);
                        } else {
                            // Update sudahmemilih
                            stmt.executeUpdate(
                                    "UPDATE daftarpemilih SET sudahmemilih = 1 WHERE NIK = " + noKTP);
                            Presiden presiden = Presiden.getPresiden();
                            presiden.dataPresiden();
                            presiden.pilihPresiden();
                            ProxyPemilihan proxyPemilihan = new ProxyPemilihan();
                            proxyPemilihan.daerahPemilihan();
                            for (int i = 1; i <= idPemilihan; i++) {
                                proxyPemilihan.jenisPemilihan(i);
                                proxyPemilihan.tampilkanPartai();
                                proxyPemilihan.tampilkanAnggota();
                            }
                            System.out
                                        .println("Terima kasih telah menggunakan Aplikasi Pemilihan Presiden, \nDPR, DPRD Provinsi, DPRD Kabupaten/Kota dan DPD");
                            
                        }
                    } else {
                        System.out.println("Maaf Anda sudah melakukan pemilihan");
                        System.out.println("Apa yang ingin anda lakukan? ");
                        System.out.println("=============================");
                        System.out.println("1. Input Ulang KTP");
                        System.out.println("2. Exit");
                        int lakukan = scanner.nextInt();
                        if (lakukan > 1 || lakukan < 2) {
                            if (lakukan == 1) {
                                main(args);
                            } else {
                                System.out
                                        .println("Terima kasih telah menggunakan Aplikasi Pemilihan Presiden, \nDPR, DPRD Provinsi, DPRD Kabupaten/Kota dan DPD");
                                System.exit(0);
                            }
                        }
                    }

                } else if (levelPemilih == 2) {
                    Presiden presiden = Presiden.getPresiden();
                    presiden.dataPresiden();
                    presiden.tampilDataPresiden();
                    ProxyHasilSuara proxyHasilSuara = new ProxyHasilSuara();

                    proxyHasilSuara.tampilkanSemuaSuara();

                }
            } else {
                System.out.println("No KTP tidak terdaftar silahkan masukkan ulang No KTP");
                // ulangi input no KTP
                main(args);
            }
            // close the connection
            con.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

    }
  
}
