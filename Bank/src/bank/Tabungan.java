/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author macbookair
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public int simpanUang(int jumlah) {
        return saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah) {
        if(jumlah > saldo) {
            return false;
        }else {
            saldo -= jumlah;
            return true;
        }
    }
}
