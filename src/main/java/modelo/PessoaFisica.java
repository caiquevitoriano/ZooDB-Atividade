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
public class PessoaFisica extends Cliente{
    
    private String cpf;

    @SuppressWarnings("unused")
    public PessoaFisica() {
        
    }

    public String getCpf() {
        zooActivateRead();
        return cpf;
    }

    public void setCpf(String cpf) {
        zooActivateWrite();
        this.cpf = cpf;
    }
    
    
    
    
    
    
}
