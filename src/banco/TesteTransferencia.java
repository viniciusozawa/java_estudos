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
public class TesteTransferencia {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.deposita(4000);
        c2.deposita(7000);
        
        c2.transfere(c1, 500);
        System.out.println("Saldo da conta do João: "+c1.getSaldo());
        System.out.println("Saldo da conta do Pedro: "+c2.getSaldo());
        
    }
}
