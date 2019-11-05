/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan51.gajikaryawan;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = kehadiran*10000;
         return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){
        if(jabatan.equals ("Manager")){
         tunjanganJabatan=2000000;
        }else if (jabatan.equals ("Kabag")){
         tunjanganJabatan=1000000;
        }else 
            tunjanganJabatan=0;
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        if(golongan == 1){
         tunjanganGolongan=500000;
        }else if (golongan == 2){
         tunjanganGolongan=1000000;
        }else if (golongan == 3){
         tunjanganGolongan=1500000;
        }else
            tunjanganGolongan=0;
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;
    }
    
}
