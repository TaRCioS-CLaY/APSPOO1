/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepoo1;

/**
 *
 * @author darks
 */
public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double porcentual) {
        saldo += ((porcentual/100)+ taxa) *3;
    }    
}
