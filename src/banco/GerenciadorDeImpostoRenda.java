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
public class GerenciadorDeImpostoRenda {

    private double total;

    void adiciona(Tributavel t) {
        System.out.println( " Adicionando tributavel: "+ t);
        this.total += t.calcularTributavel();
    }

    public double getTotal() {
        return this.total;
    }
}
