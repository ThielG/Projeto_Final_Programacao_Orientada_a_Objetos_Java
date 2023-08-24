package br.com.projetofinal;

public class Advogado extends Pessoa {

    private String oab;
    private String sobrenome;

    public Advogado(String nome, String sobrenome, String oab) {
        super(nome);
        this.sobrenome = sobrenome;
        this.oab = oab;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

     public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
}
