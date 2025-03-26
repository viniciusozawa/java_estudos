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
public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, i=0;
        while(true){
            System.out.println("Digite apenas Número acima de 0: ");
            opcao = entrada.nextInt();
            if( opcao > 0){
                break;  
            }else{
                System.out.println("Número Inválido. Tente Novamente");
            }
        }
        
        while( opcao > 0){
            
            opcao--;
            System.out.println(""+opcao);
        }
    }
}
