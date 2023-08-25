package br.com.aviao;

public class CartaoFidelidade {
    
    private String numero;
    private long minhasAcumuladas;
    private CategoriaCartao categoria; 

    // Getters e Setters:
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public long getMinhasAcumuladas() {
        return minhasAcumuladas;
    }

    public void setMinhasAcumuladas(long minhasAcumuladas) {
        this.minhasAcumuladas = minhasAcumuladas;
    }

    public CategoriaCartao getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCartao categoria) {
        this.categoria = categoria;
    }

    // Construtor: 

    public CartaoFidelidade(String numero, long minhasAcumuladas, CategoriaCartao categoria) {
        this.numero = numero;
        this.minhasAcumuladas = minhasAcumuladas;
        this.categoria = categoria;
    }
}
