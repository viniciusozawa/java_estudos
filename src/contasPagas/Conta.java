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
public class Conta {
    String idConta;
    String dataVencimento;
    String dataPagamento;
    
    
    public void visualizarConta(Produto pro, Cliente cli){
        System.out.println("CONTAS PAGAS");
        System.out.println("IDENTIFICADOR: "+this.idConta);
        System.out.println("PRODUTO: "+pro.descrisaoProduto);
        System.out.println("CLIENTE: "+cli.nomeCliente+" CPF: "+cli.cpf);
        System.out.println("VALOR: "+pro.valorProduto);
        System.out.println("DATA VENCIMENTO: "+this.dataVencimento);
        System.out.println("DATA PAGAMENTO: "+this.dataPagamento);
        System.out.println("_______________________________");
    }
    
    
}
