package br.com.aviao;

import java.time.LocalDate;

public class Reserva {
    
    private int codigo;
    private LocalDate data;
    private LocalDate dataLimite;
    private FormaPagamento formaPagamento;
    private StatusReserva status;
    private Voo voo;
    private Passageiro passageiro;
    
    // Getters e Setters: 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    // Construtor:

    public Reserva(int codigo, LocalDate data, LocalDate dataLimite, FormaPagamento formaPagamento, StatusReserva status, Voo voo, Passageiro passageiro) {
        this.codigo = codigo;
        this.data = data;
        this.dataLimite = dataLimite;
        this.formaPagamento = formaPagamento;
        this.status = status;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    // Poderia ter um try catch aqui para conferir se a data é menor que dataLimite.
    
}
