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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO_8859_1");
        
        
        
        Conta x = new Conta();
        x.deposita(2000);
        Conta y = new Conta(10000);
        Conta z = new Conta(15000.70, 20000, 19932);
        z.deposita(5000);
        
        Cliente objClienteMaria = new Cliente();
        Conta w = new Conta(323, objClienteMaria, 10000, 10, "");
        
        System.out.println("Saldo da Conta x "+x.getSaldo());
        System.out.println("Saldo da Conta y "+y.getSaldo());
        System.out.println("Saldo da Conta  z"+z.getSaldo());
        
        System.out.println("Total de contas:  "+Conta.getTotalDeConta());
    }
}
