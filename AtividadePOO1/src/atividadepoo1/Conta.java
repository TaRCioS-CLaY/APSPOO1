/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepoo1;

/**
 *
 * @author Clayton Garcia
 * Matricula 2016101697
 */
public class Conta {
   protected double saldo;
   protected double taxa = 0.2;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;        
    }
   
    public void atualiza(double porcentual){
        saldo += (porcentual/100);
        
        
    }
    
    
     
}
