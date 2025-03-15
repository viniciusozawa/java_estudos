/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;


/**
 *
 * @author 02338079698
 */
public class EntradaSaidaPadrao {
    
    public static void main(String arg[]){
        int soma;
        
        Scanner entrada = new Scanner(System.in); //Declarando a classe
        
        System.out.println("Olá mundo!"); //saída padrão
        System.out.println("Digite seu nome: "); 
        String nome = entrada.nextLine(); //scanf 
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite seu Salário: ");
        double salario = entrada.nextDouble();
        
        soma = idade + 14;
        System.out.println("Nome: "+nome); // Nome: mais a variavel usando +
        System.out.println("Idade: "+soma);
        System.out.println("Salário: "+salario);
    }
    
    
}
