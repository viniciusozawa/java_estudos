/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

/**
 *
 * @author 02338079698
 */
public class ExemploMetodo3 {
    //método com parâmetro -> String nome
    public static void exibirNome(String nome, String sobrenome, double salario){
        System.out.println("----Relátorio---- ");
        System.out.println("Nome: "+nome);
        System.out.println("Sobrenome: "+sobrenome);
        System.out.printf("Salário: %.2f \n",salario);
        System.out.println("----------- \n");
    }
    
    public static void main(String[] args) {
        exibirNome("Carlos", "Souza", 1200.90);
        exibirNome("Maria", "Oliveira", 1700.90);
    }
}
