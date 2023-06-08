package questao_03.model;

import questao_03.comand.RoboAction;

public class RealizacaoInoculacaoAction implements RoboAction {
    @Override
    public void execute() {
        System.out.println("Relizando Inoculação com tecnicas de pipetagem");
    }
}
