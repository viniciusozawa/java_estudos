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
public class TesteConstrutor {
    public static void main(String[] args) throws ValorInvalidoException {
        Scanner entrada = new Scanner(System.in, "ISO_8859_1");
        
        
        
        Conta x = new ContaCorrente();
        x.deposita(2000);
        Conta y = new ContaCorrente();
        Conta z = new ContaCorrente();
        z.deposita(5000);
        
        Cliente objClienteMaria = new Cliente();
        Conta w = new ContaCorrente();
        
        System.out.println("Saldo da Conta x "+x.getSaldo());
        System.out.println("Saldo da Conta y "+y.getSaldo());
        System.out.println("Saldo da Conta  z"+z.getSaldo());
        
        System.out.println("Total de contas:  "+Conta.getTotalDeConta());
    }
}
