package latihanjava;
/**
 *
 * @author Muhammad Agriyansyah
 */
import java.util.Scanner;

public class Scann {
    public static void main(String[] arg){
        String nama = ""; 
        Scanner datain = new Scanner(System.in);
        System.out.print("Masukkan Nama Variabel : ");
        nama = datain.nextLine();
        System.out.println("Isi Dari Variabel Nama : "+nama);
    } 
}