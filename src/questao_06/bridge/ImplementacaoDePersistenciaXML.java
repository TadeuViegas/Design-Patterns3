package questao_06.bridge;

public class ImplementacaoDePersistenciaXML implements ImplementacaoDePersistencia {
    @Override
    public void persiste(String conteudo) {
        System.out.println("Persistindo em XML " + conteudo);
    }
}
