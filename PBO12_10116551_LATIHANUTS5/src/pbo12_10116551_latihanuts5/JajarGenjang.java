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
public class JajarGenjang implements BangunDatar {

    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCd;
    private final int sisiDa;
    private final int alas;
    private final int tinggi;

    public JajarGenjang(int ab, int bc, int cd, int da, int oAlas, int oTinggi) {
        sisiAb = ab;
        sisiBc = bc;
        sisiCd = cd;
        sisiDa = da;
        alas = oAlas;
        tinggi = oTinggi;
    }

    @Override
    public void hitungLuas() {
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang : " + luas);

    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("Keliling Jajar Genjang : " + keliling);
    }

}
