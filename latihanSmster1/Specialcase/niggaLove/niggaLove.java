import java.util.Scanner;
public class niggaLove{
    public static int hitungBangunDatar(int panjang,int lebar){
        int luas;                
        luas = panjang * lebar;
        return luas;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        int p = scanner.nextInt();
        System.out.println("Masukkan lebar: ");
        int l = scanner.nextInt();

        int totalLuas = hitungBangunDatar(p, l);
        System.out.println("Jadi luasnya: "+ totalLuas);
    }
        
    }


