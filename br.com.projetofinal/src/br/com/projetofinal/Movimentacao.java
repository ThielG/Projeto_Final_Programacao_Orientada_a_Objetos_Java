package br.com.projetofinal;

import java.time.LocalDate;

public class Movimentacao {
    
    private String tipo;
    private LocalDate data;

    public Movimentacao(String tipo, LocalDate data) {
        this.tipo = tipo;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
