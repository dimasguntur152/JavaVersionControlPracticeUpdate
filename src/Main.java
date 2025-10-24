import java.util.Scanner; // Import library Scanner untuk input pengguna
import java.time.LocalDate; // Import LocalDate untuk mengambil tahun saat ini secara otomatis

public class Main
{
    public static void main(String[] args)
    {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta input jenis kelamin (P/L)
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelaminInput = scanner.next().charAt(0); // hanya ambil 1 karakter pertama

        // Meminta input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menentukan jenis kelamin berdasarkan input
        String jenisKelamin;
        if (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput == 'P' || jenisKelaminInput == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak diketahui";
        }

        // Mengambil tahun sekarang menggunakan LocalDate
        int tahunSekarang = LocalDate.now().getYear();

        // Menghitung umur pengguna
        int umur = tahunSekarang - tahunLahir;

        // Menentukan kategori umur berdasarkan umur yang dihitung
        String kategoriUmur;
        if (umur < 13) {
            kategoriUmur = "Anak-anak";
        } else if (umur <= 19) {
            kategoriUmur = "Remaja";
        } else if (umur <= 59) {
            kategoriUmur = "Dewasa";
        } else {
            kategoriUmur = "Lansia";
        }

        // Menampilkan hasil data diri ke layar
        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Kategori Umur : " + kategoriUmur);

        // Menutup scanner untuk menghindari kebocoran resource
        scanner.close();
    }
}
