# Laporan Praktikum Dasar Pemrograman jobsheet 6
### nama        : Ahmad Rizal Ali Pasha
### absen/kelas : 02/1C
### nim         : 254107020146

## percobaan 2.1
Soal: 
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
```
if (nilai > tertinggi) { 
    tertinggi = nilai; 
} 
if (nilai < terendah) { 
    terendah = nilai; 
} 
```
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!
5. Commit dan push kode program ke Github

Jawab:
1.  inisialisasi (Initialization): int i = 1.
    kondisi (Condition): i <= 10.
    Update/Increment: i++.
2. Inisialisasi tertinggi = 0 dan terendah = 100 hal Ini dilakukan karena agar nilai mahasiswa pertama dan selanjutnya akan menggantikan nilai awal tersebut dan menjadikan standar tertinggi dan terendah sesuai data nilai yang ada. Jika dibalik (tertinggi = 100, terendah = 0), maka kemungkinan yang terjadi adalah program hanya menampilkan nilai tertinggi = 100 dan terendah = 0 meskipun tidak ada nilai mahasiswa yang mencapai kedua nilai tersebut, hal ini terjadi karena batas nilai tertinggi dan terendah mencapai nilai maksimum (tertinggi = 100 dan terendah = 0) jadi perlu dibalik sehingga nilai tertinggi dan ternedah mahasiswa dapat disesuaikan kembali dengan data yang ada. 
3. Potongan kode itu  berfungsi untuk memperbarui nilai tertinggi atau terendah. Jadi jika ada nilai yang baru dimasukkan dan nilai tersebut lebih besar dari tertinggi saat ini, maka nilai tertinggi akan diganti dengan nilai baru tersebut. sama hal nya ketika ada nilai baru yang lebih kecil dari terendah saat ini, maka nilai variabel terendah tersebut juga akan diganti dengan nilai yang terbaru
4. sudah dan sesuai dengan apa yang saya commit dengan menambahkan code:
```
if (nilai > 60){
    lulus+=1;
}else {
    tidaklulus+=1;
}
```
5. sudah

## Percobaan 2.2
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
```
 if (nilai < 0 || nilai > 100){
    System.out.println("Nilai Tidak Valid. Masukan nilai yang valid!");
    continue;
}
```
a. nilai < 0 || nilai > 100
b. continue
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
5. Commit dan push kode program ke Github

jawab:
1. Maksud Sintaks:
* nilai < 0 || nilai > 100: Ini adalah kondisi IF untuk validasi nilai yang diinputkan. Program akan mengecek apakah nilai yang dimasukkan oleh users berada di luar rentang valid atau tidak (kurang dari 0 ATAU lebih dari 100).
* continue: Perintah ini menghentikan program yang berjalan saat ini dan memaksa perulangan untuk langsung melompat ke awal (pengecekan kondisi while berikutnya). Ini menyebabkan sisa kode (pengecekan nilai huruf dan i++) dilewati.
2. i++ diletakkan di akhir karean agar counter mahasiswa hanya bertambah setelah nilai yang dimasukkan itu telah terbukti valid. Jika ditaruh di awal, maka i akan langsung menjadi 1 (melewatkan "mahasiswa ke-1") dan jika ada input tidak valid, maka perintah continue akan melompat ke mahasiswa berikutnya (misal dari ke-2 langsung ke ke-3) dan tidak mengulang input nilai mahasiswa ke-2 (yang nilai nya tidak valid).
3. Jumlah Perulangan jika jml = 19 maka Perulangan akan tetap berjalan sebanyak 19 kali. hal ini bisa terjadi karena i dimulai dari 0 dan kondisi while (i < 19) yang tentunya akan bernilai true untuk i = 0, 1, 2, ..., 18 (totalnya ada 19 karena 0 juga dihitung).
4. sudah dengan menambahkan code
```
System.out.println("Bagus, pertahankan nilai nya!");
```
setelah code
```
if (nilai > 80 && nilai <= 100) {
    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
```
5. sudah

## Percobaan 2.3
pertanyaan: 
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?

jawab: 
1. perulangan akan terjadi 1 kali karen looping do while akan mengerjakan suatu pragram (baik benar ataupun salah) dan baru akan dicek apakah sudah sesuai dengan kondisi yang diinginkan atau tidak. karena "batal" bernilai true maka kondisi while sudha terpenuhi dan program akan berhenti.
2. ketika nama pelanggan diisi dengan "batal" hal ini akan menyebabkan if bernilai true dan akan menjalankan perintah break dan perulangan akan otomatis terhenti.
3. Fungsinya adalah untuk menciptakan perulangan tak terbatas (infinite loop). Ini membuat perulangan akan terus berjalan sampai kondisi berhenti manual (yaitu break) di dalam blok do itu telah tercapai.
4. Perulangan ini tetap berjalan karena kondisi while yang selalu true (tidak pernah menjadi false) hal ini akan mengakibatkan loop akan berjalan terus menerus (infinite loop) dan tidak dikontrol oleh counter (seperti i++) yang dapat berhenti ketika kondisi sudah terpenuhi.  