# Laporan Hasil Praktikum

**Nama :** Ahmad Rizal Ali Pasha 
**Nim :** 254107020146 
**Kelas/Absen :** 1C/02 

## 2.1 Percobaan 1: Mengisi Elemen Array

**1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?**

jawaban nya adalah akan terjadi error karena deklarasi array berupa integer dan tidak dapat menerima tipe bilangan double (bilangan desimal) sehingga java akan menolak adanya perbedaan tipe data tersebut.

**2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.**

sudah dengan menambahkan kode int[] bil = {5, 13, -7, 17};

**4. Ubah statement pada langkah No 4 menjadi seperti berikut**
```
for (int i=0; i<4; i++) {
System.out.println(bil[i]);
}
```
**Apa keluaran dari program? Jelaskan maksud dari statement tersebut??**

jawaban nya adalah output yang dihasilkan sama dengan yang sebelum diubah karena itu adalah syntax looping yang bertugas untuk melakukan perintah yang sama berulang-ulang. syntax ini berfungsi untuk mencetak nilai bilangan array mulai dari i=0 sampai i<4 (0, 1, 2, 3) dan ini sudah sesuai dengan panjang nilai array yang ada sehingga nilai bilangan array akan muncul semua pada output.

**4. Jika kondisi pada statement for-loop di atas diubah menjadi: $i<=4$, apa keluaran dari program? Mengapa demikian?**

jawabannya adalah perulangan akan terjadi 5 kali (0, 1, 2, 3, 4) sedangkan panjang array 1d hanya 4 nilai sehingga ketika perulangan ke-5 dimulai yang akan terjadi adalah ArrayIndexOutOfBoundsException kareana nilai i=4 itu tidak ada dalam data array.

## 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD - Meminta Inputan Pengguna untuk Mengisi Elemen Array

**1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:**
```
for (int i=0; i<nilaiAkhir.length; i++) {
System.out.print("Masukkan nilai akhir ke-"+i+" : ");
nilaiAkhir[i] = sc.nextInt();
}
```
**Jalankan program. Apakah terjadi perubahan? Mengapa demikian?**

jawabanya adalah tidak terjadi perubahan dan program tetap berjalan sama persis dengan program sebelum nya. perbedaan nya terletak pada i<10 dan nilaiAkhir.length sebetulnya kedua hal ini hampir sama karena jika ditulis i<10 maka program akan melakukan looping sebanyak 10 kali dan kebetulan nilai itu sama dengan panjang data array. berbeda dengan nilaiAkhir.length hal ini akan menyebabkan looping berjalan sebanyak nilai data yang terdapat pada array dan tentunya ini lebih fleksibel dibandingkan dengan jika kita menulis manual karena bisa saja ada perbedaan nilai yang terdapat pada array.

**2.Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?**

seperti yangg telah jelaskan sebelumnya maksud dari namaVariabel.length itu adalah perintah atau atribut yang mengembalikan jumlah total elemen atau kapasitas dari array nilaiAkhir.Dan tentunya hal ini akan memastikan bahwa nilai for akan berulang sesuai dengan kapasitas dari array tersebut.

**Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):**
```
for (int i=0; i<nilaiAkhir.length; i++) {
    if (nilaiAkhir [i] > 70) {
        System.out.println("Mahasiswa ke-"+i+" lulus!");
    }
}
```
**Jalankan program dan jelaskan alur program!**

baik saya akan coba jelaskan alur program jadi pertama program akan melakukan looping sesuai dengan kapasitas array semisal i=0 kemudain syntax if akan melakukan pengecekan terhadap nilaiAkhi[0] apakah nilai yang dimiliki itu lebih dari 70 atau tidak jika pernyataan tersebut bernilai true maka program akan menampilkan Mahasiswa ke- i lulus!.

**4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:**

baik telah saya lakukan modifikasi dengan menambahkan 
```
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        // Blok ini dieksekusi jika nilai > 70 (Lulus)
        System.out.println("Mahasiswa ke-" + i + " lulus!"); 
    } else {
        // Blok ini dieksekusi jika nilai <= 70 (Tidak Lulus)
        System.out.println("Mahasiswa ke-" + i + " tidak lulus!"); 
    }
}
```

## 3 Percobaan 3: Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Aritmatika terhadap Elemen Array

**1.Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).**

baik saya akan melakukan perubahan sesuai dengan apa yang terlampir di kode program saya.

**2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:**

baik saya akan melakukan perubahan sesuai dengan apa yang terlampir di kode program saya.

## Percobaan 4: Searching

**1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.**

Pernyataan break; pada baris ke-10 digunakan untuk menghentikan secara paksa perulangan for segera setelah nilai yang dicari (key) ditemukan dalam array. Tujuan utamanya adalah untuk efisiensi waktu pemrosesan, karena pencarian tidak perlu dilanjutkan ke sisa elemen array.

**2Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari.**

suddah saya lakukan modifikasi sesuai dengan apa yang ada pada kode program saya.

**3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut:**

sudah saya lakukan modifikasi sesuai dengan apa yang ada pada kode program saya.