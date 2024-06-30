package tugas.java.pkg1;

    import java.util.Scanner;

/*
 * @author Marcellino Immanuel Ndoki 
 * NIM 2201010148
 * TGL 25/03/2024
 */
public class TugasJava1 {

    
    public static void main(String[] args) {
        //Menghitung Luas Setigiga
        // Input Alas dan Tinggi
        
        //Definisikan Tipe data pada variabel
        double setengah = 0.5; // 1/2 = 0.5
        int alas = 0;
        int tinggi = 0;
        double luas = 0;
        
        //Inputan User
        Scanner datain = new Scanner(System.in);
        System.out.println("Menghitung Luas Segitiga!");
        System.out.print("Silahkan Masukkan Nilai Alas : ");
        String nilaialas = "";
        nilaialas = datain.nextLine();
        System.out.print("Silahkan Masukkan Nilai Tinggi : ");
        String nilaitinggi = "";
        nilaitinggi = datain.nextLine();
        
        //convert string ke int
        alas = Integer.parseInt(nilaialas);
        tinggi = Integer.parseInt(nilaitinggi);
        
        //proses
        luas = setengah * alas * tinggi;
        
        //hasil
        System.out.println("Hasil Dari Setengah "+setengah+" Dan Alas "+alas+" Dan Tinggi "+tinggi+" Adalah "+luas);
        System.out.println("Terima Kasih!");
       
        
    }
    
}
