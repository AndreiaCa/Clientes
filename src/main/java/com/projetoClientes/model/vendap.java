
package com.projetoClientes.model;


public class vendap {
     private int id ; 
    private String observacao;
   public vendedor v ; 
     public empresas e ; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public void vendaPerdida(int idP){
       vendap perdida = new vendap ();
       
       perdida.setId(idP);
    }
}
