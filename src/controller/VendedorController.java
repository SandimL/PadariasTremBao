/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadariaTremBao.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import PadariaTremBao.model.Banco;
import PadariaTremBao.model.Cliente;
import PadariaTremBao.model.Estoque;
import PadariaTremBao.model.Produto;
import PadariaTremBao.model.Venda;
import PadariaTremBao.view.VendedorView;
import java.awt.CardLayout;

/**
 *
 * @author Paulo
 */
public class VendedorController {
    private final VendedorView view;
    private Venda venda;
   
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
        view.getTxt_cargaHora_mes().setText(Float.toString(view.getUsuario().getHorasTrabalhadas()));
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
        
        if(diferencaH>0&&diferencaH<=10){
            view.getUsuario().setHorasTrabalhadas((int)diferencaH);
            view.exibirMessagem("Dados salvos com sucesso");
            editarCadastro();
            view.getTxt_dataEntrada().setText("");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaEntrada().setText("");
            view.getTxt_horaSaida().setText("");
        }else if(diferencaH>9){
            view.exibirMessagem("Você não pode trabalhar mais que 10 horas por dia!");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaSaida().setText("");
        }else{
            view.exibirMessagem("Data de sáida inválida");
            view.getTxt_dataSaida().setText("");
            view.getTxt_horaSaida().setText("");
        }
    }
    
    public void loadTableEstoque(){
        Estoque estoque = Banco.getEstoque();
        Produto[] produtoEstoque = estoque.getProdutos();
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Produto", "Quantidade", "Preço/Unidade"}, 0);
        //DefaultTableModel modelo = (DefaultTableModel) view.getjT_estoque().getModel();
        for(int i=0; i<produtoEstoque.length; i++){
            if(produtoEstoque[i]!=null){
                if(produtoEstoque[i].getQntProduto()>0){
                    Object linha[] = new Object[]{produtoEstoque[i].getIdproduto(), produtoEstoque[i].getNome(), produtoEstoque[i].getQntProduto(), produtoEstoque[i].getPrecoCusto()};
                    modelo.addRow(linha);
                }
            }
        }
        view.getjT_estoque().setModel(modelo);
        
    }
    
    public void loadComboBoxCliente(){
        ArrayList<Cliente> clientes = Banco.getClientes();
        view.getjCB_cliente().removeAllItems();
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i)!=null){
                view.getjCB_cliente().addItem(clientes.get(i).getNome());
            }
        }
    }
    
    public void loadTableCarrinho(){
        Produto[] produtoCarrinho = this.venda.getProdutos();
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Produto", "Quantidade", "Valor Total"}, 0);
        //DefaultTableModel modelo = (DefaultTableModel) view.getjT_estoque().getModel();
        for (int i=0; i<produtoCarrinho.length; i++) {
            if (produtoCarrinho[i] != null) {
                if(produtoCarrinho[i].getQntProduto()>0){
                    float valorTotal = produtoCarrinho[i].getQntProduto() * produtoCarrinho[i].getPrecoCusto();
                    Object[] linha = new Object[]{produtoCarrinho[i].getIdproduto(), produtoCarrinho[i].getNome(), produtoCarrinho[i].getQntProduto(), valorTotal};
                    modelo.addRow(linha);
                }
            }
        }
        view.getjT_carrinho().setModel(modelo);
    }
    
    public void iniciarVenda(){
        venda = new Venda(view.getTxt_dataVenda().getText(), view.getUsuario());
        view.getTxt_subTotal().setText("");
        view.exibirMessagem("Venda Iniciada!");
    }
    
    public void adicionarProdutoVenda(){
        String nomeP = (String) view.getjT_estoque().getValueAt(view.getjT_estoque().getSelectedRow(), 1);
        int idP = (int) view.getjT_estoque().getValueAt(view.getjT_estoque().getSelectedRow(), 0);
        int qnt = (int) view.getjS_addCarinho().getValue();
        String estoqueRetorno = Banco.removeProdutoEstoque(new Produto(nomeP, idP), qnt);
        Produto p = Banco.procuraProdutoEstoque(new Produto(nomeP, idP));
        Produto prod = new Produto(p.getNome(), p.getIdproduto(), p.getFornecedor(), p.getPrecoCusto(), p.isPerecivel(), p.getApelido(), qnt);
        if(!"Não encontrado".equals(estoqueRetorno)&&!"Estoque não possui essa quantidade".equals(estoqueRetorno))
        {
            if(!estoqueRetorno.equals("Removido"))
            {
                view.exibirMessagem(estoqueRetorno);
            }
            System.out.println(prod.getPrecoCusto());
            venda.addProdutoVenda(prod);
            
        }else{
            view.exibirMessagem(estoqueRetorno);
        }
        venda.setValorVenda();
        view.getTxt_subTotal().setText(String.valueOf(venda.getValorVenda()));
        loadValores();
        loadTableCarrinho();
        loadTableEstoque();
    }
    
    public void removerProdutoVenda(){
        String nomeP = (String) view.getjT_carrinho().getValueAt(view.getjT_carrinho().getSelectedRow(), 1);
        int idP = (int) view.getjT_carrinho().getValueAt(view.getjT_carrinho().getSelectedRow(), 0);
        int qnt = (int) view.getjS_removeCarrinho().getValue();
        String carrinhoRetorno = venda.removeProdutoVenda(new Produto(nomeP, idP, qnt));
        Produto p = Banco.procuraProdutoEstoque(new Produto(nomeP, idP));
        Produto prod = new Produto(p.getNome(), p.getIdproduto(), p.getFornecedor(), p.getPrecoCusto(), p.isPerecivel(), p.getApelido(), qnt);
        if(!"Não encontrado".equals(carrinhoRetorno)&&!"Estoque não possui essa quantidade".equals(carrinhoRetorno))
        {
            String r = Banco.adicionarProdutoEstoque(prod, qnt);
            
        }else{
            view.exibirMessagem("Carrinho não possui essa quantidade");
        }
        venda.setValorVenda();
        view.getTxt_subTotal().setText(String.valueOf(venda.getValorVenda()));
        loadValores();
        loadTableCarrinho();
        loadTableEstoque();
    }
    
    public void loadValores(){
        if(!view.getTxt_desconto().getText().equals("")){
            if(view.getTxt_desconto().getText().equals("5%")){
                System.out.println("5%");
                float valorComDesconto = (float) (venda.getValorVenda() - venda.getValorVenda()*0.05);
                view.getTxt_valorAPagar().setText(String.valueOf(valorComDesconto));
            }else if (view.getTxt_desconto().getText().equals("10%")){
                System.out.println("10%");
                float valorComDesconto = (float) (venda.getValorVenda() - venda.getValorVenda()*0.1);
                view.getTxt_valorAPagar().setText(String.valueOf(valorComDesconto));
            }else{
                System.out.println("resto");
                view.getTxt_valorAPagar().setText(String.valueOf(venda.getValorVenda()));
            }
        }
    }
    
    public void salvarVenda(){
        venda.setPagamento((String) view.getjCB_formaPagamento().getSelectedItem());
        if(view.getBtnR_aPrazo().isSelected()){
            if((int)view.getjS_quantidadeParcelas().getValue()!=0){
                venda.setParcelas((int)view.getjS_quantidadeParcelas().getValue());
            }
        }
        Banco.salvarVenda(venda);
        view.exibirMessagem("Venda concluida");
        CardLayout cl = (CardLayout) view.getjP_principal().getLayout();
        cl.show(view.getjP_principal(), "Inicio");
    }
    
    public void setarDesconto(String nome){
        Cliente cliente = Banco.procuraCliente(nome);
        
        if(cliente.isGold()){
            view.getTxt_desconto().setText("5%");
        }else if(cliente.isPlatina()){
            view.getTxt_desconto().setText("10%");
        }else{
            view.getTxt_desconto().setText("0");
        }
    }
    
    public void setarCliente(String nome){
        Cliente cliente = Banco.procuraCliente(nome);
        venda.setCliente(cliente);
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    
}
