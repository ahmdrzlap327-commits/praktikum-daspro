# Laporan Praktikum Dasar Pemrograman jobsheet 5
### nama        : Ahmad Rizal Ali Pasha
### absen/kelas : 02/1C
### nim         : 254107020146

## Percobaan 1: IF dan IF-ELSE
1. Mengapa if (uktLunas) tidak menggunakan operator relasional?
    Karena variabel uktLunas sudah bertipe data boolean yang nilainya hanya true atau false. Struktur if dapat langsung mengubah nilai kebenaran variabel tersebut tanpa perlu perbandingan. 
2. Hasil jika input false?
    Program tidak akan menampilkan output apapun karena kondisi if tidak terpenuhi dan tidak ada 3.blok else untuk menangani kondisi false.
3. Modifikasi dengan ELSE:
    sudah dengan menambahkan:
    ```
    if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
    } else {
        System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
    }
    ```
## Percobaan 2: SWITCH-CASE
1. Fungsi break?
    break digunakan untuk menghentikan eksekusi di dalam blok switch. Tanpa break, program akan melanjutkan eksekusi ke case berikutnya (fall-through) hingga menemukan break atau akhir dari blok switch. 
2. Peran default?
    default adalah blok kode yang akan dieksekusi jika tidak ada case yang cocok dengan nilai variabel. Ini berfungsi sebagai penanganan untuk input yang tidak valid.
3. Transformasi ke IF-ELSE IF:
    Program diubah menggunakan serangkaian if-else if untuk memeriksa setiap nilai semester, dengan blok else terakhir sebagai pengganti default. dengan kode seperti
    ```
    if (semester == 1) {
        System.out.println("KRS Semester 1 ditampilkan");
    } else if (semester == 2) {
        System.out.println("KRS Semester 2 ditampilkan");
    } // ... dan seterusnya untuk semester lain
    else {
        System.out.println("Semester tidak valid");
    }
## Percobaan 3: Nested IF
1. Hasil jika input "No" pada pertanyaan bebas kompen?
    Program akan menampilkan "Gagal! Mahasiswa masih memiliki tanggungan kompen". Ini karena kondisi if terluar (bebasKompen.equalsIgnoreCase("Ya")) bernilai false, sehingga program langsung mengeksekusi blok else terluar.
2. Maksud dari if (bimbinganP1 >= 8 && bimbinganP2 >= 4)?
    Potongan kode ini memeriksa apakah kedua kondisi terpenuhi secara bersamaan: jumlah bimbingan P1 harus 8 atau lebih DAN jumlah bimbingan P2 harus 4 atau lebih. Operator && (AND) memastikan kedua syarat wajib terpenuhi.
3. Alur pemeriksaan syarat:
    - Level 1 (Kompen): Program pertama kali memeriksa status kompen. Jika tidak bebas, proses gagal dan berhenti. Jika bebas, lanjut ke level 2. 
    - Level 2 (Bimbingan): Jika bebas kompen, program memeriksa jumlah bimbingan P1 dan P2. Program akan memberikan output kelulusan atau kegagalan spesifik berdasarkan kombinasi syarat bimbingan yang terpenuhi atau tidak.
## kemudian untuk tugas sudah seperti apa yang saya ketik di repositori saya