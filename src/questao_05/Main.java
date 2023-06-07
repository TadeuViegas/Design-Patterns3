package questao_05;

import questao_05.model.Tabela;
import questao_05.tabela.Celula;
import questao_05.tabela.Linha;

public class Main {
    //Padrão Composite
    public static void main(String[] args) {
        Tabela tabela = new Tabela();

        Linha linha1 = new Linha();
        linha1.add(new Celula("String (15)"));
        linha1.add(new Celula("String (15)"));
        linha1.add(new Celula("String (15)"));
        linha1.add(new Celula("String (15)"));
        linha1.add(new Celula("String (15)"));
        tabela.add(linha1);

        Linha linha2 = new Linha();
        linha2.add(new Celula("String (15)"));
        linha2.add(new Celula("String (15)"));
        linha2.add(new Celula("String (15)"));
        linha2.add(new Celula("String (15)"));
        linha2.add(new Celula("String (15)"));
        tabela.add(linha2);

        Linha linha3 = new Linha();
        linha3.add(new Celula("String (15)"));
        linha3.add(new Celula("String (15)"));
        linha3.add(new Celula("String (15)"));
        linha3.add(new Celula("String (15)"));
        linha3.add(new Celula("String (15)"));
        tabela.add(linha3);

        System.out.println("----------------------------- TABELA ----------------------------- ");
        tabela.imprimi();
    }
}

