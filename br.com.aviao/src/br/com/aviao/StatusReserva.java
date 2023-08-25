package br.com.aviao;

public enum StatusReserva {
    
    CONFIRMADA ("Confirmada"),
    EM_LISTA ("Em lista"),
    EM_ABERTO ("Em aberto");
    
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private StatusReserva(String status) {
        this.status = status;
    }
}
