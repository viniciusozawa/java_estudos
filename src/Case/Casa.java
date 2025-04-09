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
public class Casa {
    String definirCor;
    Porta portaTotal = new Porta();
    
    
    public void pinta(String s, Porta p){
        this.portaTotal.pinta(s);
    }
}
