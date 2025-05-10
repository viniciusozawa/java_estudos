/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_casa;

import java.util.Date;

/**
 *
 * @author 02338079698
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double dataAniver;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Ano de Aniversário: "+this.dataAniver);
        
    }
        
}
