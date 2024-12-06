/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ukl;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Ukl {

    public static void main(String[] args) {
        anak();
        quiz();
     
        
    }

    public static void anak() {
        for (int a = 50; a >= 1; a--) {
            if (a % 2 == 0) {
                if (a % 3 == 0) {
                    System.out.println(a + ". Saya Angkatan 33");
                } else {
                    System.out.println(a + ". Saya Anak Moklet");
                }
            } else if (a % 2 == 1) {
                if (a == 1) {
                    System.out.println(a + ". Saya Senang");
                } else if (a % 3 == 0) {
                    System.out.println(a + ". Saya Angkatan 33");
                } else {
                    System.out.println(a + ". Saya Anak Wikusama");
                }
            }

        }
        System.out.println("==================================");
    }

    public static void quiz() {
        Scanner quiz = new Scanner(System.in);
        Random acak = new Random();
        boolean continueQuiz = true;
        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Anda akan diberikan soal secara acak.");
        System.out.println("Ketik 'stop' untuk menghentikan kuis kapan saja.");
        System.out.println("==================================");

        while (continueQuiz) {
            int bilangan1 = acak.nextInt(50) + 5;
            int bilangan2 = acak.nextInt(50) + 5;
            char operator = getRandomOperator(acak);

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
            String userInput = quiz.nextLine();

            if (userInput.equalsIgnoreCase("stop")) {
                continueQuiz = false;
                System.out.println("Terima kasih telah bermain! Sampai jumpa.");
                System.out.println("==================================");
                break;
            }

            int userAnswer;
            try {
                userAnswer = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau ketik 'stop' untuk keluar.");
                continue;
            }

            int correctAnswer = calculateAnswer(bilangan1, bilangan2, operator);

            if (userAnswer == correctAnswer) {
                System.out.println("Benar! Jawaban Anda: " + userAnswer);
            } else {
                System.out.println("Salah. Jawaban yang benar adalah: " + correctAnswer);
            }

            System.out.println("==================================");
        }

        quiz.close();
    }

    private static char getRandomOperator(Random acak) {
        char[] operators = {'*', '/', '%'};
        return operators[acak.nextInt(operators.length)];
    }

    private static int calculateAnswer(int bilangan1, int bilangan2, char operator) {
        switch (operator) {
            case '*':
                return bilangan1 * bilangan2;
            case '/':
                return bilangan1 / bilangan2;
            case '%':
                return bilangan1 % bilangan2;
            default:
                throw new IllegalArgumentException("Operator tidak valid: " + operator);
        }

    } 
}


//        System.out.println("Rekap kehadiran siswa selama 1 bulan ( jumlah hari kerja : "+h+" hari )");
//        System.out.println(" Siswa ke-"+k+" : "+bilangan[i]+" hari hadir" );
//        System.out.print("Masukkan angka a: ");
//        int a = input.nextInt();
//        System.out.print("Masukkan angka b: ");
//        int b = input.nextInt();

