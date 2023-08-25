package br.com.aviao;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    
    private String nome;
    private String sobrenome;
    private boolean vegetariano;
    private CartaoFidelidade cartao;
    private List<Reserva> reservas = new ArrayList<>();

    // Getters e Setters: 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public CartaoFidelidade getCartao() {
        return cartao;
    }

    public void setCartao(CartaoFidelidade cartao) {
        this.cartao = cartao;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    // Construtor: 
    
    public Passageiro(String nome, String sobrenome, boolean vegetariano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.vegetariano = vegetariano;
    }
}
