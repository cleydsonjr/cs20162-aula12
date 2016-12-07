/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr.qp.view.console;

import br.ufg.cs.cleydsonjr.qp.view.QualidadeParserView;

import java.io.PrintStream;

/**
 * Implementação da camada de visão usando o console para iteração com o usuário.
 */
public class QualidadeParserConsoleView implements QualidadeParserView {
    /**
     * Saída padrão para iteração com o usuário.
     */
    private PrintStream saida;

    /**
     * Construtor que monta a classe auxiliar.
     *
     * @param saidaPadrao O PrintStream padrão de saída.
     */
    public QualidadeParserConsoleView(final PrintStream saidaPadrao) {
        this.saida = saidaPadrao;
    }

    /**
     * Imprime o caminho do Relatório gerado de volta para o usuário.
     *
     * @param caminhoRelatorio o caminho do Relatório gerado.
     */
    @Override
    public final void informeCaminhoRelatorio(final String caminhoRelatorio) {
        saida.println("Relatório gerado disponível em: " + caminhoRelatorio);
    }

    /**
     * Imprime o erro ocorrido para o usuário.
     *
     * @param mensagem o resultado da expressão.
     */
    @Override
    public final void informeErro(final String mensagem) {
        saida.println(mensagem);
    }
}
