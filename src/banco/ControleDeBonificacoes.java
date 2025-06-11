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
public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;
    
    public void resgistra(Funcionario f1){//Polimorfismo dinâmico ou de sobreposição
        this.totalDeBonificacoes += f1.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
    
   
   
}
