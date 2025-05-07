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
    private int numero;
    //String cliente;
    Cliente objCliente; //referência do tipo Cliente == null
    private double saldo;
    private double limite;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero( int numero){
        this.numero = numero;
    }
    
    public boolean saca(double quantidade){
        if(this.saldo >= quantidade){
            
            this.saldo = this.saldo - quantidade;
            return true;
        } else{
            System.out.println("Presado "+this.objCliente.getNome()+" Saldo insuficiente. Seu saldo é: "+this.saldo);
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
