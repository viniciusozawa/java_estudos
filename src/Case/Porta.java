/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

/**
 *
 * @author 02338079698
 */
public class Porta {
    boolean estado = false;
    String cor;
    double dimensaoX, dimensaoY,dimensaoZ;
    
    public boolean abrir(){
        return estado = true;
    }
    
    public boolean fechar(){
        return estado = true;
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
        System.out.print("Status da Porta: ");
        estadoPorta();
        
    }
    
    
}
