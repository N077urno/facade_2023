/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_facade_2023;

/**
 *
 * @author nando
 */
public class PP_Facade_2023 {

    public static void main(String[] args) {
        SistemaDePagamento sistemaDePagamento = new SistemaDePagamento();
        sistemaDePagamento.realizarPagamento("Joao","Joao@email.com",100.0);
        
        sistemaDePagamento.realizarPagamento("José","jose@email.com",200.50);
        
        sistemaDePagamento.realizarPagamento("Fernando", "fernando@ifgoiano.edu.br",10);
    }
}
