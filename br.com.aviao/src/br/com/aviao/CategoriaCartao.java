package br.com.aviao;

public enum CategoriaCartao {
    
    GOLD ("Gold"),
    SILVER ("Silver"),
    NORMAL ("Normal");
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private CategoriaCartao(String nome) {
        this.nome = nome;
    }  
}
