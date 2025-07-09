/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 02338079698
 */
public class ContaCorrente extends Conta implements Tributavel{
    
    @Override
    public void atualiza(double taxa) {
        super.deposita( super.getSaldo() * (taxa * 2));
    }
    
    @Override
    public void deposita(double valor) {
        super.deposita(valor - 1 );
    }

    @Override
    public double calcularTributavel() {
        return this.getSaldo() * 0.01;
    }
}
