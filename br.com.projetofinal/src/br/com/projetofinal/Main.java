package br.com.projetofinal;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Pessoa advogado1 = new Advogado("Guilherme", "Thiel", "SC - 0001");
        Pessoa advogado2 = new Advogado("Jojo", "Toddynho", "SC - 0002");
        
        Pessoa cliente1 = new PessoaFisica("Josevaldo", "Martelinho", "111.111.111-11");
        Pessoa parte1 = new PessoaJuridica("Prego Empreendimentos Ltda.", "11.111.111/0001-11");

        Pessoa cliente2 = new PessoaJuridica("Bar do Serjão Ltda.", "22.222.222/0002-22");
        Pessoa parte2 = new PessoaJuridica("Vinícola Tio Serrano S.A.", "33.333.333/0003-33");

        Processo p1 = new Processo("1111111-11.2023.1.11.1111", Acao.CIVIL, "Execução de título extrajudicial", advogado1, 3600.00, cliente1, parte1);
        Processo p2 = new Processo("2222222-22.2023.2.22.2222", Acao.EMPRESARIAL, "Concorrência desleal", advogado2, 0, cliente2, parte2);

        p1.adicionarCliente(cliente1);
        p1.adicionarParte(parte1);
        
        p2.adicionarCliente(cliente2);
        p2.adicionarParte(parte2);

        //p1.adicionarCliente(parte1);
        //p1.adicionarParte(cliente1);

        try {
            LocalDate data = LocalDate.of(2023, Month.JUNE, 24);
            p1.adicionarMovimentacao("Petição inicial - ", data);
            LocalDate data1 = LocalDate.of(2023, Month.JUNE, 26);
            p1.adicionarMovimentacao("Juntada de provas - ", data1);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        p2.arquivarProcesso();

        try {
            LocalDate data = LocalDate.of(2023, Month.JUNE, 26);
            p2.adicionarMovimentacao("Petição inicial - ", data);
            LocalDate data1 = LocalDate.of(2023, Month.JUNE, 28);
            p2.adicionarMovimentacao("Juntada de rol de testemunhas - ", data1);
            LocalDate data2 = LocalDate.of(2023, Month.JUNE, 30);
            p2.adicionarMovimentacao("Consulta ao Bacen - ", data2);
            LocalDate data3 = LocalDate.of(2023, Month.JULY, 06);
            p2.adicionarMovimentacao("Pedido de arresto de bens - ", data3);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        //p1.imprimirProcesso();
        //p1.imprimirMovimentacao();

        //p2.imprimirProcesso();
        //p2.imprimirMovimentacao();
        
        //Relatorio.gerarRelatorio(p1);
        //Relatorio.gerarRelatorio(p2);
    }
}
