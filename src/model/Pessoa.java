/*
 * Alunos do Grupo
 * Paulo Rogério Pereira Franco
 * Gustavo Coutinho
 * 
 */
package PadariaTremBao.model;
/**
 * Classe abstrata Pessoa que possui atributos Nome, Telefone, Documento e Endereço
 * Será Super das classes Funcionário, Cliente e Fornercedor
 */
public abstract class Pessoa implements Relatorio{
    //Declaração dos atributos pertecentes a classe, todos protected;
    protected String nome;
    protected String telefone;
    protected String documento;
    protected String rua;
    protected String numero;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String enderecoCompleto;

    //Construtor da classe Pessoa atribuindo todos os valores aos atributos
    public Pessoa(String nome, String telefone, String documento, String rua, 
            String numero, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.setEnderecoCompleto();
    }
    
    //Construtor da classe Pessoa atribuindo somente o atributo documento 
    public Pessoa(String documento){
        this.documento = documento;
    }
    //Contrutor da classe Pessoa vazio
    public Pessoa(){
        
    }
    
    //Método que verifica se dois objetos da classe Pessoa da classe são iguais
    public boolean equals(Pessoa compara){
        return documento.equals(compara.getDocumento());
    }

    //Métodos GETTERS E SETTER dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Método SETTER que associa o endereço completo em apenas um atributo
    public void setEnderecoCompleto() {
        this.enderecoCompleto = "Rua: " + rua + ", " + numero +
                ". " + bairro + 
                " - " + cidade + 
                "/" + estado;
    }
    
    
    @Override
    public String getInfo(){
        String txt = "";
        txt += "=====================================================================\n" +
                "Nome: " + this.getNome() +"\n"+
                "Documento: " + this.getDocumento() + "\n"+
                "Telefone: " + this.getTelefone() +"\n"+
                "Endereço: \n" + this.getEnderecoCompleto()+"\n";
        
        return txt;
    }
}
