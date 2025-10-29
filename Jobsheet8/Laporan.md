# Laporan Hasil Praktikum

**Nama :** Ahmad Rizal Ali Pasha 
**Nim :** 254107020146 
**Kelas/Absen :** 1C/02 

---

## Percobaan 2.1: Review Perulangan 1 

**1. Jika i=1 diubah menjadi i=0, apa akibatnya? Mengapa?** 

Akibatnya adalah program akan mencetak 6 bintang dikarenakan perulangan akan berjalan mulai dari 0 (i=0) dan akan terus berjalan sampai nilai n terpenuhi (n=5) dan 0 terhitung 1 sehingga total langkah ada 6 (0, 1, 2, 3, 4, 5). 

**2. Jika i<=n diubah menjadi i<n, bagaimana outputnya jika $n=5$? Mengapa?** 

jika input n=5 dan bagian loop i<=n diubah menjadi i<n maka program akan mencetak 4 bintang sebagai output hal ini bisa terjadi dikarenakan nilai i dimulai dari 1 (i=1) dan akan berjalan sampai nilai i kurang dari n (dalam kasus ini bernilai 5) maka nilai 5 tidak masuk karena tidak ada simbol “=” sehingga program akan berjalan sampai nilai n=4 dan program berjalan sebanyak 4 langkah (1, 2, 3, 4). 

**3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?** 

maka hasil dari perubahan tersebut adalah tidak ada perulangan yang terjadi. mengapa demikian? 
karena nilai i=1 dan nilai n di dalam program adalah 5 maka hal ini akan menghasilkan nilai false yang dimana 1>5 itu adalah salah maka program akan langsung keluar dari program looping 

**4. Jika i++ diubah menjadi i--, apa akibatnya? Mengapa?** 

maka akan terjadi looping yang terlalu banyak (bahkan ada yang bilang infinite loop) dalam hal ini bisa terjadi karena nilai i akan selalu lebih kecil (mengalami pengurangan dengan decrement) dari n (misal n=5), kondisi i<=n akan selalu bernilai true dan perulangan tidak akan pernah berhenti sampai mencapai batas nilai yang digunakan tipe data tersebut (integer) yang memiliki batas nilai negatif -2.147.483.648 dan ketika nilai looping i melebihi batas tersebut maka akan kembali ke data positif yaitu 2.147.483.648 dan nilai i akan melebihi n sehingga looping akan bernilai false dan terhenti. 

**5. Jika i++ diubah menjadi i+=2, bagaimana pola outputnya jika n=6? Apa penyebabnya?** 

jika i++ diubah jadi i+=2 maka nilai i yang berulang hanya angka ganjil di bawah 6 (1,2,5 karena batas looping sampai i<=n dan nilai n bernilai 6) karena setiap looping berhasil dilakukan nilai i akan bertambah 2 dan output yang keluar adalah bintang ganjil (baris pertama 1 bintang, baris kedua 3 bintang, dan baris ketiga 5 bintang) 

---

## Percobaan 2.2: Bintang Persegi 

**1. Outer loop: iOuter=1 diubah menjadi iOuter=0. Apa akibatnya? Mengapa?** 

Jika N=5, program akan mencetak 6 baris bintang (persegi panjang 6 x 5). 
Karena perulangan luar ( outer loop ) mengontrol jumlah baris . 
Dengan iOuter=0 dan kondisi iOuter<=N, loop akan berulang 6 kali (untuk iOuter = 0, 1, 2, 3, 4, 5). [cite: 21]

**2. Inner loop: i=1 diubah menjadi i=0. Apa akibatnya? Mengapa?** 

Jika N=5, program akan mencetak 6 bintang per baris (persegi panjang 5 x 6). 
Karena perulangan dalam ( inner loop ) mengontrol jumlah kolom (bintang per baris). 
Dengan i=0 dan i<=N, loop akan berulang 6 kali. (i=0, 1, 2, 3, 4, 5,)

**3. Apa perbedaan kegunaan perulangan luar dengan perulangan dalam?**

