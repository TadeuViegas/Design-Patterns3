package questao_03;

import questao_03.comand.Experimento;
import questao_03.model.AplicacaoProdutoQuimicoAction;
import questao_03.model.ElevacaoTemperaturaAction;
import questao_03.model.RealizacaoInoculacaoAction;

public class Main {
    public static void main(String[] args) {
        //Padrão Command
        //Robô executa uma única ação
        Experimento robo = new Experimento();
        Experimento robo2 = new Experimento();

        // Um objeto do tipo experimento pode guardar uma lista de açoes
        robo.addAcao(new RealizacaoInoculacaoAction());
        robo.addAcao(new ElevacaoTemperaturaAction());
        robo.addAcao(new AplicacaoProdutoQuimicoAction());

        robo2.addAcao(new AplicacaoProdutoQuimicoAction());
        robo2.addAcao(new ElevacaoTemperaturaAction());
        robo2.addAcao(new RealizacaoInoculacaoAction());

        // Um robo executa uma serie de açoes
        System.out.println("--------- Açoes Robo1 -----------");
        robo.executaAcoes();
        System.out.println();
        System.out.println("--------- Açoes Robo2 -----------");
        robo2.executaAcoes();
    }
}