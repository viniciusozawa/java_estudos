/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_26_03;
import java.util.Scanner;
/**
 *
 * @author 02338079698
 */
public class SomaNumeroPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um Número Inteiro: ");
        int n = entrada.nextInt();
        int soma=0;
        for( int i = 1 ; i <= n ; i++ ){
            if( i % 2 == 0){
                soma+=i;
            }
        }
        System.out.println("A soma de todos Números pares é: "+soma);
    }
}
