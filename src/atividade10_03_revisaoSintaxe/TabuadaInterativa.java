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
//ATIVIDADE 3
public class TabuadaInterativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um Número inteiro: ");
        int n = entrada.nextInt();
        int i = 1;
        while( i <= 10 ){
            System.out.println(n+" * "+i+" = "+n*i);
            i++;
        }
    }
}
