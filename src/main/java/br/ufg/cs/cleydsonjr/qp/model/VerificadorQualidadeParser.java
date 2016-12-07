/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr.qp.model;

/**
 * Implementação do calculador de uma expressão, usando a biblioteca "parser".
 */
public class VerificadorQualidadeParser implements VerificadorQualidade {

    /**
     * Implementaçao da lógica para verificação de qualidade do parser através de um arquivo informado.
     *
     * @param caminhoArquivoTestes O caminho do arquivo contendo as expressões para teste.
     * @param tipoRelatorio        O tipo de relatório a ser gerado.
     * @return O resultado da verificação
     */
    @Override
    public final ResultadoVerificacaoQualidade verifiqueQualidade(final String caminhoArquivoTestes, final TipoRelatorio tipoRelatorio) {
        return new ResultadoVerificacaoQualidadePadrao(true, "relatorio.json");
    }

}
