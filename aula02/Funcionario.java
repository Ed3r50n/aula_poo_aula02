package aula02;

public class Funcionario {
    Integer matric;
    String nome;
    Double salario;
    Double imposto;
    Bairro bairro;
    
    void calcImposto() {
        if(salario <= 1300.0)
            imposto = 0.0;
        else if(salario <= 2800.0)
            imposto = salario * 6/100;
        else
            imposto = salario * 12/100; 
    }
    
    void calcsalario() {
        calcImposto();
         salario = salario - imposto;
    }
}