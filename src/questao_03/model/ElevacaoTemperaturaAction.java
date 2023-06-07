package questao_03.model;

import questao_03.comand.RoboAction;

public class ElevacaoTemperaturaAction implements RoboAction {
    @Override
    public void execute() {
        System.out.println("Elevando a temperatura ambiente");
    }
}
