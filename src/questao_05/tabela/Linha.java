package questao_05.tabela;

import questao_05.model.Composite;

import java.util.ArrayList;
import java.util.List;

public class Linha extends Composite {
    private List<Composite> celulas = new ArrayList<>();

    public void add(Celula celula) {
        celulas.add(celula);
    }

    @Override
    public void imprimi() {
        System.out.println("|");
        for (Composite celula : celulas) {
            celula.imprimi();
        }
        System.out.println("|");
    }
}
