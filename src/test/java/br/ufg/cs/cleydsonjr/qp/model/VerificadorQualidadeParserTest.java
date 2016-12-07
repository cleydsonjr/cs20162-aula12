package br.ufg.cs.cleydsonjr.qp.model;

import br.ufg.cs.cleydsonjr.qp.model.relatorio.TipoRelatorio;
import br.ufg.cs.cleydsonjr.qp.model.resultado.ResultadoVerificacaoQualidade;
import br.ufg.cs.cleydsonjr.qp.model.verificacao.VerificadorQualidadeParser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VerificadorQualidadeParserTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void verificacaoRetornaSucessoParaArquivoValido() throws Exception {
        VerificadorQualidadeParser verificador = new VerificadorQualidadeParser();

        String caminhoArquivoTestes = "entrada/entradaTestesValido.txt";
        ResultadoVerificacaoQualidade resultado = verificador.verifiqueQualidade(caminhoArquivoTestes, TipoRelatorio.JSON);

        Assert.assertTrue("Deveria ter retornado sucesso", resultado.isSucesso());
    }

    @Test
    public void calculeValorLancaExececaoParaExpressaoMalFormatada() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Arquivo de entrada inválido");

        VerificadorQualidadeParser verificador = new VerificadorQualidadeParser();
        String caminhoArquivoTestes = "entrada/entradaTestesValido.txt";
        verificador.verifiqueQualidade(caminhoArquivoTestes, TipoRelatorio.JSON);
    }

}