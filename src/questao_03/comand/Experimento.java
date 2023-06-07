package questao_03.comand;


import java.util.ArrayList;
import java.util.List;

public class Experimento {
    private List<RoboAction> roboActions;

    public Experimento() {
        this.roboActions = new ArrayList<>();
    }

    public void addAcao(RoboAction acao) {
        roboActions.add(acao);
    }

    public void executaAcoes() {
        for (RoboAction acao : roboActions) {
            acao.execute();
        }
    }
}
