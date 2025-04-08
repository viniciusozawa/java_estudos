/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_02_04;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author 02338079698
 */
public class TesteAluno {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        
        
        System.out.println("Digite o Nome do aluno 1: ");
        aluno1.nome = entrada.nextLine();
        System.out.println("Digite a idade do aluno 1: ");
        aluno1.idade = entrada.nextInt();
        aluno1.fazerMatricula(aluno1);
        aluno1.exibirDados();
        System.out.println("\n\n---------\n\n");
        
        entrada.nextLine();
        
        System.out.println("Digite o Nome do aluno 2: ");
        aluno2.nome = entrada.nextLine();
        System.out.println("Digite a idade do aluno 2: ");
        aluno2.idade = entrada.nextInt();
        aluno2.fazerMatricula(aluno1);
        aluno2.exibirDados();
        System.out.println("\n\n---------\n\n");
            

        entrada.close();
    }



    
}
