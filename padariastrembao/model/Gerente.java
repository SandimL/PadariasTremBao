/*
 * 
 * 
 * 
 */
package padaria.model;
/**
 *
 *
 */
public class Gerente extends Funcionario{
    private boolean confianca;

    public Gerente(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, String senha, boolean confianca){
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 2500f, senha);
        this.confianca = confianca;
    }

    public boolean isConfianca() {
        return confianca;
    }

    public void setConfianca(boolean confianca) {
        this.confianca = confianca;
    }
}
