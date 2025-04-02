/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 02338079698
 */
public class Conta {
    int numero;
    String cliente;
    double saldo;
    double limite;
    
    public boolean saca(double quantidade){
        if(this.saldo >= quantidade){
            
            this.saldo = this.saldo - quantidade;
            return true;
        } else{
            System.out.println("Presado"+this.cliente+"Saldo insuficiente. Seu saldo é: "+this.saldo);
            return false;
        }
        
    }
    
    public void deposita(double quantidade){
        if(quantidade > 0 ){
            this.saldo = this.saldo + quantidade; 
        } else if (quantidade == 0 ){
            System.out.println("O número é nulo");
        } else{
            System.out.println("O número é negativo");
        }
    }
    
    public void transfere(Conta destino , double valor){
        if(this.saca(valor)== true){
            destino.deposita(valor);
        } else{
            System.out.println("Saldo insuficiente");
        }
        
    }
    
}
