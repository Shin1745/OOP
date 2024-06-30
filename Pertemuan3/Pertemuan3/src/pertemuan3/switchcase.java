/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Muhammad Agriyansyah (2201010410)
 * Tgl : 2024-04-01
 */
public class switchcase {
    public static void main(String[] args){
        String nVal = "D";
        
        switch (nVal) {
            case "A":
                System.out.println("Nilai nVar adalah A");
                break;
            case "a":
                System.out.println("Nilai nVar adalah A");
                break;
        
            case "B":
                System.out.println("Nilai nVar adalah B");
                break;
    
            case "C":
                System.out.println("Nilai nVar adalah C");
                break;
            default:
                System.out.println("Nilai nVar tidak ada dalam definisi");
        }
    }
}
