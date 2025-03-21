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
public class MediaNumeros {
    public static float calcularMedia(float n1, float n2, float n3){
        float soma = n1 + n2 + n3;
        return soma / 3;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3, resultado;
        
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite a segunda: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite a terceira: ");
        n3 = entrada.nextFloat();
        resultado = calcularMedia(n1,n2,n3);
        System.out.printf("\nA média é %.2f\n",resultado);
    }
}
