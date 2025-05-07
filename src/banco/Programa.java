/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 02338079698
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        Cliente objClienteJoao = new Cliente();
        
        minhaConta.setNumero(10939);
        minhaConta.objCliente = objClienteJoao; //passando o endereço do objeto criado
        minhaConta.deposita(10000);
        minhaConta.objCliente.setNome("João Alves");
        minhaConta.saca(10001);
        
        outraConta.deposita(20000);
        
        //System.out.println("Digite um valor para retirar: ");
        //minhaConta.saca(entrada.nextDouble());
        System.out.println("Saldo da minha conta: "+minhaConta.getSaldo());
        System.out.println("Saldo da outra conta: "+outraConta.getSaldo());
        System.out.println("Endereço da minha conta: "+minhaConta);
        System.out.println("Endereço da outra conta: "+outraConta);
        System.out.println("Número da conta: "+minhaConta.getNumero());
    }
    
}
