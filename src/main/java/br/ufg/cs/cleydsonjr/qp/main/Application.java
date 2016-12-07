/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr.qp.main;

import br.ufg.cs.cleydsonjr.qp.controller.QualidadeParserController;
import br.ufg.cs.cleydsonjr.qp.model.verificacao.VerificadorQualidade;
import br.ufg.cs.cleydsonjr.qp.model.verificacao.VerificadorQualidadeParser;
import br.ufg.cs.cleydsonjr.qp.view.QualidadeParserView;
import br.ufg.cs.cleydsonjr.qp.view.console.QualidadeParserConsoleView;

/**
 * Classe principal para execução do programa.
 */
public final class Application {

    private Application() {
    }

    /**
     * @param args Argumentos de inicio da aplicação. Pode receber uma expressão.
     */
    public static void main(final String[] args) {
        // Instancia as implementações padrões
        VerificadorQualidade verificadorQualidadeParser = new VerificadorQualidadeParser();
        QualidadeParserView qualidadeView = new QualidadeParserConsoleView(System.out);

        // Cria o controller injetando as dependências
        QualidadeParserController controller = new QualidadeParserController(verificadorQualidadeParser, qualidadeView);

        // Obtem o caminho do arquivo de testes informado
        String caminhoArquivosTestes = null;
        if (args.length > 0) {
            caminhoArquivosTestes = args[0];
        }

        int status = controller.executeVerificacao(caminhoArquivosTestes, null);

        System.exit(status);
    }
}
