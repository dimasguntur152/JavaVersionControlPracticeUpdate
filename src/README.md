# 🧍‍♂️ Modul 1 - Program Data Diri (Java)

Program ini merupakan latihan dasar **Pemrograman Berorientasi Objek (PBO)** pada **Modul 1**.  
Tujuan program ini adalah untuk menginput data diri pengguna dan menampilkan hasil berupa:

- Nama
- Jenis kelamin
- Umur
- Kategori umur (Anak-anak, Remaja, Dewasa, Lansia)

Program dikembangkan menggunakan **bahasa Java** dengan memanfaatkan beberapa class bawaan seperti:
- `Scanner` → untuk membaca input dari pengguna
- `LocalDate` → untuk mengambil tahun saat ini secara otomatis

---

## 🎯 **Tujuan Pembelajaran**
Melalui program ini, mahasiswa diharapkan mampu:
1. Menggunakan **class `Scanner`** untuk membaca input dari pengguna.
2. Menggunakan **`LocalDate`** untuk mendapatkan data waktu secara dinamis.
3. Memahami logika **percabangan (if-else)** untuk menentukan kondisi tertentu.
4. Menerapkan **tipe data primitif dan objek** dalam pemrograman dasar Java.
5. Menampilkan output dalam format yang rapi dan informatif.

---

## 🧩 **Fitur Program**
✅ Input nama pengguna  
✅ Input jenis kelamin (`P` atau `L`)  
✅ Input tahun lahir  
✅ Hitung otomatis umur berdasarkan tahun saat ini  
✅ Tentukan kategori umur berdasarkan hasil perhitungan  
✅ Tampilkan seluruh data dengan format terstruktur di konsol

### 📊 Kategori Umur
| Umur (tahun) | Kategori Umur |
|---------------|----------------|
| < 13          | Anak-anak      |
| 13 – 19       | Remaja         |
| 20 – 59       | Dewasa         |
| ≥ 60          | Lansia         |

---

## ⚙️ **Langkah Menjalankan Program**

Kamu dapat menjalankan program ini melalui **Git Bash**, **Command Prompt**, atau **terminal IntelliJ IDEA**.

### 1️⃣ Kompilasi Program
Jalankan perintah:
```bash
javac Modul1.java
