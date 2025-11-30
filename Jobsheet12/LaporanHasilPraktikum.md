# Laporan Hasil Praktikum

**Nama :** Ahmad Rizal Ali Pasha 
**Nim :** 254107020146 
**Kelas/Absen :** 1C/02 

## 2.1 Percobaan 1: Membuat Fungsi Tanpa Parameter

**1. Apakah fungsi tanpa parameter selalu harus bertipe void?**

Tidak. Fungsi hanya bertipe void jika tidak mengembalikan nilai. Fungsi tanpa parameter bisa mengembalikan tipe data lain (misalnya int) jika tugasnya adalah menghasilkan nilai yang statis.

**2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!**

Ya. Daftar menu dapat ditampilkan tanpa menggunakan fungsi Menu() dan modifikasi: Sudah saya lakukan di dalam kode program saya.

**3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.**

Keuntungan: Reusabilitas (dapat dipanggil di mana saja), Modularitas (kode terstruktur), dan Perawatan (memudahkan perubahan pada menu).

**4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).**

Program dimulai dari main(). Ketika Menu() dipanggil, kontrol eksekusi berpindah ke fungsi Menu(). Perintah di dalamnya dieksekusi, lalu kontrol kembali ke main() setelah selesai.

## Percobaan 2: Membuat Fungsi Dengan Parameter

**1. Apakah kegunaan parameter di dalam fungsi?**

Untuk menerima nilai masukan (input) yang bersifat dinamis dari luar fungsi.

**2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?**

Karena informasi nama pelanggan (String) dan status member (boolean) bersifat dinamis dan diperlukan untuk menampilkan output yang berbeda-beda dan dipersonalisasi.

**3. Apakah parameter sama dengan variabel? Jelaskan.**

Parameter mirip variabel, tetapi parameter adalah variabel lokal khusus yang fungsinya hanya untuk menerima dan menampung nilai argumen yang diteruskan saat fungsi dipanggil.

**4. Jelaskan bagaimana cara kerja parameter isMember... Apa perbedaan output ketika i sMember bernilai true dan ketika false?**

Parameter isMember bekerja sebagai kondisi pada pernyataan if. Jika true, pesan diskon member ditampilkan. Jika false, pesan tersebut akan dilewati.

**5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?**

Akan terjadi Error Kompilasi (Compile-Time Error) karena method signature fungsi Menu() mengharuskan adanya argumen.

**6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.**

Modifikasi: Sudah saya modifikasi dengan program KafeNoAbsen.java.

**7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.**

Sudah dengann kode: Menu("Budi", true, "DISKON30");

**8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.**

Ya. Parameter membuat fungsi menjadi fleksibel dan mudah diadaptasi tanpa perlu mengubah kode internalnya.

## Percobaan 3: Membuat Fungsi dengan Nilai Kembalian

**1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.**

* Nilai Kembalian (Bukan void): Dibutuhkan ketika fungsi menghitung atau menghasilkan nilai yang perlu digunakan oleh fungsi pemanggil. (Contoh: hitungTotalHarga).
* Tidak Perlu (void): Dibutuhkan ketika fungsi hanya melakukan aksi (seperti mencetak output) tanpa mengembalikan data. (Contoh: Menu).

**2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.**

* Tipe Kembalian: int (atau double).
* Parameter 1: pilihanMenu (int), artinya nomor urut menu yang dipilih.
* Parameter 2: banyakItem (int), artinya jumlah porsi yang dipesan.

**3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.**

Modifikasi: Sudah saya modifikasi dengan program KafeNoAbsen.java.

**4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?**

Modifikasi: Sudah saya modifikasi dengan program KafeNoAbsen.java.

## Percobaan 4: Fungsi Varargs

**1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!**

Penulisan dengan tanda elipsis (...) menunjukkan bahwa namaPengunjung adalah parameter Varargs (Variable Arguments). Ini memungkinkan fungsi daftarPengunjung untuk menerima nol atau lebih argumen bertipe String saat dipanggil, dan argumen tersebut diperlakukan sebagai array di dalam fungsi.

**2. Modifikasi method daftarPengunjung menggunakan for-each loop**

Sudah dengan kode: 
```
static void daftarPengunjung (String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for(String nama : namaPengunjung) {
        System.out.println("-" + nama);
    }
}
```

**3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!**

