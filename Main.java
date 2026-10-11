
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    // Method untuk menampilkan data mahasiswa
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
        cekKelulusan();
    }

    // Method untuk mengecek kelulusan
    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        // Input data tiga mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            daftarMahasiswa[i] = new Mahasiswa();

            System.out.print("Nama: ");
            daftarMahasiswa[i].nama = input.nextLine();

            System.out.print("NIM: ");
            daftarMahasiswa[i].nim = input.nextLine();

            System.out.print("Nilai: ");
            daftarMahasiswa[i].nilai = input.nextDouble();
            input.nextLine();
        }

        // Menampilkan data seluruh mahasiswa
        System.out.println("\n=== DATA MAHASISWA ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
            System.out.println("----------------------");
        }

        input.close();
    }
}
