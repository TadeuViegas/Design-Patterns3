package questao_06.model;


import questao_06.bridge.ImplementacaoDePersistencia;

abstract class ClasseNegocio {
    protected ImplementacaoDePersistencia persistencia;

    public ClasseNegocio(ImplementacaoDePersistencia persistencia) {
        this.persistencia = persistencia;
    }

    public abstract void persiste();
}
