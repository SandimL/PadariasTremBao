/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padariastrembao.model;

/**
 *
 * @author Lucas
 */
public final class Vendedor extends Funcionario{
    
    protected int nVendas;
    
    public Vendedor(String nome, String documento, String endereco, String telefone, float salario, int nVendas) {
        super(nome, documento, endereco, telefone, salario);
        this.nVendas = nVendas;
    }
    
}
