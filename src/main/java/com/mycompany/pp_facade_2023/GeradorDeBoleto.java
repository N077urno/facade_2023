/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_facade_2023;

/**
 *
 * @author nando
 */
public class GeradorDeBoleto {
    public String gerarBoleto(String nome, String email, double valor){
        //código para a geração do boleto
        char[] codigo1,codigo2,codigo3;
        String convert,codigoDeBarras="";
        
        codigo1 = nome.toCharArray();
        codigo2 = email.toCharArray();
        convert = String.valueOf(valor);
        codigo3 = convert.toCharArray();
        
        for(int i=0;i<codigo1.length;i++){
            codigoDeBarras += (int)codigo1[i];            
        }
        
        for(int i=0;i<codigo2.length;i++){
            codigoDeBarras += (int)codigo2[i];
        }
        
        for(int i=0;i<codigo3.length;i++){
            codigoDeBarras += (int)codigo3[i];
        }
        
        return(codigoDeBarras);
    }
}
