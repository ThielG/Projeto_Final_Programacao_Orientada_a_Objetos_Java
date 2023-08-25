package br.com.aviao;

public class Bilhete {
    
    private Passageiro passageiro;
    private Reserva reserva;
    private Assento assento;
    private Voo voo;

    // Getters e Setters:
    
    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    // Construtor:

    public Bilhete(Reserva reserva, Assento assento) {
        this.reserva = reserva;
        this.assento = assento;
        this.passageiro = reserva.getPassageiro();
        this.voo = reserva.getVoo();
    }   
}
