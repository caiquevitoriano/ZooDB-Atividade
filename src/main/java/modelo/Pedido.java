/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.zoodb.api.impl.ZooPC;

/**
 *
 * @author caique
 */
public class Pedido extends ZooPC {

    private int codigo;
    private Cliente cliente;
    private List<ItemPedido> itens;
    

    @SuppressWarnings("unused")
    public Pedido() {
        
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

    public List<ItemPedido> getItens() {
        zooActivateRead();
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        zooActivateWrite();
        this.itens = itens;
    }   
    
    
    public float calcularTotal(){
        return 0;
        
            
            
            
 
    }
    
    

}
