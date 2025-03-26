/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_26_03;

/**
 *
 * @author 02338079698
 */
public class Produto {
    String nome;
    double preco;
    double porcentagemDesconto;
    double valorPagar;
    
    public void exibirInformacoes(){
        calcularPrecoPromocional();
        System.out.println("\nNome: " + this.nome+
                           "\nPreço: R$ \n" + this.preco+
                           "Preço promocional com "+this.porcentagemDesconto+"% de desconto: R$ "+this.valorPagar); 
    }
    public void calcularPrecoPromocional(){
        valorPagar = preco - (preco * porcentagemDesconto / 100);
    }
            
}
