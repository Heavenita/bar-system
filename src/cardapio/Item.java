/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardapio;

/**
 *
 * @author Pedro Rossi
 */
public abstract class Item {
    private String nome;
    private Double preco;
    private String tipo;
    
    public Item(String nome, Double preco, String tipo){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String toString() {
    return nome + " - R$ " + String.format("%.2f", preco);
}
}
