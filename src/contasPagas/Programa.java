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
        
        cli1.setNomeCliente("Roberto"); 
        cli1.setCpf("212.301.402-32"); 
        c1.setIdConta("1");
        c1.setDataVencimento("05/07/2025"); 
        c1.setDataPagamento("03/07/2025");
        p1.setDescrisaoProduto("Notebook core i7"); 
        p1.setValorProduto(1500.89);
                
                
        cli2.setNomeCliente("Joãozinho");
        cli2.setCpf("038.138.947-29"); 
        c2.setIdConta("2"); 
        c2.setDataVencimento("01/07/2025");
        c2.setDataPagamento("30/06/2025");
        p2.setDescrisaoProduto("TV LED 42"); 
        p2.setValorProduto(2245.99);
        
        c1.visualizarConta(p1,cli1);
        c2.visualizarConta(p2,cli2);
        
        
    }
}
