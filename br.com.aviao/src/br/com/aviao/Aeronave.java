package br.com.aviao;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {
    
    private int capacidade;
    private String modelo;
    private long codigoFab;
    private String fabricante;
    private List<Assento> assentos = new ArrayList<>();
    
    // Getters e Setters: 

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getCodigoFab() {
        return codigoFab;
    }

    public void setCodigoFab(long codigoFab) {
        this.codigoFab = codigoFab;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }
    
    // Construtor: 

    public Aeronave(int capacidade, String modelo, long codigoFab, String fabricante) {
        this.capacidade = capacidade;
        this.modelo = modelo;
        this.codigoFab = codigoFab;
        this.fabricante = fabricante;
    }
}
