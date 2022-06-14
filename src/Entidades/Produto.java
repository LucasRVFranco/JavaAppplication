/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;


public class Produto {
    
    private Integer id;
    private String nome;
    private BigDecimal estoque;
    private BigDecimal valor;
    private List<Produto> listaProduto = new ArrayList<>();
    
    public void cadastroProduto(String nome, BigDecimal estoque, BigDecimal valor){
        String resposta = "s";
        
        if(valor == new BigDecimal(0)){
          resposta = JOptionPane.showInputDialog("Este produto irá ficar sem valor?s/n");
          if(resposta.equalsIgnoreCase("s")){
             this.nome = nome;
             this.estoque = estoque;
             this.valor = valor;
             JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
             this.id = this.id + 1;
             listaProduto.add(this);
          }else{
              
              this.nome = nome;
              this.estoque = estoque;
              this.valor = new BigDecimal(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
              this.id = this.id + 1;
              JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
              listaProduto.add(this);
          }
        }else{
            this.nome = nome;
             this.estoque = estoque;
             this.valor = valor;
             this.id = this.id + 1;
             JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
             listaProduto.add(this);
        }
       
    
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getEstoque() {
        return estoque;
    }

    public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
}
