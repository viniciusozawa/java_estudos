/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10_03_revisaoSintaxe;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
//ATIVIDADE 1
public class VerificacaoIdade {
    public static void main(String arg[]){
        int idade;
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite sua Idade: ");
        idade = entrada.nextInt();
        
        if( idade >= 18 ){
            System.out.println("\nMaior de Idade");
        }
        else{
            System.out.println("\nMenor de Idade");
        }
    }
   
}
