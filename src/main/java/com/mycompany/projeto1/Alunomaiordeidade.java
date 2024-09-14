/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Alunomaiordeidade {

    public static void main(String[] args) {
        //ENTRADA
        
        Scanner scanner = new Scanner(System.in);
        int idade;
        
        System.out.println("----- Programa de comparação maior idade -----");
        System.out.println("Digite a idade");
        idade=scanner.nextInt();
        
        //PROCESSAMENTO
        if(idade>=18) {
            System.out.println("Aluno maior de idade");
            
        }else{
            
            System.out.println("Aluno menor de idade");
            }
        
    }
}
