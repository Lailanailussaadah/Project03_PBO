/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectLuasBangunKompleks;

/**
 *
 * @author ASUS
 */
public class Project01 {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        l.r = 21;
        int lingkaran = l.hitungLuas();
        
        Persegi p = new Persegi();
        p.sisi = 42;
        int persegi = p.hitungLuas();
        
        double LuasBangun = (lingkaran * 2) +persegi;
        System.out.println("Hasil luas bangun adalah :" + LuasBangun);
    }
}
