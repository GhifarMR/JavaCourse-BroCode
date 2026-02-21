/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author macbookair
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tmp;
        boolean status;
        
        Nasabah nasabah = new Nasabah("Agus", "Daryanto");
        System.out.println("Nasabah atas nama " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
        
        nasabah.setTabungan(new Tabungan(5000));
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal : " + tmp);
        
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan 3000");
        tmp = nasabah.getTabungan().getSaldo();
        
        System.out.println("saldo akhir : " + tmp);
        
    }
    
}
