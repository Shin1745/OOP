package latihanjava;

/**
 *
 * @author Muhammad Agriyansyah
 */

import javax.swing.JOptionPane;

public class msgbox {
    public static void main(String[] arg){
    
        String nama = "";
        nama = JOptionPane.showInputDialog("Tuliskan Nama : ");
        
        System.out.println("Isi Variabel Nama : "+nama);
        
    
    }
}
