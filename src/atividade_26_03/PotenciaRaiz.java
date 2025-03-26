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
public class PotenciaRaiz {
    public static double calcularQuadrado(double n){
        return Math.pow(n , 2);
    }
    
    public static double calcularRaizQuadrada(double n){
        return Math.sqrt(n);
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n;
        System.out.println("Digite um Número: ");
        n = entrada.nextDouble();
        
        System.out.println("Quadrado de "+n+": "+calcularQuadrado(n));
        System.out.println("Raiz quadrada de "+n+": "+calcularRaizQuadrada(n));
    }
}
