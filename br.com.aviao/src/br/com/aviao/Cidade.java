package br.com.aviao;

public class Cidade {
    
    private int gmt;
    private String nome;
    private int codigoAeroporto;
    private String pais;  

    // Getters e Setters:
    
    public int getGmt() {
        return gmt;
    }

    public void setGmt(int gmt) {
        this.gmt = gmt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoAeroporto() {
        return codigoAeroporto;
    }

    public void setCodigoAeroporto(int codigoAeroporto) {
        this.codigoAeroporto = codigoAeroporto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Construtor: 
    
    public Cidade(int gmt, String nome, int codigoAeroporto, String pais) {
        this.gmt = gmt;
        this.nome = nome;
        this.codigoAeroporto = codigoAeroporto;
        this.pais = pais;
    } 
}
