package br.com.aviao;

public class Assento {
    
    private String posicao;

    // Getters e Setters:
    
    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    // Construtor:
    
    public Assento(String posicao) {
        this.posicao = posicao;
    }   
}
