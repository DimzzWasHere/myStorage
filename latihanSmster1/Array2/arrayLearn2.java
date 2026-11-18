/*
    Program Data Mahasiswa
        Nama: Md. S. Dimas B.
        NIM: 2615354003

*/
package latihanSmster1.Array2;
import java.util.Scanner;
public class arrayLearn2{
    public static String Keterangan(int nilaiMhswsKet ){
        String Status;
        if (nilaiMhswsKet >= 70){
            Status = "LULUS";
        }
        else if (nilaiMhswsKet >= 50){
            Status = "LULUS PERCOBAAN";
        }
        else{
            Status = "REMEDIAL";
        }
        return Status;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("---PROGRAM DATA MAHASISWA---");
            System.out.println("Masukkan jumlah mahasiswa:");
            int Data1 = scanner.nextInt();
            scanner.nextLine();

            String[] namaMhsws = new String[Data1];
            int[] nilaiMhsws= new int[Data1];
            String[] status= new String[Data1];

            for (int i = 0; i < namaMhsws.length; i++){
                System.out.print("Masukkan nama mahasiswa:");
                namaMhsws[i] = scanner.nextLine();
                System.out.print("Masukkan nilai:");
                nilaiMhsws[i] = scanner.nextInt();
                int nilaiMhswsKet = nilaiMhsws[i];
                status[i] = Keterangan(nilaiMhswsKet);
                scanner.nextLine();
            }
            scanner.close();

            int i=0;
            System.out.println("Array Nama Mahasiswa:");
            while (i<Data1){
                String data = namaMhsws[i];
                if (i==0){
                        System.out.print("["+data+", ");
                    }
                    else if (i==namaMhsws.length - 1){
                        System.out.println(data+ "]");
                    }
                    else{
                        System.out.print(data+", ");
                    }
                i++;
            }
            i=0;
            System.out.println("Array Nilai Mahasiswa:");
            while (i<Data1){
                int data1 = nilaiMhsws[i];
                if (i==0){
                        System.out.print("["+data1+", ");
                    }
                    else if (i==namaMhsws.length - 1){
                        System.out.println(data1+ "]");
                    }
                    else{
                        System.out.print(data1+", ");
                    }
                i++;
                }
            i=0;
            while (i<Data1){
                String dataM = namaMhsws[i];
                String ket = status[i];
                int dataN = nilaiMhsws[i];
                System.out.println("======================");
                System.out.println("Data Mahasiswa Ke-"+(i+1));
                System.out.println("======================");
                System.out.println("Nama: "+dataM);
                System.out.println("Nilai: "+dataN);
                System.out.println("Keterangan: "+ket);
                i++;
            }

    }
   
}