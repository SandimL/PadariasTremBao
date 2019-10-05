/*
 * 
 * 
 * 
 */
package model;
/**
 *
 *
 */
public class Gerente extends Funcionario implements Relatorio{

    public Gerente(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, String senha, float salario){
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 2500f, senha);
        setSalarioBonus(salario);
    }

    
    private void setSalarioBonus(float salario){
        salario += (salario * 0.2);
        super.setSalario(salario);
    }

    @Override
    public String getInfo() {
        String txt = "";       
        txt += "=====================================================================\n" +
                "Informações gerente: \n" +
                "Nome: " + super.getNome() +"\n"+
                "Telefone: " + super.getTelefone() +"\n"+
                "Endereço: " + super.getEnderecoCompleto()+"\n"+
                "=====================================================================\n";
        return txt;
    }
    
    
}
