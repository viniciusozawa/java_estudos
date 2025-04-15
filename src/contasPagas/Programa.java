/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author Usuario
 */
public class Programa {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        
        cli1.nomeCliente = "Roberto";
        cli1.cpf = "212.301.402-32";
        c1.idConta = "1";
        c1.dataVencimento = "05/07/2025";
        c1.dataPagamento = "03/07/2025";
        p1.descrisaoProduto = "Notebook core i7";
        p1.valorProduto = 1500.89;
                
                
        cli2.nomeCliente = "Joãozinho";
        cli2.cpf = "038.138.947-29";
        c2.idConta = "2";
        c2.dataVencimento = "01/07/2025";
        c2.dataPagamento = "30/06/2025";
        p2.descrisaoProduto = "TV LED 42";
        p2.valorProduto = 2245.99;
        
        c1.visualizarConta(p1,cli1);
        c2.visualizarConta(p2,cli2);
        
        
    }
}
