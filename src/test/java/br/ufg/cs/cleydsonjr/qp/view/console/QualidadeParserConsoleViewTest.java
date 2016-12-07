package br.ufg.cs.cleydsonjr.qp.view.console;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class QualidadeParserConsoleViewTest {

    @Test
    public void informeCaminhoRelatorioCorretamenteParaUsuario() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream saidaPadrao = new PrintStream(out);

        QualidadeParserConsoleView view = new QualidadeParserConsoleView(saidaPadrao);

        view.informeCaminhoRelatorio("/caminho/para/relatorio");
        String saida = new String(out.toByteArray(), StandardCharsets.UTF_8);
        Assert.assertEquals("A mesagem com caminho informada não foi correta", "Relatório gerado disponível em: /caminho/para/relatorio\n", saida);
    }

    @Test
    public void informeErroImprimeErroCorretamente() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream saidaPadrao = new PrintStream(out);

        QualidadeParserConsoleView view = new QualidadeParserConsoleView(saidaPadrao);

        view.informeErro("Mensagem de erro");
        String saida = new String(out.toByteArray(), StandardCharsets.UTF_8);
        Assert.assertEquals("O erro informado não foi correto", "Mensagem de erro\n", saida);
    }

}