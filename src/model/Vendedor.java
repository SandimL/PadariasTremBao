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
public class Vendedor extends Funcionario{
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
}
