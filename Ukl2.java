package com.mycompany.ukl2;

import java.util.Scanner;

public class Ukl2 {

    public static void main(String[] args) {
        int [] angka ={1,2,3,4};
        System.out.println(angka[1]);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] kehadiran = new int[jumlahSiswa];
        int totalKehadiran = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();
            totalKehadiran += kehadiran[i];
        }

        double rataRataKehadiran = (double) totalKehadiran / jumlahSiswa;
        System.out.println();
        System.out.println("Rekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: 24 Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }
        System.out.println();

        System.out.printf("Rata-rata kehadiran siswa: %.2f hari", rataRataKehadiran);

        System.out.println("Kesimpulan:");
        System.out.println();
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
            
        }

        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
        System.out.println();
        scanner.close();
        
        
    }
}
