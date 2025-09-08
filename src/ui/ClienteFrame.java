/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cardapio.Bebida;
import cardapio.Item;
import cardapio.Lanche;
import cardapio.Sobremesa;
import cliente.Cliente;
import estabelecimento.Estabelecimento;
import estabelecimento.ItemPedido;
import estabelecimento.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Pedro Rossi
 */
public class ClienteFrame extends javax.swing.JFrame {
    private Cliente cliente;
    private Estabelecimento estabelecimento;
    private List<Item> cardapio;
    
    public ClienteFrame(Cliente cliente, Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
        this.cliente = cliente;
        
        
        initComponents();
        this.cardapio = new ArrayList<>();
        
        // Bebidas
        cardapio.add(new Bebida("Coca-cola", 10.00, "Bebida"));
        cardapio.add(new Bebida("Fanta Uva", 9.00, "Bebida"));
        cardapio.add(new Bebida("Fanta Laranja", 9.00, "Bebida"));

        // Lanches
        cardapio.add(new Lanche("Pastel", 12.50, "Lanche"));
        cardapio.add(new Lanche("Enroladinho", 6.00, "Lanche"));
        cardapio.add(new Lanche("X Salada", 25.00, "Lanche"));
        
        // Sobremesa
        cardapio.add(new Sobremesa("Pudim", 10.50, "Sobremesa"));
        cardapio.add(new Sobremesa("Torta de Bolacha", 12.00, "Sobremesa"));
        cardapio.add(new Sobremesa("Bolo de morango", 18.00, "Sobremesa"));
        
        estabelecimento.setCardapio(cardapio);
        estabelecimento.adicionarItensCardapioNaTabela(tableItemCardapio);
        
        labelClienteNome.setText(cliente.getNome());
    }
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteFrame.class.getName());
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableItemCardapio = new javax.swing.JTable();
        labelCardapio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelClienteNome = new javax.swing.JLabel();
        scrollPedido = new javax.swing.JScrollPane();
        listPedido = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        spinnerQuantidade = new javax.swing.JSpinner();
        buttonCadastrarItem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buttonFinalizarPedido = new javax.swing.JButton();
        buttonRemoverItem = new javax.swing.JButton();
        labelValor = new javax.swing.JLabel();
        labelValorTotal = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableItemCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableItemCardapio.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableItemCardapio);

        labelCardapio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelCardapio.setText("Cardapio");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cliente:");

        labelClienteNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        listPedido.setModel(new DefaultListModel<>());
        listPedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPedido.setViewportView(listPedido);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Pedido");

        spinnerQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        buttonCadastrarItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonCadastrarItem.setText("Cadastrar item");
        buttonCadastrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarItemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Quantidade:");

        buttonFinalizarPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonFinalizarPedido.setText("Finalizar pedido");
        buttonFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarPedidoActionPerformed(evt);
            }
        });

        buttonRemoverItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonRemoverItem.setText("Limpar item");
        buttonRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverItemActionPerformed(evt);
            }
        });

        labelValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelValor.setText("Valor:  R$");

        labelValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelValorTotal.setText("0.0");

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastrarItem))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonVoltar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrollPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonFinalizarPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonRemoverItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 935, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(labelCardapio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonVoltar)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCardapio)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPedido)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(buttonCadastrarItem))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(buttonFinalizarPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRemoverItem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarItemActionPerformed

        int linha = tableItemCardapio.getSelectedRow();

        if (linha != -1) {
            String item = (spinnerQuantidade.getValue().toString() + " | " + tableItemCardapio.getValueAt(linha, 0).toString()).trim();
            DefaultListModel<String> model = (DefaultListModel<String>) listPedido.getModel();
            Double total = Double.parseDouble(labelValorTotal.getText().replace(",", "."));
            model.addElement(item);
        
            int quantidade = (Integer)spinnerQuantidade.getValue();
            Double valor = (Double) tableItemCardapio.getValueAt(linha, 2);
            total += quantidade*valor;
            labelValorTotal.setText(String.format("%.2f", total));
        } else {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada.");
        }
    }//GEN-LAST:event_buttonCadastrarItemActionPerformed
    
    private Item buscarItemPorNome(String nome) {
        for (Item i : cardapio) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }
    
    private void buttonFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizarPedidoActionPerformed

        if (((DefaultListModel<?>) listPedido.getModel()).getSize() == 0) {
        JOptionPane.showMessageDialog(this, "O pedido está vazio. Adicione itens antes de cadastrar.");
        return;
        }

        if (cliente.getNome().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite seu nome.");
            return;
        }

        ListModel<String> model = listPedido.getModel();
        
        List<ItemPedido> listaPedido = new ArrayList<>();

        for (int i = 0; i < model.getSize(); i++) {
            String texto = model.getElementAt(i); // ex: "2 | Coca-cola"

            String[] partes = texto.split("\\|");
            if (partes.length != 2) {
                System.out.println("Formato inválido do item no pedido: " + texto);
                continue;
            }   

            int quantidade;
            try {
                quantidade = Integer.parseInt(partes[0].trim());
            } catch (NumberFormatException e) {
                System.out.println("Quantidade inválida no item: " + texto);
            continue;
            }

            String nomeItem = partes[1].trim();

            Item item = buscarItemPorNome(nomeItem);
            if (item == null) {
                System.out.println("Item não encontrado no cardápio: " + nomeItem);
                continue;
            }

            ItemPedido itemPedido = new ItemPedido(item, quantidade);
            listaPedido.add(itemPedido);
        }

        estabelecimento.adicionarItensPedidoNaTabela(cliente, listaPedido);
        
        DefaultListModel modelo = (DefaultListModel) listPedido.getModel();
        modelo.clear();
        
        labelValorTotal.setText("0,0");
        
            // Para testar, imprimir os pedidos
        for (Pedido p : estabelecimento.getPedidos()) {
            System.out.println(p.getItens());
        }  
        
        
    }//GEN-LAST:event_buttonFinalizarPedidoActionPerformed

    private void buttonRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverItemActionPerformed
        DefaultListModel<String> model = (DefaultListModel<String>) listPedido.getModel();
    
    // Pega o índice do item selecionado
    int indice = listPedido.getSelectedIndex();

    // Verifica se há seleção
    if (indice != -1) {
        model.removeElementAt(indice); // Remove o item da posição selecionada
    } else {
        JOptionPane.showMessageDialog(this, "Nenhum item selecionado para remover.");
    }
    }//GEN-LAST:event_buttonRemoverItemActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        new RestauranteFrame(estabelecimento).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarItem;
    private javax.swing.JButton buttonFinalizarPedido;
    private javax.swing.JButton buttonRemoverItem;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCardapio;
    private javax.swing.JLabel labelClienteNome;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JList<String> listPedido;
    private javax.swing.JScrollPane scrollPedido;
    private javax.swing.JSpinner spinnerQuantidade;
    private javax.swing.JTable tableItemCardapio;
    // End of variables declaration//GEN-END:variables
}
