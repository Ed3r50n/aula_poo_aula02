/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author aluno.un2
 */
public class TesteFuncionario {
    
    public static void main (String[] args){
        
        Bairro b1 = new Bairro(1, "Centro");
        Bairro b2 = new Bairro(2, "Cachoeirinha");
        Bairro b3 = new Bairro(3, "São José");
        Bairro b4 = new Bairro(4, "Ponta Negra");
        
        Funcionario fun = new Funcionario();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a matrícula do funcionario: ");
        fun.matric = input.nextInt();
        System.out.println("Unforme o nome do funcionario: ");
        fun.nome = input.next();
        System.out.println("Informe o salario do funcionario");
        fun.salario= input.nextDouble();
        
        System.out.println("O Bairro 1: "+b1.nome);
        System.out.println("O Bairro 2: "+b2.nome);
        System.out.println("O Bairro 3: "+b3.nome);
        System.out.println("O Bairro 4: "+b4.nome);
        
        System.out.println("Informe o codigo do Bairro: ");
        int x = input.nextInt();
        
        switch (x){
            
            case 1:
                fun.bairro = b1;
                break;
            case 2:
                fun.bairro = b2;
                break;
            case 3:
                fun.bairro = b3;
                break;
            case 4:
                fun.bairro = b4;
                break;
        }
       
        
            
       VendedorLinhaBranca vlb =  new VendedorLinhaBranca();
        
        
        System.out.println("\nInforme a matrícula do vendedor: ");
        vlb.matric = input.nextInt();
        System.out.println("Unforme o nome do vendedor: ");
        vlb.nome = input.next();
        System.out.println("Informe o salario do vendedor");
        vlb.salario= input.nextDouble();
        
        System.out.println("\nO Bairro 1: "+b1.nome);
        System.out.println("O Bairro 2: "+b2.nome);
        System.out.println("O Bairro 3: "+b3.nome);
        System.out.println("O Bairro 4: "+b4.nome);
        
        System.out.println("Informe o codigo do Bairro: ");
        int z = input.nextInt();
        
        switch (z){
            
            case 1:
                fun.bairro = b1;
                break;
            case 2:
                fun.bairro = b2;
                break;
            case 3:
                fun.bairro = b3;
                break;
            case 4:
                fun.bairro = b4;
                break;
        }
            
       
        vlb.calcImposto();
        vlb.calcComissao();
       
        System.out.println("O funcionário: "+fun.nome);
        System.out.println("O imposto: R$ "+fun.imposto);
        System.out.println("O salário inicial: R$  "+fun.salario);
        
        fun.calcsalario();
        
        System.out.println("O salario final: R$"+fun.salario);
        System.out.println("O Bairro: "+fun.bairro.nome);  
        
        
        System.out.println("O vendedor: "+fun.nome);
        System.out.println("O imposto: R$ "+fun.imposto);
        System.out.println("O salário inicial: R$  "+fun.salario);
        System.out.println("O Imposto : R&"+vlb.imposto);
        System.out.println("A comissao : R&"+vlb.comissao);
        fun.calcsalario();
        
        System.out.println("O salario final: R$"+fun.salario);
        System.out.println("O Bairro: "+fun.bairro.nome);  
    }       
}
