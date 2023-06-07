package questao_01.model;

public class Cliente {
    private SomadorEsperado somador;

    public Cliente(SomadorEsperado somadorEsperado) {
        this.somador = somadorEsperado;
    }

    public void executar() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int soma = somador.somaVetor(vetor);
        System.out.println("Resultado: " + soma);
    }
}
