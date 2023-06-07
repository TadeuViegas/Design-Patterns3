package questao_01;

import questao_01.adapter.AdaptadorSomador;
import questao_01.model.Cliente;
import questao_01.model.SomadorExistente;

public class Main {
//    Padrão Adapter
    public static void main(String[] args) {
        //cliente usa o adptador para somar inteiros de uma lista em vez de um vetor
        SomadorExistente somadorExistente = new SomadorExistente();
        AdaptadorSomador adaptador = new AdaptadorSomador(somadorExistente);

        Cliente cliente = new Cliente(adaptador);
        cliente.executar();
    }
}
