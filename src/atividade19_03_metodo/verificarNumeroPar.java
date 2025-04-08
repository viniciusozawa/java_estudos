/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade19_03_metodo;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class verificarNumeroPar {
    
    public static boolean ePar(int numero){
        return numero % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = entrada.nextInt();
        if(ePar(n)){
            System.out.println("O Número é par");
        }else{
            System.out.println("O Número é ímpar");
        }
        
        entrada.close();
    }
}
