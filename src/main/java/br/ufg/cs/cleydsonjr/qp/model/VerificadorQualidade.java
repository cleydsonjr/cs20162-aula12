/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr.qp.model;

/**
 * Interface que expõe a regra de negócio do programa.
 */
@FunctionalInterface
public interface VerificadorQualidade {

    /**
     * Expõe a lógica para verificação de qualidade do parser através de um arquivo informado.
     *
     * @param caminhoArquivoTestes O caminho do arquivo contendo as expressões para teste.
     * @param tipoRelatorio        O tipo de relatório a ser gerado.
     * @return O resultado da verificação
     */
    ResultadoVerificacaoQualidade verifiqueQualidade(String caminhoArquivoTestes, TipoRelatorio tipoRelatorio);
}
