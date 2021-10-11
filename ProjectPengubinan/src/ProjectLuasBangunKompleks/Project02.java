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
public class Project02 {
    public static void main (String [] args){
        Lingkaran lb = new Lingkaran();
        lb.r = 28/2;
        int lingkaranBesar = lb.hitungLuas();
        
        Lingkaran lk = new Lingkaran();
        lk.r = 14/2;
        int lingkaranKecil = lk.hitungLuas();
        
        double LuasAbu = lingkaranBesar - lingkaranKecil;
        System.out.println("Luas daerah abu-abu adalah:" + LuasAbu);
    }
}
