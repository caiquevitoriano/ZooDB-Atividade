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
public class Produto extends ZooPC {

    private int codigo;
    private String descricao;
    private float preco;

    @SuppressWarnings("unused")
    public Produto() {

    }

    public Produto(int i, String computador, int i0) {
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

    public String getDescricao() {
        zooActivateRead();
        return descricao;
    }

    public void setDescricao(String descricao) {
        zooActivateWrite();
        this.descricao = descricao;
    }

    public float getPreco() {
        zooActivateRead();
        return preco;
    }

    public void setPreco(float preco) {
        zooActivateWrite();
        this.preco = preco;
    }

}
