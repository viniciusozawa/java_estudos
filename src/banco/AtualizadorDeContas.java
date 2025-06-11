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
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic) {
    this.selic = selic;
    }
    
    public void roda(Conta c){
        System.out.println("Tipo de Conta: "+c.getClass().getSimpleName());
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(selic);
        saldoTotal = c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
    
    
    
    
    
}
