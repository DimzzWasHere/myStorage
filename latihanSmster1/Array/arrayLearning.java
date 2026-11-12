public class arrayLearning {
    public static void main(String[] args){
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)){
            while(true){
                float sumNilai=0;
                float avgNilai=0;
                
                System.out.println("---PRAKTEK ARRAY---");
                System.out.print("Masukkan ukuran array: ");
                int size = scanner.nextInt();
                int[] num = new int[size];
                System.out.println("Masukkan angka sebanyak " + size + " kali:");
                for (int i=0; i<num.length; i++){
                    num[i] = scanner.nextInt();
                }
                for (int i=0;i<num.length; i++){
                    sumNilai = sumNilai + num[i];
                }
                avgNilai = sumNilai / size;

                System.out.println("Jumlah seluruh nilai elemen array: "+sumNilai);
                System.out.println("Rata-rata nilai elemen dalam array: " +avgNilai);
                System.out.print("Elemen-elemen array: ");
                for (int i=0; i<num.length;i++){
                    int data = num[i];
                    if (i==0){
                        System.out.print("["+data+", ");
                    }
                    else if (i==num.length - 1){
                        System.out.println(data+ "]");
                    }
                    else{
                        System.out.print(data+", ");
                    }
                }
                
                String next;
                System.out.println("Program selesai! Lanjut? (Y/T)");
                next = scanner.next();
                do{
                    if ((!next.equalsIgnoreCase("Y")&&(!next.equalsIgnoreCase("T")))) {
                        System.out.println("Masukkan opsi yang benar!");
                        next=scanner.next();
                    }
                }while((!next.equalsIgnoreCase("Y")&&(!next.equalsIgnoreCase("T"))));

                if (next.equalsIgnoreCase("T")){
                    System.out.println("Terima kasih!");
                    break;
                }
            }
        }
    }
}