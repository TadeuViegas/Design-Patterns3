package questao_01.model;

import java.util.List;

public class SomadorExistente {

    //soma inteiros da uma lista em vez do vetor
    public int somaLista(List<Integer> lista) {
        int resultado = 0;
        for (int i : lista) resultado += i;
        return resultado;
    }
}
