/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estabelecimento;

import cliente.Cliente;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Pedro Rossi
 */
public class Pedido {
    int id;
    List<ItemPedido> itens;
    Cliente cliente;
    Status status;
    LocalDateTime  horaPedido;

    public Pedido(int id, List<ItemPedido> itens, Cliente cliente) {
        this.id = id;
        this.itens = itens;
        this.status = Status.Em_Preparo;
        this.cliente = cliente;
        this.horaPedido = LocalDateTime.now();
    }

    public LocalDateTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalDateTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente client) {
        this.cliente = client;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public double calcularPedido() {
        double totalPedido = 0.00;
        for (ItemPedido itemPedido : itens) {
            totalPedido += itemPedido.getItem().getPreco() * itemPedido.getQuantidade() ;
        }
        return totalPedido;
    }
}
