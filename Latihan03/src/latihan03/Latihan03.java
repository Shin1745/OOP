package latihan03;

/**
 *
 * @author Muhammad Agriyansyah
 */
public class Latihan03 {
    
    public static void main(String[] args) {
        
        /*
        //if one line (tidak bisa menggunakan 2 system out)
        int bil1 = 4;
        if(bil1 == 7 )
            System.out.println("Nilai Bil1 sama dengan 7");
        else
            System.out.println("Nilai Bil1 tidak sama dengan 7");
        */
        
        //if block
        
        /*
        //if block (bisa menggunakan system out berkali-kali)
        int bil1 = 9;
        if(bil1 <= 8){
            System.out.println("Bil1 lebih kecil atau sama dengan 8");
            System.out.println("===================================");
        }else{
            System.out.println("Bil1 lebih besar dari 8");
            System.out.println("=======================");
        }
        */
        
        /*
        //Switch Case (harus sesuai dengan nilai case maka akan jalan jika tidak maka ke default)
        String nVal = "C";
        switch(nVal){
            case "A":
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
        */
                
        /*
        //while loop
        int cx = 0;
        int batas = 10;
        
        while(cx <= batas) //harus bersifat true baru bisa jalan
        {
            System.out.println("Perulangan ke - "+cx);
            cx = cx+1; //naikin 2 cx = cx+2 atau normalnya cx++ 
        }
        */
        
        /*
        //do while
        int cx = 0;
        int batas = 10;
        System.out.println("Perluangan Do while");
        do{
            System.out.println("Perluangan Ke - "+cx);
            cx++;
        }while( cx < batas);
        */
        
        
        /*
        //for
        int cx;
        int batas = 10;
        
        System.out.println("Perluangan For");
        for(cx = 0 ; cx < batas ; cx++){ 
            System.out.println("Perulangan Ke - "+cx);
        }
        */
        
    }
    
}
