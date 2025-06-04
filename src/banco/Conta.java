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
    Cliente cliente;
    private double saldo;
    private double limite;
    private static int totalDeConta; //static -> pertence a classe 
    
    
    
    public Conta(){ //Construtor Padrão
        System.out.println("Construindo uma conta..");
        Conta.totalDeConta++;
    }

    public static int getTotalDeConta() {
        return totalDeConta;
    }
    
    public Conta(double saldo){
        this();//chama o contrutor padrao
        this.saldo = saldo;
    }
    
    public Conta(double saldo, double limite, int numero){
        //this.saldo = saldo;
        this(saldo);
        this.limite = limite;
        this.numero = numero;
    }
    
   public Conta(int numero, Cliente cliente, double saldo, double limite){
        this(saldo,limite,numero);//chama o construtor de cima
        //this.numero = numero
        this.cliente = cliente;
        //this.saldo = saldo;
        //this.numero = saldo;
    }
    
    public double getSaldo(){
        return this.saldo + this.limite;
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
            System.out.println("Presado "+this.cliente.getNome()+" Saldo insuficiente. Seu saldo é: "+this.saldo);
            return false;
        }
        
    }
    
    public void deposita(double quantidade){
        if(quantidade > 0 ){
            this.saldo += quantidade; 
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
    
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
    
}
