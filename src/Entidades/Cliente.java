/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;


public class Cliente {
   private String nome;
   private String cpf;
   private String rg;
   private List<Cliente> clientes = new ArrayList<>();   
   
   
   
   public void cadastrarCliente(String nome, String cpf, String rg) {
       
       this.nome = nome;
       this.cpf = cpf;
       this.rg = rg;
       
       if(clientes.contains(this)){
           JOptionPane.showMessageDialog(null, "Este cliente já foi cadastrado");
       }else{
           clientes.add(this);
           JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
       }
  
   }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.rg);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.rg, other.rg);
    }
   
   
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
