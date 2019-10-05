/*
 * 
 * 
 */
package controller;

import java.util.ArrayList;
import model.Banco;
import model.Funcionario;
import model.Padeiro;
import model.Vendedor;
import view.LoginView;
import view.PadeiroView;
import view.VendedorView;

/**
 *
 * 
 */
public class LoginController {
    private final LoginView view;
    
    public LoginController(LoginView view){
        this.view = view;
    }
    
    public void checkLogin(){
        boolean encontrou = false;
        String login = view.getTxt_login().getText();
        String senha = new String(view.getTxt_senha().getPassword());
        if(Banco.procuraPadeiro(login)!=null){
            if(Banco.procuraPadeiro(login).getSenha().equals(senha)){
                view.exibirMessagem("Seja bem vindo!");
                PadeiroView padeiroView = new PadeiroView(Banco.procuraPadeiro(login));
                padeiroView.setVisible(true);
                view.dispose();
            }else{
                view.exibirMessagem("Senha incorreta");
            }
        }else if(Banco.procuraVendedor(login)!=null){
            if(Banco.procuraVendedor(login).getSenha().equals(senha)){
                view.exibirMessagem("Seja bem vindo!");
                VendedorView vendedorView = new VendedorView(Banco.procuraVendedor(login));
                vendedorView.setVisible(true);
                view.dispose();
            }else{
                view.exibirMessagem("Senha incorreta");
            }
        }       
        
    }
   
}
