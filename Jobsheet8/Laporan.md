# Laporan Hasil Praktikum

[cite_start]**Nama :** Ahmad Rizal Ali Pasha [cite: 2]
[cite_start]**Nim :** 254107020146 [cite: 3]
[cite_start]**Kelas/Absen :** 1C/02 [cite: 4]

---

## [cite_start]Percobaan 2.1: Review Perulangan 1 [cite: 5]

**1. Jika i=1 diubah menjadi i=0, apa akibatnya? [cite_start]Mengapa?** [cite: 6]

[cite_start]Akibatnya adalah program akan mencetak 6 bintang dikarenakan perulangan akan berjalan mulai dari 0 (i=0) dan akan terus berjalan sampai nilai n terpenuhi (n=5) dan 0 terhitung 1 sehingga total langkah ada 6 (0, 1, 2, 3, 4, 5). [cite: 7]

**2. Jika i<=n diubah menjadi i<n, bagaimana outputnya jika $n=5$? [cite_start]Mengapa?** [cite: 8]

[cite_start]jika input n=5 dan bagian loop i<=n diubah menjadi i<n maka program akan mencetak 4 bintang sebagai output hal ini bisa terjadi dikarenakan nilai i dimulai dari 1 (i=1) dan akan berjalan sampai nilai i kurang dari n (dalam kasus ini bernilai 5) maka nilai 5 tidak masuk karena tidak ada simbol “=” sehingga program akan berjalan sampai nilai n=4 dan program berjalan sebanyak 4 langkah (1, 2, 3, 4). [cite: 9]

**3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? [cite_start]Mengapa bisa demikian?** [cite: 10]

[cite_start]maka hasil dari perubahan tersebut adalah tidak ada perulangan yang terjadi. mengapa demikian? [cite: 11]
[cite_start]karena nilai i=1 dan nilai n di dalam program adalah 5 maka hal ini akan menghasilkan nilai false yang dimana 1>5 itu adalah salah maka program akan langsung keluar dari program looping [cite: 12]

**4. Jika i++ diubah menjadi i--, apa akibatnya? [cite_start]Mengapa?** [cite: 13]

[cite_start]maka akan terjadi looping yang terlalu banyak (bahkan ada yang bilang infinite loop) dalam hal ini bisa terjadi karena nilai i akan selalu lebih kecil (mengalami pengurangan dengan decrement) dari n (misal n=5), kondisi i<=n akan selalu bernilai true dan perulangan tidak akan pernah berhenti sampai mencapai batas nilai yang digunakan tipe data tersebut (integer) yang memiliki batas nilai negatif -2.147.483.648 dan ketika nilai looping i melebihi batas tersebut maka akan kembali ke data positif yaitu 2.147.483.648 dan nilai i akan melebihi n sehingga looping akan bernilai false dan terhenti. [cite: 14]

**5. Jika i++ diubah menjadi i+=2, bagaimana pola outputnya jika $n=6$? [cite_start]Apa penyebabnya?** [cite: 15]

[cite_start]jika i++ diubah jadi i+=2 maka nilai i yang berulang hanya angka ganjil di bawah 6 (1,2,5 karena batas looping sampai i<=n dan nilai n bernilai 6) karena setiap looping berhasil dilakukan nilai i akan bertambah 2 dan output yang keluar adalah bintang ganjil (baris pertama 1 bintang, baris kedua 3 bintang, dan baris ketiga 5 bintang) [cite: 16]

---

## [cite_start]Percobaan 2.2: Bintang Persegi [cite: 17]

**1. Outer loop: iOuter=1 diubah menjadi iOuter=0. Apa akibatnya? [cite_start]Mengapa?** [cite: 18]

[cite_start]Jika N=5, program akan mencetak 6 baris bintang (persegi panjang 6 x 5). [cite: 19]
[cite_start]Karena perulangan luar ( outer loop ) mengontrol jumlah baris . [cite: 20]
[cite_start]Dengan iOuter=0 dan kondisi iOuter<=N, loop akan berulang 6 kali (untuk iOuter = 0, 1, 2, 3, 4, 5). [cite: 21]

**2. Inner loop: i=1 diubah menjadi i=0. Apa akibatnya? [cite_start]Mengapa?** [cite: 22]

[cite_start]Jika N=5, program akan mencetak 6 bintang per baris (persegi panjang 5 x 6). [cite: 23]
[cite_start]Karena perulangan dalam ( inner loop ) mengontrol jumlah kolom (bintang per baris). [cite: 24]
Dengan i=0 dan i<=N, loop akan berulang 6 kali. (i=0, 1, 2, 3, 4, 5,) [cite_start][cite: 25]

**3. [cite_start]Apa perbedaan kegunaan perulangan luar dengan perulangan dalam?** [cite: 26]

[cite_start]dalam konteks tugas kali ini outer loop bertugas untuk mengontrol jumlah baris . [cite: 27]
[cite_start]sedangkan inner loop Bertugas untuk mengeksekusi perintah di dalam satu baris (pada kasus ini, mengontrol jumlah kolom ). [cite: 28]

