/*
 * 
 * 
 * 
 */
package PadariaTremBao.model;
/**
 * Classe Funcionário que extende a classe Pessoa por meio de Herança
 * Atributos adicionais Salario e Senha
 * Todo e qualquer funcionario da Padaria
 * Será extendida pelas classes Padeiro, Vendedor e Gerente
 */
public class Funcionario extends Pessoa{
    //Declaração dos atributos todos protected
    protected float salario;//Atributo salario
    protected String senha;//Atributo senha
    protected int horasTrabalhadas;

    //Construtor da classe Funcionario atribuindo todos os valores aos atributos
    public Funcionario(String nome, String telefone, String documento, 
            String rua, String numero, String bairro, String cidade, 
            String estado, float salario, String senha) {
        //Através do prefixo Super chama o construtor da classe Pessoa
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado);
        this.salario = salario;
        this.senha = senha;
    }

    //Construtor da classe Funcionario atribuindo somente valores aos atributos
    //Documento e Senha
    public Funcionario(String documento, String senha) {
        super(documento);
        this.senha = senha;
    }

    //Construtor da classe Funcionario vazio
    public Funcionario() {
    }

    //Métodos GETTERS e SETTERS dos atributos
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }
    
    
    //Método que verifica se o usuario e senha são iguais
    //Caso afirmativo retorna Verdadeiro
    //Caso contrário retorna Falso
    public boolean chekcLogin(Funcionario check){
        boolean valido = documento.equals(check.getDocumento()) && senha.equals(check.getSenha());
        return valido;
    }
}
