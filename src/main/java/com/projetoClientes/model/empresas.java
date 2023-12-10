
package com.projetoClientes.model;


public class empresas {
   
    private String id ; 
    private String nome; 
    private String cnpj; 
    private String cidade ;
    private String estado;
    private String telefone; 

   public empresas(String id, String nome, String cnpj, String cidade, String estado, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
    }
    public empresas (){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}


