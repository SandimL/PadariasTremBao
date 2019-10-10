/*
 * Alunos do Grupo
 * Paulo Rogério Pereira Franco
 * Gustavo Coutinho
 */
package PadariaTremBao.model;
/**
 * Classe Fornecedor que irá todos os Fornecedores da padaria, extende a classe Pessoa
 */
public class Fornecedor extends Pessoa{
    //Atributos da classe
    private boolean recorrente;

    //Construtor atribuindo todos os valores aos atributos
    public Fornecedor(String nome, String telefone, String documento, String enderecoRua, String enderecoNumero, String enderecoBairro, String enderecoCidade, String enderecoEstado) {
        super(nome, telefone, documento, enderecoRua, enderecoNumero, enderecoBairro, enderecoCidade, enderecoEstado);
        this.recorrente = false;
    }    

    //Contrutor atritubindo apenas o documento ao atributo
    public Fornecedor(String documento) {
        super(documento);
    }
    
    //Contrutor vazio
    public Fornecedor() {
    }

    //GETTERS e SETTERS dos atributos
    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }
    
    //Método que retorna as informações do Fornecedor
    @Override
    public String getInfo(){
        String txt = super.getInfo();
        if(this.recorrente){
            txt+= "Fornecedor recorrente\n";
        }
        return txt;
    }
}