dalam konteks tugas kali ini outer loop bertugas untuk mengontrol jumlah baris . 
sedangkan inner loop Bertugas untuk mengeksekusi perintah di dalam satu baris (pada kasus ini, mengontrol jumlah kolom ).

**4. Mengapa perlu System.out.println();? Apa akibatnya jika dihilangkan?** 
Perintah sout ini berfungsi untuk pindah baris (memberi newline ) setelah inner loop selesai mencetak satu baris penuh. 
Jika Dihilangkan maka semua bintang akan dicetak dalam satu baris tunggal yang sangat panjang 

---

## Percobaan 2.3: Bintang Segitiga 

**1. Apakah output dengan n=5 sesuai dengan tampilan yang diharapkan?** 
Tidak sesuai. 
**2. Jika tidak sesuai, bagian mana yang harus diperbaiki/ditambahkan? Jelaskan.** 

tidak ada nya perintah System.out.println(); untuk pindah baris sehingga bintang tercetak dalam satu baris sehingga perlu ditambahkan perintah tersebut setelah blok while(j<i) selesai agar output sesuai dengan apa yang diinginkan. 
kemudian yang kedua adalah kode dimulai dengan i=0 sehingga menghasilkan output sebanyak 6 baris dengan baris pertamanya kosong karena bernilai 0 maka perlu diperbaiki dengan inisialisasi i=1 dan bukan 0 agar menghasilkan output yang sesuai dengan apa yang ada di dalam jobsheet

**4. Jelaskan peran i dan j. Mengapa j di-set ulang ke 0? [cite_start]Apa terjadi jika j tidak di-reset?**

* **Peran i:** Counter untuk perulangan luar (mengontrol jumlah baris).
* **Peran j:** Counter untuk perulangan dalam (mengontrol jumlah bintang per baris). 
* **Mengapa j di-reset:** j harus di-reset ke 0 setiap kali perulangan luar akan dimulai (setiap ganti baris). Ini agar penghitungan jumlah bintang untuk baris baru itu selalu dimulai dari awal. 
* **Jika tidak di-reset:** Jika j dideklarasikan di luar outer loop , nilainya akan terus bertambah. Ini akan menyebabkan baris-baris berikutnya hanya mencetak 1 bintang (atau tidak sama sekali) karena kondisi j<i akan cepat menjadi false . 

---

## Percobaan 2.4: Studi Kasus Nilai 

**1. Jelaskan totalNilai di setiap iterasi outer loop. Mengapa inisialisasinya (totalNilai=0) di dalam, bukan di luar?** 

* **Apa yang terjadi:** Pada setiap iterasi outer loop (saat ganti kelompok), totalNilai di-reset kembali menjadi 0. Kemudian, inner loop mengakumulasi 5 nilai penilai ke dalam totalNilai.
* **Mengapa di dalam:** Inisialisasi totalNilai = 0 harus ada di dalam outer loop karena totalNilai digunakan untuk menghitung total nilai per kelompok . 
* **Jika diletakkan di luar:** totalNilai tidak akan pernah di-reset.  Ini akan menyebabkan totalNilai Kelompok 2 adalah (total Kelompok 1 + total Kelompok 2), yang akan membuat perhitungan rata-rata salah.

**2. Modifikasi program untuk mencari kelompok dengan rata-rata tertinggi.** 

**Logika:** Kita perlu dua variabel baru (di luar outer loop ) untuk menyimpan nilai rata-rata tertinggi sementara dan nomor kelompoknya.

**Langkah Modifikasi:** 

1.  Sebelum outer loop `while(i<=6)`, deklarasikan: 
    ```java
    float rataTertinggi = 0;
    int kelompokTertinggi = 0;
    ```
    
2.  Di dalam outer loop , setelah menghitung `rataNilai`, tambahkan blok `if`: 
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

3.  Setelah outer loop selesai (di akhir program), cetak hasilnya: 
    ```java
    System.out.println("==============================================");
    System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTertinggi);
    System.out.println("Dengan nilai rata-rata: " + rataTertinggi);
    ```