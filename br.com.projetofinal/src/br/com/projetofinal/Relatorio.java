package br.com.projetofinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Relatorio {

    private Processo processo;

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    private static final String DIR_USER = System.getProperty("user.home");
    private static final String FILE_NAME = "relatorio.txt";

    public static void gerarRelatorio(Processo processo) {
        
        String caminho = getPathFile();

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(caminho))) {
            
            buffer.write("----------------------------------------------------");
            buffer.newLine();
            buffer.write("--------------------- PROCESSO ---------------------");
            buffer.newLine();
            buffer.write("----------------------------------------------------");
            buffer.newLine();
            buffer.newLine();
            buffer.write("N° do Processo: " + processo.getNumero());
            buffer.newLine();
            buffer.write("Área da ação: " + processo.getAcao());
            buffer.newLine();
            buffer.write("Tipo de processo: " + processo.getTipo());
            buffer.newLine();
            buffer.write("Honorário: R$ " + processo.getHonorario());
            buffer.newLine();
            buffer.newLine();
            buffer.write("----------------------------------------------------");
            buffer.newLine();
            buffer.write("---------------------- Partes ----------------------");
            buffer.newLine();
            buffer.write("----------------------------------------------------");
            buffer.newLine();
            buffer.newLine();

            if (processo.getAdvogado() instanceof Advogado) {
            Advogado ad = (Advogado)processo.getAdvogado();
            buffer.write("Advogado Responsável: " + ad.getNome() + " " + ad.getSobrenome());
            buffer.newLine();
            buffer.write("Número OAB: " + ad.getOab());
            }

            buffer.newLine();
            buffer.write("Nome do cliente: " + processo.getCliente().getNome());
            buffer.newLine();

            if (processo.getCliente() instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica)processo.getCliente();
            buffer.write("Sobrenome do cliente: " + pf.getSobrenome());
            buffer.newLine();
            buffer.write("CPF do cliente: " + pf.getCpf());
            } if (processo.getCliente() instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica)processo.getCliente();
            buffer.write("CNPJ do cliente: " + pj.getCnpj());
            }

            buffer.newLine();
            buffer.write("Parte contrária: " + processo.getParte().getNome());
            buffer.newLine();

            if (processo.getParte() instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica)processo.getParte();
            buffer.write("Sobrenome da parte: " + pf.getSobrenome());
            buffer.write("CPF da parte: " + pf.getCpf());
            } if (processo.getParte() instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica)processo.getParte();
            buffer.write("CNPJ da parte: " + pj.getCnpj());
            buffer.newLine();
            }

            buffer.newLine();
            buffer.write("----------------------------------------------------");
            buffer.newLine();
            buffer.write("------------------- Movimentações ------------------");
            buffer.newLine();
            buffer.write("----------------------------------------------------");
            buffer.newLine();
            buffer.newLine();
            
            for (Movimentacao movimentacao : processo.getMovimentacoes()) {
                String mov = movimentacao.getTipo() + movimentacao.getData() + "\n";
                buffer.write(mov);
                }

            buffer.flush();

            System.out.println("Relatório foi gerado com sucesso!");
        
            } catch (IOException e){
            
                System.out.println("Ocorreu um erro ao escrever o arquivo: " + e.getMessage());
            }
        }

    private static String getPathFile(){
        
        return DIR_USER + File.separator + FILE_NAME;
    }
}
