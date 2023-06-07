package questao_03.model;

import questao_03.comand.RoboAction;

public class AplicacaoProdutoQuimicoAction implements RoboAction {
    @Override
    public void execute() {
        System.out.println("Aplicando produto químico");
    }
}