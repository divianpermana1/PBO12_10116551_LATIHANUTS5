/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116551_latihanuts5;

/**
 *
 * @author CP321
 */
public class PBO12_10116551_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang aJg = new JajarGenjang(50, 60, 70, 80, 100, 120);
        aJg.hitungKeliling();
        aJg.hitungLuas();
        
        
        Segitiga aSg = new Segitiga(50, 60, 70, 100, 120);
        aSg.hitungKeliling();
        aSg.hitungLuas();        
    }    
}
