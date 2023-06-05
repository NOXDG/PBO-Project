/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author ASUS
 */
public class Transact extends random{

    String nama;
    String jenis;
    String keterangan;
    int nominal;
    int masuk, keluar, saldo=0;

    public Transact() {
    }

    public Transact(String nama, String jenis, String keterangan, int nominal) {
        this.nama = nama;
        this.jenis = jenis;
        this.keterangan = keterangan;
        this.nominal = nominal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getMasuk() {
        return masuk;
    }

    public void setMasuk(int masuk) {
        this.masuk = masuk;
    }

    public int getKeluar() {
        return keluar;
    }

    public void setKeluar(int keluar) {
        this.keluar = keluar;
    }
    

    public static int kontrol(Transact[] bantu,int batas) {
        int saldo=0;
        for (int i = 0; i <= batas; i++) {
            if (bantu[i].keterangan.toLowerCase().equals(("pemasukan"))) {
                bantu[i].masuk = bantu[i].nominal;
                saldo +=bantu[i].masuk;
            } else if (bantu[i].keterangan.toLowerCase().equals(("pengeluaran"))) {
                bantu[i].keluar = bantu[i].nominal;
                saldo -= bantu[i].keluar;
            }
            
        }
        return saldo;
    }
    
    public void cari(String val){
        if(generateId().equals(val) ){
            
        }
    }
    
    @Override
    public String generateId() {
        return super.generateId(); 
    }
}
