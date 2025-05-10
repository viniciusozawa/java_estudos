/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author 02338079698
 */
public class AnalisadorNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, cont_positivo=0 , cont_negativo=0, maior_n = 0;
        
        
        for (int i = 0; i <= 8; i++) {
            System.out.println("Digite Numeros: ");
            n = entrada.nextInt();
            
            if( n % 2 == 0){
                cont_positivo++;
            }else{
                cont_negativo++;
            }
            
            if(maior_n < n){
                maior_n = n;
            }
            
            
        }
        
        System.out.println("Positivos: " + cont_positivo);
        System.out.println("Negativos: " + cont_negativo);
        System.out.println("Maior número digitado: " + maior_n);
    }
}
