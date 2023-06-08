package questao_06.bridge;

public class ImplementacaoDePersistenciaJSON implements ImplementacaoDePersistencia {
    @Override
    public void persiste(String conteudo) {
        System.out.println("Persistindo em JSON " + conteudo);
    }
}

