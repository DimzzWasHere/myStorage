public class Main {
    public static int luasPersegiPanjang(int panjang, int lebar){
        int luas;
        luas = panjang * lebar;
        return luas;
    }
    public static double luasSegitiga(int tinggi, int lebar){
        double luas;
        luas = tinggi * lebar / 2;
        return luas;
    }
    public static void tampilkanOutputPers(String namaObjek, int panjang, int lebar, int luas){
        String str="";
        str = str + "Luas "+ namaObjek;
        str = str + " dengan panjang " + panjang + " cm";
        str = str + " dan lebar " + lebar + " cm";
        str = str + " adalah " + luas + " cm";
        System.out.println(str);
    }
    public static void tampilkanOutputSegt(String namaObjek, int tinggi, int lebar, double luas){
        String str="";
        str = str + "Luas "+ namaObjek;
        str = str + " dengan panjang " + tinggi + " cm";
        str = str + " dan lebar " + lebar + " cm";
        str = str + " adalah " + luas + " cm";
        System.out.println(str);
    }
    public static void main(String[] args){
          int pPers = 15;
          int lPers = 6;
          int tSegt = 8;
          int lSegt = 6;

          int luasPers = luasPersegiPanjang(pPers, lPers); 
          tampilkanOutputPers("Persegi Panjang", pPers, lPers, luasPers);

          double luasSegt = luasSegitiga(tSegt, lSegt);
          tampilkanOutputSegt("Segitiga", tSegt, lSegt , luasSegt);
    }
}
