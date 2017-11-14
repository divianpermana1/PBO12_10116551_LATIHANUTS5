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
public class Segitiga implements BangunDatar {

    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCa;
    private final int alas;
    private final int tinggi;

    public Segitiga(int ab, int bc, int ca, int oAlas, int oTinggi) {
        sisiAb = ab;
        sisiBc = bc;
        sisiCa = ca;
        alas = oAlas;
        tinggi = oTinggi;
    }

    @Override
    public void hitungLuas() {
        luas = (int) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga : "+luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCa;
        System.out.println("Keliling Segitiga : "+keliling);
    }

}
