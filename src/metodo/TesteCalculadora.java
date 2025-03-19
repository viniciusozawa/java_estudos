/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

/**
 *
 * @author 02338079698
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora objCalc = new Calculadora(); //objeto ou intância de uma classe
        int n1 =0;
        switch(n1){
            case 1:
                    
            break;
        }
        System.out.println("Resultado da soma: "+objCalc.somar(5, 20));//objeto ou instância de uma classe
        System.out.println("Resultado da Subtração: "+objCalc.sub(2, 20));
        System.out.println("Resultado da Multiplicação: "+objCalc.multiplicar(2, 20));
        System.out.printf("Resultado da Divisão: %.2f\n",objCalc.dividir(20, 2.3));
    }
}