Tidak bisa. Aturan di Java menyatakan bahwa sebuah fungsi hanya boleh memiliki satu parameter varargs, dan parameter tersebut harus diletakkan di posisi terakhir dalam daftar parameter fungsi.
Alasan: Jika ada dua varargs, kompilator tidak akan tahu argumen mana yang termasuk varargs pertama dan argumen mana yang termasuk varargs kedua.

**4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?**

Program akan tetap berjalan (tidak ada error kompilasi maupun runtime error).

Output yang dihasilkan: Hanya pesan header yang dicetak.

Daftar Nama Pengunjung:
Penjelasan: Ketika dipanggil tanpa argumen, namaPengunjung diperlakukan sebagai array kosong dengan panjang nol (length = 0). Perulangan (for loop atau for-each loop) tidak akan dieksekusi, sehingga hanya baris pertama (System.out.println("Daftar Nama Pengunjung:");) yang ditampilkan.

## Percobaan 5: Pembuatan Kode Program, dengan Fungsi versus Tanpa Fungsi

**1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!**

main() dimulai. 2. Input p, l, t dibaca. 3. main() memanggil hitungLuas(p, l). 4. Hasil luas dicetak. 5. main() memanggil hitungVolume(t, p, l), yang di dalamnya memanggil hitungLuas lagi. 6. Hasil volume dicetak.

**2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.**

Output: Luas Persegi Panjang adalah 12. Volume Balok adalah 60.
Alur Singkat: hitungLuas(4, 3) menghasilkan 12. hitungVolume(5, 4, 3) menghitung 12 x 5 = 60.

**3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!**

Output yang dihasilkan program tersebut adalah deretan angka **1234567**.

```
1234567
```
Alur Jalannya Program:
Program dieksekusi melalui serangkaian pemanggilan fungsi bersarang (nested calls):
1.  **Mulai di `main()`:**
      * Eksekusi dimulai dari `public static void main(String[] args)`.
2.  **Panggilan `Jumlah(1, 1)`:**
      * Baris `int temp = Jumlah(1, 1);` dieksekusi.
      * Kontrol berpindah ke fungsi `Jumlah(int bil1, int bil2)`.
      * Fungsi ini menghitung 1 + 1 dan mengembalikan nilai **2**.
      * Nilai **2** disimpan di variabel `temp`.
3.  **Panggilan `TampilJumlah(temp, 5)`:**
      * Baris `TampilJumlah(temp, 5);` dieksekusi, dengan argumen $(2, 5)$.
      * Kontrol berpindah ke fungsi `TampilJumlah(int bil1, int bil2)`.
4.  **Panggilan `Jumlah(bil1, bil2)` di dalam `TampilJumlah`:**
      * Di dalam `TampilJumlah`, fungsi `Jumlah(2, 5)` dipanggil.
      * Fungsi `Jumlah` menghitung 2 + 5 dan mengembalikan nilai **7**.
5.  **Panggilan `TampilHinggaKei(7)`:**
      * Nilai **7** digunakan sebagai argumen untuk memanggil `TampilHinggaKei(7)`.
      * Kontrol berpindah ke fungsi `TampilHinggaKei(int i)`.
6.  **Eksekusi Perulangan:**
      * Di dalam `TampilHinggaKei`, perulangan `for (int j=1; j<=i; j++)` (yaitu j \le 7) berjalan.
      * Setiap nilai j (dari 1 hingga 7) dicetak menggunakan `System.out.print(j)`, yang menghasilkan output **1234567**.
7.  **Selesai:** Setelah perulangan selesai, kontrol kembali ke fungsi pemanggil (hingga `main`), dan program berakhir.

**4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!**

* Parameter: Digunakan ketika fungsi memerlukan data dinamis (Contoh: panjang/lebar). Tidak digunakan jika tugas statis (Contoh: menampilkan menu standar).
* Nilai Kembalian: Digunakan ketika fungsi menghitung nilai yang akan dipakai pemanggil (Contoh: hitungLuas). Tidak digunakan (void) jika fungsi hanya melakukan aksi (Contoh: mencetak output).

**5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.**

Fungsi wajib menggunakan parameter karena nilai luas dan volume sepenuhnya bergantung pada dimensi masukan yang berubah-ubah.

**6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.**

Fungsi hitungLuas dan hitungVolume harus mengembalikan nilai karena tujuannya adalah menyediakan hasil perhitungan kepada fungsi main. Fungsi main bertipe void karena bertindak sebagai pengontrol alur program, bukan penghasil nilai yang dikembalikan ke sistem.