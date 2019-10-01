/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import padaria.model.Banco;
import padaria.view.VendedorView;

/**
 *
 * @author Paulo
 */
public class VendedorController {
    private final VendedorView view;
   
   public VendedorController(VendedorView view){
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
        view.getTxt_funcao().setText("Vendedor");
        view.getTxt_salario().setText(String.valueOf(view.getUsuario().getSalario()));
        view.getTxt_rua().setText(view.getUsuario().getRua());
        view.getTxt_numero().setText(view.getUsuario().getNumero());
        view.getTxt_bairro().setText(view.getUsuario().getBairro());
        view.getTxt_cidade().setText(view.getUsuario().getCidade());
        view.getTxt_estado().setText(view.getUsuario().getEstado());
        view.getTxt_cargaHora_mes().setText(String.valueOf(view.getUsuario().getHorasTrabalhadas()));
        view.getTxt_vendasRealizadas().setText(String.valueOf(view.getUsuario().getVendasRealizadas()));
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
        Banco.editaVendedor(view.getUsuario());
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
        
        if(diferencaH>0&&diferencaH<9){
            view.getUsuario().setHorasTrabalhadas((int)diferencaH);
            view.exibirMessagem("Dados salvos com sucesso");
            editarCadastro();
            view.getTxt_dataEntrada().setText("");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaEntrada().setText("");
            view.getTxt_horaSaida().setText("");
        }else if(diferencaH>9){
            view.exibirMessagem("Você não pode trabalhar mais que 9 horas por dia!");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaSaida().setText("");
        }else{
            view.exibirMessagem("Data de sáida inválida");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaSaida().setText("");
        }
    }
}
