package br.ufg.cs.cleydsonjr.qp.controller;

import br.ufg.cs.cleydsonjr.qp.model.verificacao.VerificadorQualidade;
import br.ufg.cs.cleydsonjr.qp.model.verificacao.VerificadorQualidadeParser;
import br.ufg.cs.cleydsonjr.qp.view.QualidadeParserView;
import br.ufg.cs.cleydsonjr.qp.view.console.QualidadeParserConsoleView;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class QualidadeParserControllerTest {

    @Test
    public void executeAplicacaoInformandoDiretamenteExpressaoValida() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream saidaPadrao = new PrintStream(out);

        VerificadorQualidade verificadorQualidade = new VerificadorQualidadeParser();
        QualidadeParserView calcularView = new QualidadeParserConsoleView(saidaPadrao);

        QualidadeParserController controller = new QualidadeParserController(verificadorQualidade, calcularView);
        int status = controller.executeVerificacao("entrada/exemploEntradaTestes.txt", null);

        String saida = new String(out.toByteArray(), StandardCharsets.UTF_8);

        Assert.assertEquals(0, status);
        Assert.assertEquals("Relatório gerado disponível em: relatorio.json\n", saida);
    }

}