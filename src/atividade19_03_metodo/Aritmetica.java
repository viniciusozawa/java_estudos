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
public class Aritmetica {
    public float soma(float n1, float n2){
        return n1 + n2;
    }
    public float subtrair(float n1 , float n2){
        return n1 - n2;
    }
    public float multiplicar(float n1, float n2){
        return n1 * n2;
    }
    public float dividir(float n1 , float n2 ){
        if( n2 == 0){
            return 0;
        }
        return n1 / n2;
    }
}
