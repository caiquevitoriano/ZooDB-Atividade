/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.jdo.Extent;
import org.zoodb.api.impl.ZooPC;

/**
 *
 * @author caique
 */
public class Pedido extends ZooPC {

    private int codigo;
    private Cliente cliente;
    private Set<ItemPedido> itens = new HashSet<ItemPedido>();

    @SuppressWarnings("unused")
    public Pedido() {

    }

    public Pedido(int i, PessoaJuridica cliente1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        zooActivateRead();
        return codigo;
    }

    public void setCodigo(int codigo) {
        zooActivateWrite();
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        zooActivateRead();
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        zooActivateWrite();
        this.cliente = cliente;
    }

    public Set<ItemPedido> getItens() {
        return itens; 
    }

    public void addItens(ItemPedido item) {
        zooActivateWrite();
        itens.add(item);
    }

    public float calcularTotal() {
        zooActivateRead();
        float total = 0;

        for (ItemPedido item : itens) {
            total += item.calculaSubtotal();
        }

        return total;
    }

}
