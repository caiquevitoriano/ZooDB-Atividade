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
public class Cliente extends ZooPC {

    private int codigo;
    private String nome;
    

    @SuppressWarnings("unused")
    public Cliente() {

    }

    public int getCodigo() {
        zooActivateRead();
        return codigo;
    }

    public void setCodigo(int codigo) {
        zooActivateWrite();
        this.codigo = codigo;
    }

    public String getNome() {
        zooActivateRead();
        return nome;
    }

    public void setNome(String nome) {
        zooActivateWrite();
        this.nome = nome;
    }

}
