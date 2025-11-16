# 📘 Laporan Praktikum — Jobsheet 11: Array 2 Dimensi

Program Studi **Teknik Informatika**
Mata Kuliah **Dasar Pemrograman** – Politeknik Negeri Malang

---

## 🧪 Percobaan 1 — Deklarasi, Inisialisasi & Menampilkan Array 2 Dimensi

### **Jawaban Pertanyaan**

#### 1. Apakah pengisian elemen array harus dilakukan secara berurutan?

Tidak. Elemen array tidak wajib diisi dari indeks 0 secara berurutan selama indeks yang dipilih valid.

#### 2. Mengapa terdapat *null* pada daftar nama penonton?

Karena elemen `String` pada array belum diberikan nilai. Default tipe `String` adalah `null`.

#### 3. Melengkapi daftar penonton

**Sudah saya lakukan di dalam kode program saya.**

#### 4. Fungsi `penonton.length` dan `penonton[0].length`

* `penonton.length` → jumlah baris.
* `penonton[0].length` → jumlah kolom pada baris pertama.

**Apakah semua baris memiliki panjang sama?**
Ya, karena array dibuat dengan ukuran kolom tetap (2 kolom).

#### 5. Menampilkan panjang tiap baris (for loop)

**Sudah saya lakukan di dalam kode program saya.**

#### 6. Menampilkan panjang tiap baris (foreach loop)

**Sudah saya lakukan di dalam kode program saya.**

#### 7–9. Menampilkan nama penonton baris tertentu & seluruh baris

**Sudah saya lakukan di dalam kode program saya.**

#### 10. Kelebihan dan Kekurangan `foreach`

**Kelebihan:** lebih sederhana, mudah dibaca.
**Kekurangan:** tidak bisa mengakses indeks secara langsung dan kurang fleksibel untuk modifikasi tertentu.

#### 11. Indeks baris maksimal

`3` (karena jumlah baris = 4 → indeks 0–3)

#### 12. Indeks kolom maksimal

`1` (karena jumlah kolom = 2 → indeks 0–1)

#### 13. Fungsi `String.join()`

Menggabungkan beberapa string menjadi satu dengan pemisah tertentu.

---

## 🧪 Percobaan 2 — Input Scanner pada Array 2 Dimensi

### **Jawaban Pertanyaan**

#### 1. Apakah pengisian elemen array harus berurutan?

Tidak. Baris dan kolom dapat dipilih bebas selama indeks valid.

#### 2–5. Modifikasi sesuai instruksi

Semua modifikasi (menu, validasi kursi, peringatan kursi terisi, menampilkan `***` untuk kursi kosong)
**sudah saya lakukan di dalam kode program saya.**

---

## 🧪 Percobaan 3 — Array 2D dengan Panjang Baris Berbeda

### **Jawaban Pertanyaan**

#### 1. Penambahan kode

**Sudah saya lakukan di dalam kode program saya.**

#### 2. Fungsi `Arrays.toString()`

Menampilkan isi array dalam format string yang mudah dibaca.

#### 3. Nilai default array tipe `int`

`0`

#### 4. Penambahan kode

**Sudah saya lakukan di dalam kode program saya.**

#### 5. Apakah panjang array dapat diubah setelah dibuat?

Tidak. Ukuran array di Java bersifat tetap (*fixed size*).

---

## 🧪 Percobaan 4 — Studi Kasus SIAKAD

### **Jawaban Pertanyaan**

#### 1. Bagaimana jika jumlah siswa atau mata kuliah berubah?

Gunakan input dinamis dari pengguna untuk menentukan ukuran array.
**Sudah saya lakukan di dalam kode program saya.**

---

# 📝 Tugas Praktikum — Program Survei Kepuasan Pelanggan

Program dibuat untuk:

* Menyimpan jawaban 10 responden × 6 pertanyaan.
* Menghitung rata-rata per responden.
* Menghitung rata-rata per pertanyaan.
* Menghitung rata-rata keseluruhan.

Semua instruksi telah **saya implementasikan dalam kode program survei**.

---

# 📌 Kesimpulan

Pada Jobsheet 11 ini, saya mempelajari:

* Konsep dasar dan lanjutan array 2 dimensi.
* Perulangan `for` dan `foreach` untuk memproses array.
* Penggunaan `Scanner` untuk input 2D.
* Array dengan panjang baris tidak seragam.
* Studi kasus nyata seperti SIAKAD dan survei pelanggan.

Semua praktikum telah saya selesaikan dan saya memahami bagaimana array 2 dimensi digunakan dalam berbagai kasus pemrograman.
