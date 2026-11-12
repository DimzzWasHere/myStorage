//---PROGRAM PERCABANGAN IF ELSE x OPERASI LOGIKA x PERBANDINGAN---//
//--------------------Salam Satu Frekuensi-------------------------//
//--------------------------From TRPL------------------------------//

import java.util.Scanner;
public class jimalogan {
    public static void main(String[] args) {
        try (Scanner scanner=new Scanner (System.in)){
            
            //---PROGRAM 1---//
            System.out.println("--- PERCABANGAN IF---");
            System.out.println("Masukkan angka yang kamu suka!");
            int angka = scanner.nextInt();
            System.out.println("Apakah angka yang masukkan lebih dari 5?");
            String input = scanner.next();

            if (angka > 5 && input.equalsIgnoreCase("ya")){
                System.out.println("Kejujuran adalah hal yang berharga. Pertahankan!");
            } else {
                System.out.println("Anda berbohong :(");
            }
            
            //---PROGRAM 2---//
            System.out.println();
            System.out.println("---PERBANDINGAN ANGKA---");
            System.out.println("Masukkan angka pertama: ");
            int  ang1 = scanner.nextInt();
            System.out.println("Masukkan angka kedua: ");
            int ang2 = scanner.nextInt();

            if(ang1 > ang2){
                System.out.println("Angka pertama bernilai lebih besar dari angka kedua!");
            } else if (ang1 == ang2) {
                System.out.println("Angka pertama dan angka kedua bernilai sama!");
            } else {
                System.out.println("Angka pertama bernilai lebih kecil dari angka kedua");
            }

        }
    }
}