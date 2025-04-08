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
public class TesteAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aritmetica conta = new Aritmetica();
        int opcao;
        float resultado, n1,n2;
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação: ");
        opcao = entrada.nextInt();
        
        System.out.println("Digite oo primeiro Número: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite oo primeiro Número: ");
        n2 = entrada.nextFloat();
        
        switch(opcao){
            case 1:
                resultado = conta.soma(n1, n2);
            break;
            case 2:
                resultado = conta.subtrair(n1, n2);
            break;
            case 3:
                resultado = conta.multiplicar(n1, n2);
            break;
            case 4:
                resultado = conta.dividir(n1, n2);
            break;
            default:
                resultado = 0;
        }
        System.out.println("---A opção escolhida: "+opcao+" \n---O resultado é : "+resultado);
        entrada.close();
    }
}
