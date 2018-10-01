/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author caique
 */
public class PessoaJuridica extends Cliente{
    
    private String cnpj;
    private float limiteCredido;

    @SuppressWarnings("unused")
    public PessoaJuridica() {
        
    }

    public String getCnpj() {
        zooActivateRead();
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        zooActivateWrite();
        this.cnpj = cnpj;
    }

    public float getLimiteCredido() {
        zooActivateRead();
        return limiteCredido;
    }

    public void setLimiteCredido(float limiteCredido) {
        zooActivateWrite();
        this.limiteCredido = limiteCredido;
    }
    
    
    
}
