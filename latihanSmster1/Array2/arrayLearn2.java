/*
    Program Data Mahasiswa
        Nama: Md. S. Dimas B.
        NIM: 2615354003

*/
package latihanSmster1.Array2;
import java.util.Scanner;
public class arrayLearn2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("---PROGRAM DATA MAHASISWA---");
            System.out.println("Masukkan jumlah mahasiswa:");
            int Data1 = scanner.nextInt();
            scanner.nextLine();

            String[] namaMhsws = new String[Data1];
            int[] nilaiMhsws= new int[Data1];

            for (int i = 0; i < namaMhsws.length; i++){
                System.out.print("Masukkan nama mahasiswa:");
                namaMhsws[i] = scanner.nextLine();
                System.out.print("Masukkan nilai:");
                nilaiMhsws[i] = scanner.nextInt();
                scanner.nextLine();
            }
            scanner.close();

    }
   
}