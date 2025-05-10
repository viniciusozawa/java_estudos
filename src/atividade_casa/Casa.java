/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_casa;

/**
 *
 * @author 02338079698
 */
public class Casa {

    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();
    private int q_portasAbertas = 0;
    private String cor;
    public void pintarCasa(String s) {
        this.cor = s;
    }

    public void quantidadePortasAbertas(){
        if( porta1.isEstado()){
            q_portasAbertas += 1;
        } 
        if( porta1.isEstado()){
            q_portasAbertas += 1;
        } 
        if( porta1.isEstado()){
            q_portasAbertas += 1;
        } 
    }
    
    public void exibirInfoCasa(){
        System.out.println("Cor da Casa: "+this.cor);
        quantidadePortasAbertas();
        System.out.println("Quantidade de Portas Abertas: "+this.q_portasAbertas);
    }

}
