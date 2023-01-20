Informasi singkat mengenai class :
1. Class Anggota 
Berisi class yang secara tidak langsung menampung tabel anggota pada database pemilihan.

2. Class DaerahPemilihan 
Berisi class yang secara tidak langsung menampung tabel daerahpemilihan pada database pemilihan.

3. Class DaftarPemilih
Berisi class yang secara tidak langsung menampung tabel daftarpemilih pada database pemilihan.

4. Class JenisPerwakilan
Berisi class yang secara tidak langsung menampung tabel jenis_perwakilan pada database pemilihan.

5. Class Partai
Berisi class yang secara tidak langsung menampung tabel partai pada database pemilihan.

6. Class Presiden
Berisi class yang mempunyai pola desain Singleton
Melakukan pemanggilan, penyimpanan dan update data untuk tabel Presiden pada database pemilihan.

7. Class Interface PartaiFactory
Berisi class yang mempunyai pola desain Factory Method.

8. Class PartaiFactoryImpl
Adalah Class yang mengimplementasikan Class PartaiFactory dalam pembuatan objek.
Class ini yang secara langsung melakukan koneksi ke database dan menyimpannya menjadi suatu variabel list sesuai dengan nama class nya.
Class ini juga berfungsi untuk memproses output dari jumlah suara yang akan ditampilkan.

9. Class Interface Pemilihan
Berisikan method-method yang akan diimplementasikan sebagai pola desain Proxy.

10. Class RealPemilihan
Class ini mengimplementasikan Class Pemilihan sebagai proses sebenarnya yang terjadi pada Class Pemilihan atau desain Proxy yang dibuat.
Seperti memilih daerahpemilihan, mengubah jenispemilihan, memilih partai, dan memilih anggota.
Sedangkan fungsi untuk menampilkan hasilsuara akan dialihkan ke Class PartaiFactoryImpl.

11. Class ProxyPemilihan
Class ini mengimplementasikan Class Pemilihan, namun pada kenyataannya melakukan pembuatan objek Real Pemilihan.
Yang mana pada Class ini akan dilakukan pembatasan yaitu khusus untuk melakukan pemilihan.

12. Class ProxyHasilSuara
Class ini mengimplementasikan Class Pemilihan, namun pada kenyataannya melakukan pembuatan objek Real Pemilihan.
Yang mana pada Class ini akan dilakukan pembatasan yaitu khusus untuk melihat hasil suara.

13. Main Class
Class ini merupakan class utama yang berfungsi menjalankan program, menginstansiasi objek, memanggil objek atau class yang diperlukan 
dan melakukan pengecekan terhadap pemilih.