**4. Mengapa perlu System.out.println();? [cite_start]Apa akibatnya jika dihilangkan?** [cite: 29]

[cite_start]Perintah sout ini berfungsi untuk pindah baris (memberi newline ) setelah inner loop selesai mencetak satu baris penuh. [cite: 30]
[cite_start]Jika Dihilangkan maka semua bintang akan dicetak dalam satu baris tunggal yang sangat panjang [cite: 31]

---

## [cite_start]Percobaan 2.3: Bintang Segitiga [cite: 32]

**1. [cite_start]Apakah output dengan n=5 sesuai dengan tampilan yang diharapkan?** [cite: 33]

[cite_start]Tidak sesuai. [cite: 34]

**2. Jika tidak sesuai, bagian mana yang harus diperbaiki/ditambahkan? [cite_start]Jelaskan.** [cite: 35]

[cite_start]tidak ada nya perintah System.out.println(); untuk pindah baris sehingga bintang tercetak dalam satu baris sehingga perlu ditambahkan perintah tersebut setelah blok while(j<i) selesai agar output sesuai dengan apa yang diinginkan. [cite: 36]
[cite_start]kemudian yang kedua adalah kode dimulai dengan i=0 sehingga menghasilkan output sebanyak 6 baris dengan baris pertamanya kosong karena bernilai 0 maka perlu diperbaiki dengan inisialisasi i=1 dan bukan 0 agar menghasilkan output yang sesuai dengan apa yang ada di dalam jobsheet [cite: 37]

**4. Jelaskan peran i dan j. Mengapa j di-set ulang ke 0? [cite_start]Apa terjadi jika j tidak di-reset?** [cite: 38]

* [cite_start]**Peran i:** Counter untuk perulangan luar (mengontrol jumlah baris). [cite: 39]
* [cite_start]**Peran j:** Counter untuk perulangan dalam (mengontrol jumlah bintang per baris). [cite: 40]
* [cite_start]**Mengapa j di-reset:** j harus di-reset ke 0 setiap kali perulangan luar akan dimulai (setiap ganti baris). [cite: 41] [cite_start]Ini agar penghitungan jumlah bintang untuk baris baru itu selalu dimulai dari awal. [cite: 42]
* [cite_start]**Jika tidak di-reset:** Jika j dideklarasikan di luar outer loop , nilainya akan terus bertambah. [cite: 43] [cite_start]Ini akan menyebabkan baris-baris berikutnya hanya mencetak 1 bintang (atau tidak sama sekali) karena kondisi j<i akan cepat menjadi false . [cite: 44]

---

## [cite_start]Percobaan 2.4: Studi Kasus Nilai [cite: 45]

**1. Jelaskan totalNilai di setiap iterasi outer loop. [cite_start]Mengapa inisialisasinya (totalNilai=0) di dalam, bukan di luar?** [cite: 46]

* [cite_start]**Apa yang terjadi:** Pada setiap iterasi outer loop (saat ganti kelompok), totalNilai di-reset kembali menjadi 0. Kemudian, inner loop mengakumulasi 5 nilai penilai ke dalam totalNilai. [cite: 47]
* [cite_start]**Mengapa di dalam:** Inisialisasi totalNilai = 0 harus ada di dalam outer loop karena totalNilai digunakan untuk menghitung total nilai per kelompok . [cite: 48]
* [cite_start]**Jika diletakkan di luar:** totalNilai tidak akan pernah di-reset. [cite: 49] [cite_start]Ini akan menyebabkan totalNilai Kelompok 2 adalah (total Kelompok 1 + total Kelompok 2), yang akan membuat perhitungan rata-rata salah. [cite: 50]

**2. [cite_start]Modifikasi program untuk mencari kelompok dengan rata-rata tertinggi.** [cite: 51]

[cite_start]**Logika:** Kita perlu dua variabel baru (di luar outer loop ) untuk menyimpan nilai rata-rata tertinggi sementara dan nomor kelompoknya. [cite: 52]

[cite_start]**Langkah Modifikasi:** [cite: 53]

1.  [cite_start]Sebelum outer loop `while(i<=6)`, deklarasikan: [cite: 54]
    ```java
    float rataTertinggi = 0;
    int kelompokTertinggi = 0;
    ```
    [cite_start][cite: 55]

2.  [cite_start]Di dalam outer loop , setelah menghitung `rataNilai`, tambahkan blok `if`: [cite: 56]
    ```java
    // ... (setelah menghitung rataNilai)
    System.out.println("Kelompok " + i + ": nilai rata-rata " + rataNilai);

    // Tampilkan dulu
    if (rataNilai > rataTertinggi) {
       rataTertinggi = rataNilai;
       kelompokTertinggi = i; // 'i' adalah nomor kelompok saat ini
    }
    i++;
    ```
    [cite_start][cite: 57, 58]

3.  [cite_start]Setelah outer loop selesai (di akhir program), cetak hasilnya: [cite: 59]
    ```java
    System.out.println("==============================================");
    System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTertinggi);
    System.out.println("Dengan nilai rata-rata: " + rataTertinggi);
    ```