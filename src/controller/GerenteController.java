/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadariaTremBao.controller;

import PadariaTremBao.model.Banco;
import PadariaTremBao.model.Cliente;
import PadariaTremBao.model.Fornecedor;
import PadariaTremBao.model.Funcionario;
import PadariaTremBao.model.Gerente;
import PadariaTremBao.model.Padeiro;
import PadariaTremBao.model.Vendedor;
import PadariaTremBao.view.GerenteView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class GerenteController {
    private final GerenteView view;

    public GerenteController(GerenteView view) {
        this.view = view;
    }
    
    public void editarCampos(boolean edita){
        view.getTxt_nome().setEditable(edita);
        view.getTxt_telefone().setEditable(edita);
        view.getTxt_rua().setEditable(edita);
        view.getTxt_numero().setEditable(edita);
        view.getTxt_bairro().setEditable(edita);
        view.getTxt_cidade().setEditable(edita);
        view.getTxt_estado().setEditable(edita);
    }
   
   public void setarCadastro(){
        view.getTxt_nome().setText(view.getUsuario().getNome());
        view.getTxt_cpf().setText(view.getUsuario().getDocumento());
        view.getTxt_telefone().setText(view.getUsuario().getTelefone());
        view.getTxt_funcao().setText("Gerente");
        view.getTxt_salario().setText(Float.toString(view.getUsuario().getSalario()));
        view.getTxt_rua().setText(view.getUsuario().getRua());
        view.getTxt_numero().setText(view.getUsuario().getNumero());
        view.getTxt_bairro().setText(view.getUsuario().getBairro());
        view.getTxt_cidade().setText(view.getUsuario().getCidade());
        view.getTxt_estado().setText(view.getUsuario().getEstado());
        view.getTxt_cargaHora_mes().setText(String.valueOf(view.getUsuario().getHorasTrabalhadas()));
    }
   
   public void editarCadastro(){
        view.getUsuario().setNome(view.getTxt_nome().getText());
        view.getUsuario().setDocumento(view.getTxt_cpf().getText());
        view.getUsuario().setTelefone(view.getTxt_telefone().getText());
        view.getUsuario().setRua(view.getTxt_rua().getText());
        view.getUsuario().setNumero(view.getTxt_numero().getText());
        view.getUsuario().setBairro(view.getTxt_bairro().getText());
        view.getUsuario().setCidade(view.getTxt_cidade().getText());
        view.getUsuario().setEstado(view.getTxt_estado().getText());
        Banco.editaGerente(view.getUsuario());
        JOptionPane.showMessageDialog(view, "Dados alterados");
        setarCadastro();
        editarCampos(false);
    }
    
    public void registrarPonto() throws ParseException {
        long diferencaH = 0;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        Date entrada = null;
        Date saida = null;
        entrada = format.parse(view.getTxt_dataEntrada().getText()+" "+view.getTxt_horaEntrada().getText());
        saida = format.parse(view.getTxt_dataSaida().getText()+" " +view.getTxt_horaSaida().getText());
        
        Calendar c_entrada = Calendar.getInstance();
        c_entrada.setTime(entrada);
        Calendar c_saida = Calendar.getInstance();
        c_saida.setTime(saida);
        
        diferencaH = (c_saida.getTimeInMillis() - c_entrada.getTimeInMillis())/(60*60*1000);
        
        if(diferencaH>0&&diferencaH<=12){
            view.getUsuario().setHorasTrabalhadas((int)diferencaH);
            view.exibirMensagem("Dados salvos com sucesso");
            editarCadastro();
            view.getTxt_dataEntrada().setText("");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaEntrada().setText("");
            view.getTxt_horaSaida().setText("");
        }else if(diferencaH>12){
            view.exibirMensagem("Você não pode trabalhar mais que 12 horas por dia!");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaSaida().setText("");
        }else{
            view.exibirMensagem("Data de sáida inválida");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaSaida().setText("");
        }
    }
    
    public void procurarCliente(){
        Cliente procura = new Cliente(view.getTxt_documentoC().getText());
        if(Banco.procuraCliente(procura)!=null){
            view.exibirMensagem("Cliente já cadastrado");
            view.getTxt_nomeC().setText("");
            view.getTxt_documentoC().setText("");
            view.getTxt_telefoneC().setText("");
            view.getTxt_ruaC().setText("");
            view.getTxt_numeroC().setText("");
            view.getTxt_bairroC().setText("");
            view.getTxt_cidadeC().setText("");
            view.getTxt_estadoC().setText("");
        }
    }    
    
    public void cadastrarCliente(){
        if(!view.getTxt_nomeC().getText().isEmpty() && 14==view.getTxt_documentoC().getText().trim().length() && view.getTxt_telefoneC().getText().trim().length()==14){
            Cliente cadastro = new Cliente(view.getTxt_nome().getText(), view.getTxt_telefoneC().getText(), 
                    view.getTxt_documentoC().getText(), view.getTxt_ruaC().getText(), 
                    view.getTxt_numeroC().getText(), view.getTxt_bairroC().getText(), 
                    view.getTxt_cidadeC().getText(), view.getTxt_estadoC().getText(), false, false);
            Banco.adicionarCliente(cadastro);
            view.exibirMensagem("Cliente Cadastrado");
            view.getTxt_nomeC().setText("");
            view.getTxt_documentoC().setText("");
            view.getTxt_telefoneC().setText("");
            view.getTxt_ruaC().setText("");
            view.getTxt_numeroC().setText("");
            view.getTxt_bairroC().setText("");
            view.getTxt_cidadeC().setText("");
            view.getTxt_estadoC().setText("");
        }else{
            view.exibirMensagem("Preencha pelo menos Nome, Documento e Telefone");
        }
    }
    
    public void procurarFornecedor(){
        Fornecedor procura = new Fornecedor(view.getTxt_documentoF().getText());
        if(Banco.procurarFornecedor(procura)!=null){
            view.exibirMensagem("Fornecedore já cadastrado");
            view.getTxt_nomeF().setText("");
            view.getTxt_documentoF().setText("");
            view.getTxt_telefoneF().setText("");
            view.getTxt_ruaF().setText("");
            view.getTxt_numeroF().setText("");
            view.getTxt_bairroF().setText("");
            view.getTxt_cidadeF().setText("");
            view.getTxt_estadoF().setText("");
        }
    }
    
    public void cadastrarFornecedor(){
        if(!view.getTxt_nomeF().getText().isEmpty() && 18==view.getTxt_documentoF().getText().trim().length() && view.getTxt_telefoneF().getText().trim().length()==14){
            Fornecedor cadastro = new Fornecedor(view.getTxt_nomeF().getText(), view.getTxt_telefoneF().getText(), 
                    view.getTxt_documentoF().getText(), view.getTxt_ruaF().getText(), 
                    view.getTxt_numeroF().getText(), view.getTxt_bairroF().getText(), 
                    view.getTxt_cidadeF().getText(), view.getTxt_estadoF().getText());
            Banco.adicionarFornecedor(cadastro);
            view.exibirMensagem("Fornecedor Cadastrado");
            view.getTxt_nomeF().setText("");
            view.getTxt_documentoF().setText("");
            view.getTxt_telefoneF().setText("");
            view.getTxt_ruaF().setText("");
            view.getTxt_numeroF().setText("");
            view.getTxt_bairroF().setText("");
            view.getTxt_cidadeF().setText("");
            view.getTxt_estadoF().setText("");
        }else{
            view.exibirMensagem("Preencha pelo menos Nome, Documento e Telefone");
        }
    }
    
    public void procurarFuncionario(){
        Funcionario procura = new Funcionario(view.getTxt_documentoFu().getText());
        if(Banco.procuraPadeiro((Padeiro) procura)!=null&&Banco.procuraVendedor((Vendedor) procura)!=null&&Banco.procuraGerente((Gerente) procura)!=null){
            view.exibirMensagem("Funcionário já cadastrado");
            view.getTxt_nomeF().setText("");
            view.getTxt_documentoF().setText("");
            view.getTxt_telefoneF().setText("");
            view.getTxt_ruaF().setText("");
            view.getTxt_numeroF().setText("");
            view.getTxt_bairroF().setText("");
            view.getTxt_cidadeF().setText("");
            view.getTxt_estadoF().setText("");
        }
    }
    
    public void cadastrarFuncionario(){
        if(!view.getTxt_nomeFu().getText().isEmpty() && 14==view.getTxt_documentoFu().getText().trim().length() && view.getTxt_telefoneFu().getText().trim().length()==14){
            if(view.getjCB_funcao().getSelectedItem().equals("Padeiro")){
                Padeiro cadastro = new Padeiro(view.getTxt_nomeFu().getText(), view.getTxt_telefoneFu().getText(), 
                    view.getTxt_documentoFu().getText(), view.getTxt_ruaFu().getText(), 
                    view.getTxt_numeroFu().getText(), view.getTxt_bairroFu().getText(), 
                    view.getTxt_cidadeFu().getText(), view.getTxt_estadoFu().getText(), "Senha");
                Banco.adicionarPadeiro(cadastro);
            
            }else if(view.getjCB_funcao().getSelectedItem().equals("Vendedor")){

            }else if (view.getjCB_funcao().getSelectedItem().equals("Gerente")){

            }
            view.exibirMensagem("Fornecedor Cadastrado");
            view.getTxt_nomeFu().setText("");
            view.getTxt_documentoFu().setText("");
            view.getTxt_telefoneFu().setText("");
            view.getTxt_ruaFu().setText("");
            view.getTxt_numeroFu().setText("");
            view.getTxt_bairroFu().setText("");
            view.getTxt_cidadeFu().setText("");
            view.getTxt_estadoFu().setText("");
        }else{
            view.exibirMensagem("Preencha pelo menos Nome, Documento e Telefone");
        }
    }
    
    public void procurarProduto(){
        
    }
    
    public void cadastrarProduto(){
        
    }
    
}
