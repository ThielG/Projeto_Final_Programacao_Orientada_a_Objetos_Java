package br.com.projetofinal;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String sobrenome;

    public PessoaFisica(String nome, String sobrenome, String cpf) {
        super(nome);
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
