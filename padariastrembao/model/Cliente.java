/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padariastrembao.model;


import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Lucas
 */
public final class Cliente extends Pessoa{
    
    protected String telefone;
    protected JSONObject jsonObject;
    
    public Cliente(String nome, String documento, String endereco, String telefone) {
        super(nome, documento, endereco);
        this.telefone = telefone;
        jsonObject = (JSONObject) parser.parse(new FileReader(
                    "saida.json"));
    }

    public String getTelefone() throws JSONException {
        String tel = (String) jsonObject.get("telefone");
        return tel;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
