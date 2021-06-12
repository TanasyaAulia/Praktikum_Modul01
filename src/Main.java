import java.util.Locale;

public class Main {
    public static void main (String[]args){
        
        String namaDepan = "Tanasya";
        String namaBelakang = "Aulia";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean cantik = true;
        
        System.out.println (namaDepan + namaBelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String (uniskaChar);
        System.out.println (uniskaChar);
        System.out.println (uniskaString);
        
        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println (namaLengkap);
        System.out.println (namaLengkap.length());
        System.out.println (namaLengkap.indexOf("sya"));
        System.out.println (namaLengkap.substring(8));
        System.out.println (namaLengkap.substring(2,7));
        System.out.println (namaLengkap.replace("Tanasya","Nesha"));
        System.out.println (namaLengkap.toLowerCase());
        System.out.println (namaLengkap.toUpperCase());
        System.out.println (namaLengkap.length());
        System.out.println (namaLengkap.charAt(2));

        String[] namaArray = namaLengkap.split (" ");

        for (String nama : namaArray)
            System.out.println(nama);
    }
}
