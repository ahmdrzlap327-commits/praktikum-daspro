# Laporan Hasil Praktikum

**Nama :** Ahmad Rizal Ali Pasha 
**Nim :** 254107020146 
**Kelas/Absen :** 1C/02 

## 2.1 Percobaan 1

**1. Apa yang dimaksud dengan fungsi rekursif?**

Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri di dalam tubuh fungsinya untuk menyelesaikan masalah dengan memecahnya menjadi sub-masalah yang lebih kecil hingga mencapai kondisi dasar (base case).

**2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!**

* Hasil nya sama
* iteratif: Menggunakan perulangan (for loop). Proses berjalan linear dari n turun ke 1 (atau sebaliknya) dalam satu bingkai fungsi.
* rekursif: Menggunakan pemanggilan fungsi. Setiap panggilan membuat "tumpukan" (stack) baru di memori. Proses menumpuk panggilan hingga n=0 (base case), lalu nilai dikembalikan (return) secara berurutan dari tumpukan paling atas ke bawah.

## 2.2 Percobaan 2: Pangkat

**1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!**

Proses pemanggilan fungsi akan terus berjalan (melakukan rekursi) hingga nilai parameter y (pangkat) berkurang menjadi 0. Saat y == 0, fungsi mencapai base case dan mengembalikan nilai 1, menghentikan rekursi.

**2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32**

sudah dengan kode
```
static int hitungPangkat(int x, int y) {
    if (y == 0) {
        System.out.print("1 = "); // Mencetak ujung deret
        return 1;
    } else {
        System.out.print(x + "x"); // Mencetak bilangan
        return x * hitungPangkat(x, y - 1);
    }
}
```

## 2.3 Percobaan 3

**1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!**

* Base Case: if (tahun == 0) { return (saldo); } .
* Recursion Call: return (1.11 * hitungLaba(saldo, tahun - 1));

**2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)**

* fase ekpansi
- hitung laba (100000, 3) memanggil 1.11 * hitung laba (100000, 3-1)
- hitung laba (100000, 2) memanggil 1.11 * hitung laba (100000, 2-1) 
- hitung laba (100000, 1) memanggil 1.11 * hitung laba (100000, 1-1)
- hitung laba (100000, 0) mencapai base case maka return 100000

* fase subtitusi
- mulai dari tahun 1 = 1.11 * 100000 = 111000
- tahun 2 = 1.11 * 111000 (tahun 1) = 123210
- tahun 3 = 1.11 * 123210 (tahun 2) = 136763,1 (Hasil akhir)

## TUGAS 3
tugas 3 sudah saya lampirkan pada kode program dengan nama file tugas.java