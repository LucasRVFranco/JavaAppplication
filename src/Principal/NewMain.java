/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Entidades.Cliente;
import Entidades.Produto;
import Entidades.Venda;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucasf
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Skol 600ml");
        p1.setEstoque(new BigDecimal("500"));
        p1.setValor(new BigDecimal("10"));

        Produto p2 = new Produto();
        p2.setNome("Combo de vodka");
        p2.setEstoque(new BigDecimal("8"));
        p2.setValor(new BigDecimal("300"));

         Cliente c1 = new Cliente();
        c1.setNome("Joao");
        c1.setCpf("000.000.000-00");
        c1.setRg("00.000.000-0");

         Venda v1 = new Venda();
        v1.setDataVenda(Calendar.getInstance());
        v1.setCliente(c1);
        v1.adicionarProdutos(p1, new BigDecimal("50"));
        v1.adicionarProdutos(p1, new BigDecimal("200"));
        v1.adicionarProdutos(p2, new BigDecimal("3"));

        System.out.println("Total da venda é: " + v1.getTotal());
        System.out.println("O estoque atual do produto " + p1.getNome() + " é: " + p1.getEstoque());
        System.out.println("O estoque atual do produto " + p2.getNome() + " é: " + p2.getEstoque());

    }
    
}
