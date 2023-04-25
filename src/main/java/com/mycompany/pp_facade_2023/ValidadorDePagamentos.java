/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_facade_2023;

/**
 *
 * @author nando
 */
public class ValidadorDePagamentos {
    public boolean validarPagamento(String nome, String email, double valor){
        // código de validação do pagamento aqui
        
        if(!(nome.equals(email))&&(valor > 0)){
            return true;
        }else return false;
    }
}
