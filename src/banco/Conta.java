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
public abstract class Conta {

    private int numero;
    //String cliente;
    Cliente cliente;
    private double saldo;
    private double limite;
    private static int totalDeConta; //static -> pertence a classe 

    public Conta() { //Construtor Padrão
        System.out.println("Construindo uma conta..");
        Conta.totalDeConta++;
    }

    public static int getTotalDeConta() {
        return totalDeConta;
    }

    public Conta(double saldo) {
        this();//chama o contrutor padrao
        this.saldo = saldo;
    }

    public Conta(double saldo, double limite, int numero) {
        //this.saldo = saldo;
        this(saldo);
        this.limite = limite;
        this.numero = numero;
    }

    public Conta(int numero, Cliente cliente, double saldo, double limite) {
        this(saldo, limite, numero);//chama o construtor de cima
        //this.numero = numero
        this.cliente = cliente;
        //this.saldo = saldo;
        //this.numero = saldo;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean saca(double quantidade) {
        if(quantidade < 0){
            throw new IllegalArgumentException();
            
        }else{
            this.saldo += quantidade - 0.10;
            return true;
        }

    }

       void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
        throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor - 0.10;
        }
    }

    public void transfere(Conta destino, double quantidade) throws ValorInvalidoException {
        if (this.saldo >= quantidade) {
            this.saca(quantidade);
            destino.deposita(quantidade);
        } else {
            System.out.println("Quantidade de saque insuficiente, seu saldo atual: " + this.getSaldo() + " Quantidade transferida canceleda, quantidade: " + quantidade);
        }
    }
    
    public abstract void atualiza(double taxaSelic);

}
