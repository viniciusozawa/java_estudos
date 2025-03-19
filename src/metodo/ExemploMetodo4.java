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
public class ExemploMetodo4 {
    //método com retorno e com passagem de pâremetro
    public static int somar(int a , int b){
        return a+b;
    }
    
    public static void main(String[] args) {
        int resultado = somar(30,20);
        System.out.println("Soma: "+somar(60,70));
        System.out.println("Soma2: "+resultado);
    }
}
