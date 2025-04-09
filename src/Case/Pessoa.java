/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case;

import java.util.Date;

/**
 *
 * @author 02338079698
 */
public class Pessoa {
    String nome;
    int idade;
    double dataAniver;
//    public void fazAniversarioAno(){
//        Date niver= new Date();
//        this.dataAniver = niver.getYear()- this.idade;
//        System.out.println(""+niver.getYear());
//    }
    
    public void exibir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Ano de Aniversário: "+this.dataAniver);
        
    }
        
}
