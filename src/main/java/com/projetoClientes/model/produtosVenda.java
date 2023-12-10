
package com.projetoClientes.model;


public class produtosVenda {
     private int id ; 
    vendap vp;
    produto p ; 
    private int qtde ; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public vendap getVp() {
        return vp;
    }

    public void setVp(vendap vp) {
        this.vp = vp;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
}
