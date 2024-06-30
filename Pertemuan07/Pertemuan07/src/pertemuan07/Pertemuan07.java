/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan07;

/**
 *
 * @author Muhammad Agriyansyah (2201010410)
 * 06-05-2024
 */
public class Pertemuan07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        induk a2 = new induk("ss",0);
        turunan1 a1 = new turunan1();
        a2.setNAMA("Muhammad Agriyansyah");
        
        System.out.println("1. Isi dari variabel nama: "+a1.getNAMA());
        a1.setNAMA("Muhammad Agriyansyah");
        System.out.println("2. Isi dari variabel nama: "+a1.getNAMA());
        
        a1.setNAMA();
        System.out.println("3. Isi dari variabel nama: "+a1.getNAMA());
        
        a2.cetakNAMA();
        a1.cetakNAMA();
        
    }
    
}
