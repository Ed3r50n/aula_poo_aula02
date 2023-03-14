package aula02;

public class VendedorEletronico extends Funcionario{
     Double vlevendas;
     Double comissao;

      
     void calcComisaao(){
    if (vlevendas<=15000.0)
              comissao = vlevendas*2/100;

            
    else if (vlevendas <= 40000.0);
                comissao = vlevendas * 3/100;
                
    else
        comissao = vlevendas * 4/100;

        }
    void calcSalario() {
            salario = salario + comissao - imposto;
        }

    void calcComissao() {
        

}