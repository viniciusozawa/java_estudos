/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_casa;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TesteCasa {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Casa casa1 = new Casa();
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite o Nome do Proprietário: ");
        p1.nome = entrada.nextLine();
        System.out.println("Digite sua Idade: ");
        p1.idade = entrada.nextInt();
        
        casa1.porta1.abrir();
        casa1.porta2.fechar();
        casa1.porta3.abrir();
        casa1.porta1.pinta("Marrom");
        casa1.porta2.pinta("Marrom Cimento");
        casa1.porta3.pinta("Preto");
        
        casa1.pintarCasa("Azul");
        
        System.out.println("----Pessoa----\n\n");
        p1.exibir();
        System.out.println("\n\n-----\n\n");
        System.out.println("----Casa----\n\n");
        casa1.exibirInfoCasa();
        System.out.println("\n\n-----\n\n");
        System.out.println("\n\n---Porta 1---");
        casa1.porta1.exibir();
        System.out.println("\n\n-----\n\n");
        System.out.println("\n\n---Porta 2---");
        casa1.porta2.exibir();
        System.out.println("\n\n-----\n\n");
        System.out.println("\n\n---Porta 3---");
        casa1.porta3.exibir();
    }
    
    
    
}
