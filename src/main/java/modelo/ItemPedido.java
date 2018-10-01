/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.zoodb.api.impl.ZooPC;

/**
 *
 * @author caique
 */
public class ItemPedido extends ZooPC {

    private int codigo;
    private int quantidade;
    private Produto produto;

    @SuppressWarnings("unused")
    public ItemPedido() {

    }

    public int getCodigo() {
        zooActivateRead();
        return codigo;
    }

    public void setCodigo(int codigo) {
        zooActivateWrite();
        this.codigo = codigo;
    }

    public int getQuantidade() {
        zooActivateRead();
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        zooActivateWrite();
        this.quantidade = quantidade;
    }

    public float calculaSubtotal() {

       return (produto.getPreco() * quantidade);

    }

}
