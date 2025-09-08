/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estabelecimento;

import cardapio.Item;
import cliente.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Pedro Rossi
 */
public class Estabelecimento {
    private String nome;
    private List<Item> cardapio;
    private List<Pedido> pedidos = new ArrayList<>();
    private int numero_de_pedidos = 0;

    public Estabelecimento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getCardapio() {
        return cardapio;
    }

    public void setCardapio(List<Item> cardapio) {
        this.cardapio = cardapio;
    }
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void adicionarItensCardapioNaTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        for (Item itemCardapio : this.cardapio) {
            modelo.addRow(new Object[] {
                itemCardapio.getNome(),
                itemCardapio.getTipo(),
                itemCardapio.getPreco()
            });
        }
    }
    
    public int adicionarItensPedidoNaTabela(Cliente cliente, List<ItemPedido> itens){
        List<ItemPedido> itensCopiados = new ArrayList<>(itens);
        Pedido novoPedido = new Pedido((numero_de_pedidos + 1), itensCopiados, cliente);
        numero_de_pedidos++;
        this.pedidos.add(novoPedido);
        return novoPedido.getId();
    }
}


