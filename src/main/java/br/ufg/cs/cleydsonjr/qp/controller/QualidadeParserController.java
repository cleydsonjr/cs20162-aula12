/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr.qp.controller;

import br.ufg.cs.cleydsonjr.qp.model.ResultadoVerificacaoQualidade;
import br.ufg.cs.cleydsonjr.qp.model.TipoRelatorio;
import br.ufg.cs.cleydsonjr.qp.model.VerificadorQualidade;
import br.ufg.cs.cleydsonjr.qp.view.QualidadeParserView;

/**
 * Controller da aplicação. Contendo o fluxo de execução do projeto.
 */
public class QualidadeParserController {
    /**
     * Instância do calculador de expressões.
     */
    private VerificadorQualidade verificadorQualidade;

    /**
     * Instância do view para comunicação com o usuário.
     */
    private QualidadeParserView qualidadeView;

    /**
     * Construtor que recebe as dependências de lógica e de interface.
     *
     * @param verificadorQualidadePadrao Implementação da regra de negócio.
     * @param qualidadeViewPadrao        Implementação da interface com o usuário.
     */
    public QualidadeParserController(final VerificadorQualidade verificadorQualidadePadrao,
                                     final QualidadeParserView qualidadeViewPadrao) {
        this.verificadorQualidade = verificadorQualidadePadrao;
        this.qualidadeView = qualidadeViewPadrao;
    }

    /**
     * Fluxo principal de execução do programa.
     *
     * @param caminhoArquivoTestes A expressão informada no inicio da execução do programa.
     * @return O número de status para a execução. 0 sucesso para sucesso. 1 para erro.
     */
    public final int executeVerificacao(final String caminhoArquivoTestes, final String flagTipoRelatorio) {
        int statusCode;

        try {
            // Repassa o caminho arquivo e tipo de ralatório para validar
            ResultadoVerificacaoQualidade resultado = verificadorQualidade.verifiqueQualidade(caminhoArquivoTestes, TipoRelatorio.JSON);

            qualidadeView.informeCaminhoRelatorio(resultado.getCaminhoRelatorioGerado());

            if (resultado.isSucesso()) {
                statusCode = 0;
            } else {
                statusCode = 1;
            }
        } catch (IllegalArgumentException ex) {
            // Erro ao tentar processar a verificação de qualidade
            qualidadeView.informeErro(ex.getMessage());
            statusCode = 1;
        }

        return statusCode;
    }
}
