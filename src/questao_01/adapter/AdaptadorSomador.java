package questao_01.adapter;

import questao_01.model.SomadorEsperado;
import questao_01.model.SomadorExistente;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorSomador implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public AdaptadorSomador(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        //Em vez de vetor, usa uma lista para guardar os valores inteiros
        List<Integer> lista = new ArrayList<>();
        for (int i : vetor) {
            lista.add(i);
        }

        return somadorExistente.somaLista(lista);
    }
}
