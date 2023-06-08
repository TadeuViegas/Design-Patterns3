package questao_06.model;


import questao_06.bridge.ImplementacaoDePersistencia;

public class Carro extends ClasseNegocio {
    public Carro(ImplementacaoDePersistencia persistencia) {
        super(persistencia);
    }

    @Override
    public String toString() {
        return "\nOutput: Atributos do CARRO em 2 tipos de formato: XML ou JSON";
    }

    @Override
    public void persiste() {
        String conteudo = toString();
        persistencia.persiste(conteudo);
    }
}
