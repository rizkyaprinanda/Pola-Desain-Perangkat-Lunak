package PemilihanBaru;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// Kelas RealPemilihan
public class RealPemilihan implements Pemilihan {

    PartaiFactoryImpl partaiFactory = new PartaiFactoryImpl();
    Scanner input = new Scanner(System.in);
    public int idPartai;
    public int idPemilihan;
    public int idDapil;
    private String jenisPemilihan;

    public void daerahPemilihan() {

        try {
            System.out.println("Silahkan Pilih Daerah Pemilihan");
            System.out.println("=======================");
            Thread.sleep(3000);
            int totalDapil = 34;
            for (int i = 1; i <= totalDapil; i++) {
                DaerahPemilihan daerahPemilihan = partaiFactory.getDapil(i);
                System.out.println(i + ". " + daerahPemilihan.getNamaDapil());
            }
            System.out.print("Masukkan nomor urut daerah pemilihan: ");
            idDapil = input.nextInt();
            if (idDapil <= totalDapil) {
                DaerahPemilihan daerahPemilihan = partaiFactory.getDapil(idDapil);
                System.out.println("Nama daerah pemilihan: " + daerahPemilihan.getNamaDapil());
                Thread.sleep(1000);
            } else {
                System.out.println("Pilihan partai tidak valid, Silahkan pilih kembali");
                daerahPemilihan();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(RealPemilihan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jenisPemilihan(int idPemilihan) {

        this.idPemilihan = idPemilihan;
        switch (idPemilihan) {
            case 1:
                jenisPemilihan = "DPR";
                System.out.println("Pemilihan " + jenisPemilihan);
                break;
            case 2:
                jenisPemilihan = "DPRD Provinsi";
                System.out.println("Pemilihan " + jenisPemilihan);
                break;
            case 3:
                jenisPemilihan = "DPRD Kabupaten/Kota";
                System.out.println("Pemilihan " + jenisPemilihan);
                break;
            case 4:
                jenisPemilihan = "DPD";
                System.out.println("Pemilihan " + jenisPemilihan);
                break;
        }
    }

    public void tampilkanPartai() {
        if (idPemilihan == 4) {
            idPartai = 0;
        } else {
            try {
                System.out.println("Silahkan Pilih Partai");
                System.out.println("=======================");
                Thread.sleep(1000);
                int totalPartai = 4;
                for (int i = 1; i <= totalPartai; i++) {
                    Partai partai = partaiFactory.getPartai(i);
                    System.out.println(i + ". " + partai.getNamaPartai());
                }
                System.out.print("Masukkan nomor urut partai: ");
                idPartai = input.nextInt();
                if (idPartai <= totalPartai) {
                    Partai partai = partaiFactory.getPartai(idPartai);
                    System.out.println("Nama partai: " + partai.getNamaPartai());
                    Thread.sleep(3000);
                } else {
                    System.out.println("Pilihan partai tidak valid, Silahkan pilih kembali");
                    tampilkanPartai();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(RealPemilihan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void tampilkanAnggota() {
        try {
            System.out.println("Silahkan pilih calon Anggota " + jenisPemilihan + " yang tersedia: ");
            System.out.println("==============================================");
            partaiFactory.setIdDapil(idDapil);
            partaiFactory.setIdPemilihan(idPemilihan);
            partaiFactory.setIdPartai(idPartai);
            Thread.sleep(2000);
            int totalAnggota = 0;
            int[] idAnggota = new int[partaiFactory.getAnggota().size()];
            int i = 0;
            for (Anggota anggota : partaiFactory.getAnggota()) {
                if (anggota.getIdPartai() == idPartai && anggota.getJenisPerwakilan() == idPemilihan
                        && anggota.getIdDapil() == idDapil) {
                    totalAnggota++;
                    idAnggota[i] = anggota.getIdAnggota();
                    System.out.println(totalAnggota + ". " + anggota.getNamaAnggota());
                    i++;
                }
            }
            System.out.print("Masukkan nomor urut anggota: ");
            int pilihAnggota = input.nextInt();
            if (pilihAnggota > 0 && pilihAnggota <= totalAnggota) {
                int idAnggotaDipilih = idAnggota[pilihAnggota - 1];
                // mencari nama anggota yang dipilih
                for (Anggota anggota : partaiFactory.getAnggota()) {
                    if (anggota.getIdAnggota() == idAnggotaDipilih) {
                        String namaAnggotaDipilih = anggota.getNamaAnggota();
                        System.out.println("Anggota " + jenisPemilihan + " yang dipilih adalah " + namaAnggotaDipilih);
                        System.out.println("==============================================");
                        System.out.println("==============================================");
                        partaiFactory.tambahSuara(idAnggotaDipilih);
                        Thread.sleep(3000);
                        break;
                    }
                }
            } else {
                System.out.println("Pilihan anggota " + jenisPemilihan + " tidak valid, Silahkan pilih kembali");
                System.out.println("1. Pilih Partai");
                System.out.println("2. Pilih Anggota");
                int pilihUlang = input.nextInt();
                if (pilihUlang == 1) {
                    tampilkanPartai();
                    tampilkanAnggota();
                } else if (pilihUlang == 2) {
                    tampilkanAnggota();
                } else {
                    tampilkanAnggota();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(RealPemilihan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tampilkanSemuaSuara() {
        partaiFactory.tampilkanJumlahSuara();
    }

}
