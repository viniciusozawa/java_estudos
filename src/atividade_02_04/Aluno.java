/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_02_04;

/**
 *
 * @author 02338079698
 */
public class Aluno {
    String nome;
    int matricula; 
    int idade;
    
    public void exibirDados(){
        System.out.println("\nNome do Aluno(a): "+this.nome+
                            "\nNúmero da Matrícula: "+this.matricula+
                            "\nA idade do Aluno(a): "+this.idade);
    }
    
    
    public void fazerMatricula(Aluno matricula){
        this.matricula = matricula.matricula + 1;
        System.out.println("\n\n---Matrícula realizada---");
    }
  
    
}
