/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadariaTremBao.controller;

import PadariaTremBao.model.Banco;
import PadariaTremBao.model.Cliente;
import PadariaTremBao.view.CadastrarCliente;
import PadariaTremBao.view.VendedorView;

/**
 *
 * @author Paulo
 */
public class ClienteController {
    private final CadastrarCliente view;
    private VendedorController controller;

    public ClienteController(CadastrarCliente view, VendedorController controller) {
        this.view = view;
        this.controller = controller;
    }
    
    public void cadastrarCliente(){
        if(!view.getTxt_nome().getText().isEmpty() && 14==view.getTxt_documento().getText().trim().length() && view.getTxt_telefone().getText().trim().length()==14){
            Cliente cadastro = new Cliente(view.getTxt_nome().getText(), view.getTxt_telefone().getText(), 
                    view.getTxt_documento().getText(), view.getTxt_rua().getText(), 
                    view.getTxt_numero().getText(), view.getTxt_bairro().getText(), 
                    view.getTxt_cidade().getText(), view.getTxt_estado().getText(), false, false);
            Banco.adicionarCliente(cadastro);
            view.exibirMensagem("Cliente Cadastrado");
            controller.loadComboBoxCliente();
            view.dispose();
        }else{
            view.exibirMensagem("Preencha pelo menos Nome, Documento e Telefone");
        }
    }
    
    public void procurarCliente(){
        Cliente procura = new Cliente(view.getTxt_documento().getText());
        if(Banco.procuraCliente(procura)!=null){
            view.exibirMensagem("Cliente já cadastrado");
            view.getTxt_nome().setText("");
            view.getTxt_documento().setText("");
            view.getTxt_telefone().setText("");
            view.getTxt_rua().setText("");
            view.getTxt_numero().setText("");
            view.getTxt_bairro().setText("");
            view.getTxt_cidade().setText("");
            view.getTxt_estado().setText("");
        }
    }
    
}
