/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 02338079698
 */
public class ContaCorrente extends Conta implements Tributavel{
    
    @Override
    public void atualiza(double taxa) {
        try {
            super.deposita( super.getSaldo() * (taxa * 2));
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void deposita(double valor) throws ValorInvalidoException {
        super.deposita(valor - 1 );
    }

    @Override
    public double calcularTributavel() {
        return this.getSaldo() * 0.01;
    }
}
