/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handphone;

/**
 *
 * @author User
 */
public class Handphone {

    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenisHP(){
        return this.jenis_hp;
    }

    public int getTahnunPembuatan(){
        return this.tahun_pembuatan;
    }

    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setDataHP("samsung", 2002);
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahnunPembuatan());
    }
    
}

    
