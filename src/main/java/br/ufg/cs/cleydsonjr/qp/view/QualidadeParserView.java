/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr.qp.view;

/**
 * Interface de comunicação com o usuário. Expõe os métodos para iteração.
 */
public interface QualidadeParserView {

    /**
     * Usado para informar o caminho do Relatório gerado de volta para o usuário.
     *
     * @param caminhoRelatorio o caminho do Relatório gerado.
     */
    void informeCaminhoRelatorio(String caminhoRelatorio);

    /**
     * Usado para informa o usuário de um erro ocorrido ao processar a expressão.
     *
     * @param mensagem A mensagem do erro.
     */
    void informeErro(String mensagem);
}
