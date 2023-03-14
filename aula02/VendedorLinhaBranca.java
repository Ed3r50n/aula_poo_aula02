package aula02;

public class VendedorLinhaBranca extends Funcionario{

        Double vlbvendas;
        Double comissao;
        
        void calcComisaao(){
            if (vlbvendas<=1000.0)
                comissao = vlbvendas*1.5/100;
            else if (vlbvendas <= 30000.0);
                 comissao = vlbvendas*2.5/100;
            else 
                comissao = vlbvendas * 3.5/100;
        }
        void calcSalario() {
            salario = salario + comissao - imposto;
        }

    void calcComissao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}