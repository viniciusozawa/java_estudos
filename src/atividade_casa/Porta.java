/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_casa;

/**
 *
 * @author 02338079698
 */
public class Porta {
    boolean estado = false;
    String cor;
    double dimensaoX, dimensaoY,dimensaoZ;
    
    public Porta(){
        this.dimensaoX = 0.80 ;
        this.dimensaoY = 2.10;
        this.dimensaoZ = 0.10;
    }
    
    
    public boolean abrir(){
        return estado = true;
    }
    
    public boolean fechar(){
        return estado = false;
    }
    
    public void estadoPorta(){
        if( this.estado){
            System.out.println("A porta está Aberta");
        }else{
            System.out.println("A porta está Fechada");
        }
    }
    
    public void pinta(String s){
        this.cor = s;
    }
    
    public void exibir(){
        System.out.println("Cor da porta: "+this.cor);
        System.out.println("Dimensão em X: "+this.dimensaoX+" Dimensão em y: "+this.dimensaoY+" Dimensão em z: "+this.dimensaoZ);
        
    }
    
    
}
