/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_facade_2023;

/**
 *
 * @author nando
 */
public class ProcessadorDePagamento {
    public boolean processarPagamento(String codigoBoleto, double valor){
        // código do processamento do Pagamento
        
        if(valor > 0){
            System.out.println("Codigo do Boleto: "+codigoBoleto);
            System.out.println("Valor do Boleto: "+valor);
            return true;
        }else return false;
    }
}
