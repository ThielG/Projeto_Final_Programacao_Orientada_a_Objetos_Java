package br.com.aviao;

import java.time.LocalDate;

public class Voo {
    
    private int numero;
    private int duracao;
    private LocalDate date;
    private double precoBase;
    private int milhas;
    private Cidade origem;
    private Cidade destino;
    private Aeronave aeronave;
    
    // Getters e Setters: 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public int getMilhas() {
        return milhas;
    }

    public void setMilhas(int milhas) {
        this.milhas = milhas;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    // Construtor: 

    public Voo(int numero, int duracao, LocalDate date, double precoBase, int milhas, Cidade origem, Cidade destino, Aeronave aeronave) {
        this.numero = numero;
        this.duracao = duracao;
        this.date = date;
        this.precoBase = precoBase;
        this.milhas = milhas;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }  
}
