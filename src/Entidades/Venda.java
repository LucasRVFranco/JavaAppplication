/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucasf
 */
public class Venda {

    private Calendar dataVenda;
    private BigDecimal total;
    private List<ItemVenda> itemvenda = new ArrayList<>();
    private Cliente cliente;
    private List<Venda> venda = new ArrayList<>();
    private Produto p;
    private ItemVenda i;
    private final List<Produto> listaProduto = new ArrayList<>();
  

   /* public void venda(Cliente cliente) {

        for (ItemVenda item : this.itemvenda) {
            setTotal(getTotal().add(item.getSubTotal()));
        }
        this.dataVenda = Calendar.getInstance();
        this.cliente = cliente;
        venda.add(this);

    }*/

    public void adicionarProdutos(Produto produto, BigDecimal quantidade) {
        ItemVenda i = new ItemVenda();
              
        if (produto.getEstoque().compareTo(quantidade) >= 0) {
            if(itemvenda.contains(produto)){
                
            i.setQuantidade(i.getQuantidade().add(quantidade));
            produto.setEstoque(produto.getEstoque().subtract(quantidade));
            i.setSubTotal(produto.getValor().multiply(quantidade));
            total = i.getSubTotal();
            }
            produto.setEstoque(produto.getEstoque().subtract(quantidade));
            i.setProduto(produto);
            i.setQuantidade(quantidade);
            i.setSubTotal(produto.getValor().multiply(quantidade));
            itemvenda.add(i);
            total = i.getSubTotal();
        } else {
            JOptionPane.showMessageDialog(null, "Estoque insuficiente, estoque atual: " + produto.getEstoque());
        }
        

    }
    
//    public void ExcluirProduto(ItemVenda i, BigDecimal quantidade ){
//        
//        if(itemvenda.contains(i)){
//            i.setQuantidade(i.getQuantidade().subtract(quantidade));
//            p.setEstoque(p.getEstoque().add(quantidade));
//            i.setSubTotal(i.getSubTotal().subtract(p.getValor().multiply(quantidade))); 
//        }
//        
//    }

    public List<Venda> getVenda() {
        return venda;
    }

    public void setVenda(List<Venda> venda) {
        this.venda = venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<ItemVenda> getItemvenda() {
        return itemvenda;
    }

    public void setItemvenda(List<ItemVenda> itemvenda) {
        this.itemvenda = itemvenda;
    }

}
