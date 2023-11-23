import java.util.Scanner;
public class NilaiMahasiswa03 {
    static final int Jumlah_Mahasiswa = 5;
    static final int Jumlah_Minggu = 7;

    static int [][] nilaiMahasiswa = new int [Jumlah_Mahasiswa][Jumlah_Minggu];
    public static void main(String[] args) {

        inputDataMahasiswa();
        tampilkanNilaiMahasiswa();
        cariHariTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }

    static void inputDataMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Jumlah_Mahasiswa; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < Jumlah_Minggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilkanNilaiMahasiswa() {
        System.out.println("\nNilai Mahasiswa:");

        for (int i = 0; i < Jumlah_Mahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < Jumlah_Minggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < Jumlah_Minggu; j++) {
            int totalNilai = 0;

            for (int i = 0; i < Jumlah_Mahasiswa; i++) {
                totalNilai += nilaiMahasiswa[i][j];
            }

            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                hariTertinggi = j;
            }
        }

        System.out.println("\nHari dengan nilai tertinggi adalah Minggu ke-" + (hariTertinggi + 1));
    }

    static void tampilkanMahasiswaNilaiTertinggi() {
        System.out.println("\nMahasiswa dengan nilai tertinggi:");

        int nilaiTertinggi = 0;
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < Jumlah_Mahasiswa; i++) {
            int totalNilai = 0;

            for (int j = 0; j < Jumlah_Minggu; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }

            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                mahasiswaTertinggi = i;
                mingguTertinggi = 1;
            }
        }

        System.out.println("Mahasiswa " + (mahasiswaTertinggi + 1) + " dengan nilai tertinggi pada minggu ke-" + mingguTertinggi);
    }
}
