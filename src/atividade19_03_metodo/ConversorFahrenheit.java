/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade19_03_metodo;

/**
 *
 * @author Usuario
 */
public class ConversorFahrenheit {
    double resultado;
    public void realizarConversao(int opcao, float temperatura){
        System.out.println("\n");
        switch(opcao){
            case 1:
                resultado = celsiusParaFahrenheit(temperatura);
                System.out.printf("A conversao de %.2f°C é %.2f°F",temperatura,resultado);
            break;
            case 2:
                resultado = fahrenheitParaCelsius(temperatura);
                System.out.printf("A conversao de %.2f°F é %.2f°C",temperatura,resultado);
                
            break;
            default:
        }
        
    }
    public double celsiusParaFahrenheit(float temperatura){
        return temperatura * 1.8 + 32;
    }
    public double fahrenheitParaCelsius(float temperatura){
        return(temperatura -32) /1.8 ;
    }
}
