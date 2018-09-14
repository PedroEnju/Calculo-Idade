package br.com.pedroenju.model;

public class Idade {

    private int anoNasc;
    private int anoAtual;

    public int getIdade() {
        return (this.anoAtual - this.anoNasc);
    }
            
    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
    
}
