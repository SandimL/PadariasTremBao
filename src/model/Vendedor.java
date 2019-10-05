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
public class Vendedor extends Funcionario implements Relatorio{
    private float vendasRealizadas;

    public Vendedor(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, String senha, float vendasRealizadas) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 1300f, senha);
        this.vendasRealizadas = vendasRealizadas;
        this.horasTrabalhadas = 0;
    }

    public Vendedor() {
    }

    public float getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(float vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }

    @Override
    public String getInfo() {
        String txt = "";       
        txt += "=====================================================================\n" +
                "Informações Fornecedor: \n" +
                "Nome: " + super.getNome() +"\n"+
                "Telefone: " + super.getTelefone() +"\n"+
                "Endereço: " + super.getEnderecoCompleto()+"\n"+
                "Vendas realizadas: " + getVendasRealizadas()+"\n"+
                "Horas trabalhadas: " + getHorasTrabalhadas()+"\n"+
                "=====================================================================\n";
        return txt;  
    }
}
