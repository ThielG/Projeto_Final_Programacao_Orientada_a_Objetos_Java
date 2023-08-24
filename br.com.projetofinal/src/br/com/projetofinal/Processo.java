package br.com.projetofinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Processo {
    
    private String numero;
    private String tipo;
    private double honorario;
    private Acao acao;
    private List<Movimentacao> movimentacoes = new ArrayList<>();
    private List<Pessoa> clientes = new ArrayList<>();
    private List<Pessoa> partes = new ArrayList<>();
    private Pessoa advogado;
    private Pessoa cliente;
    private Pessoa parte;
    private boolean arquivado;
    
    public Processo(String numero, Acao acao, String tipo, Pessoa advogado, double honorario, Pessoa cliente, Pessoa parte) {
        this.numero = numero;
        this.acao = acao;
        this.tipo = tipo;
        this.advogado = advogado;
        this.honorario = honorario;
        this.cliente = cliente;
        this.parte = parte;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getHonorario() {
        return honorario;
    }
    
    public void setHonorario(double honorario) {
        this.honorario = honorario;
    }
    
    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public Pessoa getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Pessoa advogado) {
        this.advogado = advogado;
    }
    
    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getParte() {
        return parte;
    }

    public void setParte(Pessoa parte) {
        this.parte = parte;
    }

    public List<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(List<Pessoa> clientes) {
        this.clientes = clientes;
    }

    public List<Pessoa> getPartes() {
        return partes;
    }

    public void setPartes(List<Pessoa> partes) {
        this.partes = partes;
    }

    public boolean isArquivado() {
        return arquivado;
    }

    public void setArquivado(boolean arquivado) {
        this.arquivado = arquivado;
    }

    public void arquivarProcesso() {
        arquivado = true;
    }

    private boolean existeCliente(Pessoa pessoa) {
        return clientes.contains(pessoa);
    }

    private boolean existeParte(Pessoa pessoa) {
        return partes.contains(pessoa);
    }

    public void adicionarCliente(Pessoa cliente) {
        if (!existeCliente(cliente) && !existeParte(cliente)) {
            clientes.add(cliente);
        } else {
            System.out.println("ATENÇÃO: O cliente já está cadastrado como parte.");
        }
    }

    public void adicionarParte(Pessoa parte) {
        if (!existeCliente(parte) && !existeParte(parte)) {
            partes.add(parte);
        } else {
            System.out.println("ATENÇÃO: A parte já está cadastrada como cliente.");
        }
    }

    public void adicionarMovimentacao(String tipo, LocalDate data) throws Exception {
        if (arquivado == false) {
            if (honorario > 0) {
                Movimentacao movimentacao = new Movimentacao(tipo, data);
                movimentacoes.add(movimentacao);
            } else {
                throw new Exception("Honorários não foram pagos, não será possível adicionar movimentações ao processo.");
            }
        } if (arquivado == true) {
            throw new Exception("O processo está arquivado, não é possível adicionar movimentações.");
        }
    }

    public void imprimirMovimentacao(){
        System.out.println("--------------------------------------------------");
        System.out.println("Movimentações: ");
        System.out.println("");

        for (Movimentacao movimentacao : movimentacoes) {
            System.out.println(movimentacao.getTipo() + movimentacao.getData());
        }
        System.out.println("--------------------------------------------------");
        System.out.println("");
    }

    public void imprimirProcesso() {
        System.out.println("--------------------------------------------------");
        System.out.println("Processo: ");
        System.out.println("");
        System.out.println("Número do processo: " + numero);
        System.out.println("Área da ação: " + acao);
        System.out.println("Tipo do processo: " + tipo);
        System.out.println("Processo arquivado: " + arquivado);
        
        if (advogado instanceof Advogado) {
            Advogado ad = (Advogado)advogado;
            System.out.println("Advogado Responsável: " + ad.getNome() + " " + ad.getSobrenome());
            System.out.println("Número OAB: " + ad.getOab());
        }
 
        System.out.println("Honorário: " + honorario);
        System.out.println("Nome do cliente: " + cliente.getNome());
        
        if (cliente instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica)cliente;
            System.out.println("Sobrenome do cliente: " + pf.getSobrenome());
            System.out.println("CPF do cliente: " + pf.getCpf());
        } if (cliente instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica)cliente;
            System.out.println("CNPJ do cliente: " + pj.getCnpj());
        }
        
        System.out.println("Parte contrária: " + parte.getNome());
        
        if (parte instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica)parte;
            System.out.println("Sobrenome da parte: " + pf.getSobrenome());
            System.out.println("CPF da parte: " + pf.getCpf());
        } if (parte instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica)parte;
            System.out.println("CNPJ da parte: " + pj.getCnpj());
        }

        System.out.println("--------------------------------------------------");
        System.out.println("");
    }
}
