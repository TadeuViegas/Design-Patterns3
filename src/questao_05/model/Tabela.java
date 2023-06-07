package questao_05.model;

import questao_05.tabela.Linha;

import java.util.ArrayList;
import java.util.List;

public class Tabela extends Composite {
    private List<Composite> linhas = new ArrayList<>();

    public void add(Linha linha) {
        linhas.add(linha);
    }
    @Override
    public void imprimi() {
        for (Composite linha : linhas) {
            linha.imprimi();
        }
    }
}