/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_facade_2023;

/**
 *
 * @author nando
 */
public class SistemaDePagamento {
    private ValidadorDePagamentos validador;
    private GeradorDeBoleto gerador;
    private ProcessadorDePagamento processador;
    
    public SistemaDePagamento(){
        validador = new ValidadorDePagamentos();
        gerador = new GeradorDeBoleto();
        processador = new ProcessadorDePagamento();
    }
    
    public void realizarPagamento(String nome, String email, double valor){
        boolean valido = validador.validarPagamento(nome, email, valor);
        
        if(valido){
            String codigoBoleto = gerador.gerarBoleto(nome,email,valor);
            boolean processado = processador.processarPagamento(codigoBoleto,valor);
            
            if(processado){
                System.out.println("Pagamento realizado com sucesso.");
            }else{
                System.out.println("Erro ao processar pagamento!");
            }
        }else{
            System.out.println("Dados do pagamento invalidos!");
        }
    }
}
