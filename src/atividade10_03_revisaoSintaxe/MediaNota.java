/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10_03_revisaoSintaxe;
import java.util.Scanner;
/**
 *
 * @author Vinicius
 */
// ATIVIDADE 5
public class MediaNota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   
        int aluni;
        float media;
        int n_aluno;
        int soma = 0;
        System.out.println("Digite a quantidade de alunos: ");
        n_aluno = entrada.nextInt();
        int[] notas = new int[n_aluno];
        
        for(int i=0; i < n_aluno ; i++){
            System.out.println("Digite a nota do aluno "+(i+1)+": ");
            notas[i] = entrada.nextInt();
            soma += notas[i];
        }
        if( n_aluno == 0){
            media = 0; 
        }
        else{
            media = soma / n_aluno;  
        }
        System.out.println("A média da notas é "+media);
    }
}
