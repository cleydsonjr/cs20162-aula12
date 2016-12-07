package br.ufg.cs.cleydsonjr.qp.model.resultado;

public class ResultadoVerificacaoQualidadePadrao implements ResultadoVerificacaoQualidade {
    private String caminhoRelatorioGerado;
    private boolean sucesso;

    public ResultadoVerificacaoQualidadePadrao(boolean sucesso, String caminhoRelatorioGerado) {
        this.caminhoRelatorioGerado = caminhoRelatorioGerado;
        this.sucesso = sucesso;
    }

    @Override
    public boolean isSucesso() {
        return sucesso;
    }

    @Override
    public String getCaminhoRelatorioGerado() {
        return caminhoRelatorioGerado;
    }
}
