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
//ATIVIDADE 2
public class VerificacaoNumeros {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, soma;
        String valor, valor2, valor3;
        System.out.println("Digite um Número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite outro Número: ");
        n2 = entrada.nextInt();
        System.out.println("Digite outro Número: ");
        n3 = entrada.nextInt();
        if( n1 >= 0 ){
            valor = "Positivo"; 
            if(n1 == 0){
                valor = "Igual Zero";
            }   
        }
        else{
            valor = "Negativo";
        }
        
        if( n2 >= 0 ){
            valor2 = "Positivo"; 
            if(n2 == 0){
                valor2 = "Igual Zero";
            }
        }
        else{
            valor2 = "Negativo";
        }
        if( n3 >= 0 ){
            valor3 = "Positivo"; 
            if(n3 == 0){
                valor3 = "Igual Zero";
            }
        }
        else{
            valor3 = "Negativo";
        }
        
        if( n1 > n2 ){
            if( n1 > n3){
                System.out.println("Maior Valor: "+n1);
            }
            else if (n3 > n2){
                System.out.println("Maior Valor: "+n3);
            }
        }
        else if( n2 > n3){
            System.out.println("Maior Valor: "+n2);
        }
        else{
            System.out.println("Maior Valor: "+n3);
        }
        System.out.println("O primeito Número é "+valor);
        System.out.println("O segundo Número é "+valor2);  
        System.out.println("O terceiro Número é "+valor3);  
    }
}
