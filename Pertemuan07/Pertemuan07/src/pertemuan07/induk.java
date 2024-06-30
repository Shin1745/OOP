/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan07;

/**
 *
 * @author Muhammad Agriyansyah (2201010410)
 * 06-05-2024
 */
public class induk {
    private String nama;
    public int nilai=165;
    
    public induk(String nm, int nl){
        nama = nm;
        nilai = nl;
    }
    
    public void setNAMA(String nVAL){
        this.nama = nVAL;
    }
    public void setNAMA(){
        this.nama = "Siapa ya?";
    }
    public String getNAMA(){
        return this.nama;
    }
    public void cetakNAMA(){
        System.out.printf("4. Isi dari variabel nama: %s dengan tinggi badan %d \n\n",this.nama,this.nilai);
    }
    
}
