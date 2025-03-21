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
public class TesteConversor {
    public static void main(String[] args) {
        Scanner entrada_dados = new Scanner(System.in); 
        ConversorFahrenheit conversor = new ConversorFahrenheit();
        
        float temperatura;
        int opcao;
        
        do{
            System.out.printf("\n\n\t-----Conversor de Temperatura -----\n");
            System.out.printf("\n\n\t-----Opção 1: Celsius para Fahrenheit \n");
            System.out.printf("\t-----Opção 2: Fahrenheit para Celsius \n");
            System.out.printf("\n\n----Caso de Opção errada o programa continuara------\n");
            
            System.out.println("\n\nDIGITE 1 OU 2: ");
            opcao = entrada_dados.nextInt();
            
        }while( opcao != 1 && opcao != 2);
        
        System.out.println("Digite a temperatura só números: ");
        temperatura = entrada_dados.nextFloat();
        conversor.realizarConversao(opcao, temperatura);
        
        
        
    }
    
    
   
}
