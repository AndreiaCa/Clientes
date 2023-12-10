
package com.projetoClientes.model;


public class vendedor {
     private String id ; 
    private String nome ; 
    private String telefone ; 
    private String endereco ; 
    private String cidade; 
    private String estado ;
    private String cpf;
    private double salario;
    private int codigo;

    public vendedor(String id, String nome, String telefone, String endereco, String cidade, String estado, String cpf, double salario,int codigo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.salario = salario;
        this.codigo= codigo;
    }
     public vendedor (){
         
     }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   
    
}
